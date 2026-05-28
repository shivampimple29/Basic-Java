//WAJP to point 1-10 numbers witout loop.
public class methodrecursion2 {
    public static void main(String[] args){
    number(1);
    }public static void number(int a){
        if(a<=10){
        System.out.println(a);
        a++;
        number(a); 
        }
    }
    
}
