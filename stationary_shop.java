import java.util.*;

public class stationary_shop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);                   // Problem 3 

        System.out.println("Enter the cost of Pencil:- ");
        float pencil_cost = sc.nextFloat();
        System.out.println("Enter the cost of Pen:- ");
        float pen_cost = sc.nextFloat();
        System.out.println("Enter the cost of Eraser:- ");
        float eraser_cost = sc.nextFloat();

        System.out.println("Your Total cost of your products with GST is :-");
        double Total = pencil_cost + pen_cost + eraser_cost ; 
        double With_GST = 0.18 * Total;
        System.out.println(With_GST);

        int $ = 24;                                             // Problem 5 
        System.out.println($);
    }
}
