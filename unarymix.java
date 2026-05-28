public class unarymix {
    public static void main(String[] args){
        int a=12;
        int b=-10;     
        int c=3;
        a=b++ + c++ - --c + b-- + c-- + b;
        b=c++ - c-- + --c + ++c - --a + a-- + a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    
        }
    }

