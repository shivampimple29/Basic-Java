// Qs: How to use static nos inside static context:(i)Directly (ii)with the help of class name &(iii)object members.
public class oops5 {
    static int a=10;
    public static void main(String[] args){
        System.out.println(a);//(i)
        System.out.println(oops5.a);//(ii)
        oops5 obj=new oops5();//(iii)
        System.out.println(obj.a);//will also run if "System.out.println(a);"
    }
}
