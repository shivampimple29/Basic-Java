//WAJP to mAke calculator using parameters.
public class paracalculator {

public static void main(String [] args){
    ToAdd(10,20,30);
    ToSub(50,5,4,3);
    ToMul(2,3,5);
    ToDiv(50,5); 
}
public static void ToAdd(int a,int b,int c){
    int ans=a+b+c;
    System.out.println(ans);
}
public static void ToSub(int a,int b,int c,int d) {
    int ans=a-b-c-d;
    System.out.println(ans);
}
public static void ToMul(int a,int b,int c){
    int ans=a*b*c; 
    System.out.println(ans);
}
public static void ToDiv(int a,int b){
    int ans=a/b;
    System.out.println(ans);
}
}