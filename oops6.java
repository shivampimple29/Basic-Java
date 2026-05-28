// Qs: How to create a non-static string to display any three names as output?
class oops6{
String UA; 
public static void main(String[] args){
    oops6 obj1=new oops6();
    obj1.UA="Shivam";
    oops6 obj2=new oops6();
    obj2.UA="Athang";
    oops6 obj3=new oops6();
    obj3.UA="Shreyash";
    System.out.println("Username 1:"+obj1.UA);
    System.out.println("Username 2:"+obj2.UA);
    System.out.println("USername 3:"+obj3.UA);
}
}
