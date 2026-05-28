//WAJP in which if user inputs some value it should write all even nos till that specific no.
import java.util.*;
public class eventilln {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=2;i<=n;i++){
    if(i%2==0){
    System.out.println(i);
}
}
}    
}