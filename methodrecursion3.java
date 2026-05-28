public class methodrecursion3 {
    public static void main(String[] args){
    System.out.println("Start");
    test(1);
    System.out.println("End");
    }    
    public static void test(int a){
        if(a<=5){
            System.out.println("Hi");
            test(++a);
        } System.out.println("test method");
    }
}
