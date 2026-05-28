//Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
import java.util.*;

public class Aofcircle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double A= 3.14*r*r;
        System.out.println(A);
    }
}