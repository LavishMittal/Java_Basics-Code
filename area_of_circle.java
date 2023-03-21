import java.util.*;

public class area_of_circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Radius:-");
        float rad = sc.nextFloat();

        float Area = 3.14f * rad * rad;
        System.out.println(Area);
    }
}
