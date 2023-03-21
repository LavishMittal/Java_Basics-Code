import java.util.*;

public class average_of_3_numbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :-");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number :-");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd Number :-");
        int num3 = sc.nextInt();

        int avg = (num1 + num2 + num3)/3;
        System.out.print("Average of 3 numbers are :- ");
        System.out.println(avg);
    }
}
