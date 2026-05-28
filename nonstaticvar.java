 public class nonstaticvar {
int a=10;//Nonstatic variable
public static void main(String[] args){
    System.out.println(a);
    System.out.println(nonstaticvar.a);
}
}
//So the reason about why this program isn't working is bcoz we can't use nonstatic variable inside static context directly as well as
//with the help of class name. 
