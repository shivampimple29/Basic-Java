public class Staticmember {
static int a;
static String s;
static{
    System.out.println("SM");
    test();
    System.out.println("SM");
}
public static void main(String[] args){
    System.out.println("Main Start");
    test(10);
    System.out.println(s);
    a=10;
    String s="Shivam";
    System.out.println(s);
    Staticmember.s=s;
    test(Staticmember.s);
    System.out.println("Main End");
}
public static void test(){
    System.out.println("test() Start");
    int a=12;
    System.out.println(a);
    System.out.println(Staticmember.a);
    s="Athang";
    System.out.println("test() End");
}
public static void test(String S){
    System.out.println("test() String Start");
    System.out.println(Staticmember.s);
    s="Shreyash";
    System.out.println(s);
    Staticmember.s=s;
    System.out.println("Test String End");
}
static{
    System.out.println("Static Block");
    test("Sid");
    System.out.println(Staticmember.s);
}
public static void test(int a){
    System.out.println("Test(int a) Start");
    System.out.println("Test(int a) End");
}
}
