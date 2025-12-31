import java.util.ArrayList;
import java.util.Scanner;

public class secondLar {

    public static int findSecondLargest(ArrayList<Integer> list) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : list) {

            if (num > largest) {                   
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num != largest) {
                secondLargest = num;                
            }
        }

        return secondLargest;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int ans = findSecondLargest(list);


        sc.close();
    }
}
