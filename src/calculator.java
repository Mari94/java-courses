/**
 * Created by User on 08.10.2015.
 */
public class calculator {

    private int result;
    public  int add(int first, int second) {
        return first + second;
    }

  //  public static int minus (int first, int second){
  //      return first - second;
 //   }

  //  public static int multiply(int first, int second) {
  //      return first * second;
 //   }

 //   public static int difference(int first, int second){
  //      return first / second;
 //  }

  //  public static double Power(Double first, Double second){
 //       return Math.pow(first, second);
 //   }

    public int getResult(){
        return this.result;

    }

    public void cleanResult(){
        this.result=0;
    }


}
