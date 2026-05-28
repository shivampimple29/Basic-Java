//WAJP to find the sum of cube of first n natural numbers witht the help of FOR LOOP.
import java.util.*;
public class forloops5 {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m;
int ans=0;
for(int i=1;i<=n;i++){
    m=i*i*i;
    ans=ans+m;
}System.out.println(ans);
}
}
