// Qs: HOW to use nonstatic nos inside static context?
public class oops4 {
    int a=10;
    public static void main(String[] args){
        oops4 obj=new oops4();
        System.out.println(obj.a);
    }
}
