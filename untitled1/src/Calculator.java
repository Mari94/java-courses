/***
 * ��������� ����������� ������ ������ ���������
 *
 */
public class Calculator {
    /**
     * ��������� ����������
     */
    private int result;

    /**
     * ��������� ���������
     * @param first ������ ��������
     * @param second ������ ��������
     * @return ����� ���������� �����
     */
    public  int   add(int first,int second) {

        return result = first + second;
    }

    /**
     * �������� ���������

     */
    public  int  minus(int first,int second ) {
        
            return result =  first - second;
    }

    /**
     * �������� ���������

     */
    public int multiply(int first, int second) {
        return result = first * second;
    }

    /**
     * ����� ���������

     */

    public int difference(int first, int second){
        return result = first / second;
    }

    /**
     * �������� ��������� ����������
     * @return ���������
     */


        public int getResult(){
        return this.result;

    }

    /**
     * �������� ���������
     */

    public void cleanResult(){
        this.result=0;
    }

}
