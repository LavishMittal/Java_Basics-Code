import java.util.*;

public class area_of_square {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the side of a square :- ");
    float side = sc.nextFloat();

    float Area = side*side;
    System.out.println("The area of square is :-");
    System.out.println(Area);
}
}
