public class staticblock {
    public static void main(String[] args){
System.out.println("Main Start");
test();
System.out.println("Main End");
}
static{
    System.out.println("Welcome to Windows");
}
public static void test(){
    System.out.println("Test Start");
    System.out.println("Test end");
}
static{
    System.out.println("Welcome to Core JAVA");
}
}

