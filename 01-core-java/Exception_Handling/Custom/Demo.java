package Exceptions;

import java.util.Scanner;

class UnderAgeException extends Exception{
    @Override
    public String getMessage(){
        return "You are too young. Have patience!";
    }
}

class OverAgeException extends Exception{
    @Override
    public String getMessage(){
        return "You are too old. Cool down!!";
    }
}

class Applicant{
    private int age;

    public void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        age = sc.nextInt();
    }

    public void validate() throws UnderAgeException, OverAgeException{
        if(age>=18 && age<=60){
            System.out.println("Collect your license");
        }
        else if(age<18){
            UnderAgeException uae = new UnderAgeException();
            System.out.println(uae.getMessage());
            throw uae;
        }
        else{
            OverAgeException oae = new OverAgeException();
            System.out.println(oae.getMessage());
            throw oae;
        }
    }
}

class RTO{
    public void acceptApplicant(){
        Applicant a = new Applicant();

        try{
            a.acceptInput();
            a.validate();
        }
        catch(Exception e){
            try{
                a.acceptInput();
                a.validate();
            }
            catch(Exception f){
                System.out.println("Apply again in 15 days");
            }
        }
    }
}

public class Demo{
    public static void main(String[] args){
        RTO r = new RTO();
        r.acceptApplicant();
    }
}
