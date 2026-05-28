// WAJP to display address of all objects & additionlly dislpay 2nd object's address with the help of THIS keyword.
public class oops7 {
public static void main(String[] args){
oops7 obj1=new oops7();
System.out.println("Sub 1:"+obj1);
oops7 obj2=new oops7();
System.out.println("Sub 2:"+obj2);
oops7 obj3=new oops7();
System.out.println("Sub 3:"+obj3);
obj2.test();
}
public void test(){
System.out.println(""+this);
}
}

 
