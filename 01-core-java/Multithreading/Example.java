package Multi;

import java.util.Scanner;


class Demo1 extends Thread{
	@Override
	public void run() {
		System.out.println("Addition task started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		System.out.println("Addition is: "+a+b);
		System.out.println("Addition task completed");
	}
}

class Demo2 extends Thread{
	@Override
	public void run() {
		System.out.println("Character printing task started");
		for(int i=65;i<=90;i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Character printing task is completed");
		
	}
}
class Demo3 extends Thread{
	@Override
	public void run() {
		System.out.println("Number printing task started");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number printing task is completed");	
	}
}


public class Example {

	public static void main(String[] args) throws InterruptedException {
		Demo1 d1=new Demo1();
		Demo2 d2=new Demo2();
		Demo3 d3=new Demo3();
		d1.start();
		d2.start();
		d3.start();
		
		
	}

}
