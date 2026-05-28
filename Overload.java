public class Overload {
    public static void main(String[] args){
        System.out.println("Main Start");
        main();
        main(10);
        main("Shivam");
        System.out.println("Main End");
    }
    public static void main(){
        System.out.println("No Argments");
    }
    public static void main(int a){
        System.out.println("Int Argument");
    }
    public static void main(String b){
        System.out.println("String Argument");
    }
}
//I learned that with the help of concept of overloading, we can perform multiple task only with the help of one single function(here main)  
//by calling it the MAIN function and defining it outside th MAIN.