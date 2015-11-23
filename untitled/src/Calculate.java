import java.lang.Math;
import java.util.Scanner;
public class Calculate {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int first=scanner.nextInt();
        int second=scanner.nextInt();
        double i=scanner.nextDouble();
        double w=scanner.nextDouble();
        int a =scanner.nextInt() ;
        double b =scanner.nextDouble() ;
        float c = scanner.nextFloat();
        int d = scanner.nextInt();
        double Base =scanner.nextDouble() ;
        double Power =scanner.nextDouble() ;
           System.out.printf("one: " +one(first,second));
           System.out.printf("two: " +two(i,w));
           System.out.printf("three: " +three(a, b));
           System.out.printf("four: " +four(c, d));
           System.out.printf("five: " +five(Base,Power));
    }
    public static int one(int first,int second){
        return first + second;
    }

       public static double two(double i,double w){
           return i - w;
       }

      public static double three(int a, double b){
      return a * b;
       }

     public static float four(float c, int d){
         return c / d;
      }

      public static double five(double Base, double Power){
          return Math.pow(Base,Power);
     }
}
