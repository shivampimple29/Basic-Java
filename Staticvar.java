public class Staticvar {
    static int a=10;
public static void main(String[] args){
System.out.println(a);
test();
}public static void test(){
    System.out.println(a);
    int a=25;
    System.out.println(a);
    System.out.println(Staticvar.a);
}

}
