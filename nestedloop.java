import java.util.*;
public class nestedloop{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    if(ch>='A' && ch<='Z'){
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
            System.out.println("Upper Case vowel");
        }else{System.out.println("Upper Case consonent");
        }}
 
   else if(ch>='a' && ch<='z'){   
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        System.out.println("Lower Case vowel"); 
    }else {System.out.println("lower Case consonent");
        }}

       else if(ch>='0' && ch<='9'){
      System.out.println("Number");
       }else{System.out.println("Special Character");
    } 
 }
}




