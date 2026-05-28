//WAJP to write Adult if age is graeter than 18 otherwise Not Adult.
import java.util.*;
public class Conditions{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if (age >18){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
                }        
    }
}