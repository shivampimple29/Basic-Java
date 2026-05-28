public class unarypre{
    public static void main(String[] args){
    int a=10;
    ++a;                              //a=11
    int b=++a;                        //b=12 , a=12
    int c=++a + ++b;                  //c=26 , a=13 , b=13
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    }
}