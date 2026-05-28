import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        int s=sc.nextInt();
        double sum=a+b;
        double sub=a-b;
        double mul=a*b;
        double div=a/b;
        double mod=a%b;

        switch(s){
            case 1: System.out.println(sum);
            break;
            case 2: System.out.println(sub);
            break;
            case 3: System.out.println(mul);
            break;
            case 4: System.out.println(div);
            break;
            case 5: System.out.println(mod);
            break;
            default:System.out.println("Not valid");

        }
    }
}