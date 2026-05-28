public class unarypost {
    public static void main(String[] args){
        int a=13;
        a++;                              //a=14
        int b=a++;                        //b=14 , a=15
        int c=++a- ++b;                  //c=1 , a=16 , b=15
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    
        }
    }
    

