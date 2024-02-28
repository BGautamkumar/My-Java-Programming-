package JavaBasics;
//import java.util.*;

public class JavaOperators {
    public static void main(String args[]) {
        //Arthmetic Operators
        int A = 10;
        int B = 5;
        System.out.println("add = " + (A+B));
        System.out.println("subtract = " + (A-B));
        System.out.println("multiply = " + (A*B));
        System.out.println("divide = " + (A/B));
        System.out.println("modulo(remainder) = " + (A%B));
        System.out.println(A-B);
        
        int a = 10;
        int b = a++;
        int c = b--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Relational Operator 
        int x = 19;
        int y = 18;
        System.out.println((x == y));
        System.out.println((x != y));
        System.out.println((x > y));
        System.out.println((x < y));
        System.out.println((x >= y));
        System.out.println((x <= y));

        //logical Operator
         
        System.out.println( (3>2) && (4<5));
        System.out.println( (2>10) || (2<-1));
        System.out.println( !(2>20));

        //Assignment operator
        int v = 10;
        v = v + 10;
        v += 10;
        int m = 5;
        m = m - 5;
        m = m / 5;
        m = m * 5;
        m = m % 5;
        m %= 5;
        System.out.println(v);
        System.out.println(m);
    }
    
}
