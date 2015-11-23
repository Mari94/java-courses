/***
 * программа калькулятор решает разные уравнения
 *
 */
public class Calculator {
    /**
     * результат вычисления
     */
    private int result;

    /**
     * суммируем аргументы
     * @param first первый аргумент
     * @param second второй аргумент
     * @return метод возвращяет сумму
     */
    public  int   add(int first,int second) {

        return result = first + second;
    }

    /**
     * вычитаем аргументы

     */
    public  int  minus(int first,int second ) {
        
            return result =  first - second;
    }

    /**
     * умножаем аргументы

     */
    public int multiply(int first, int second) {
        return result = first * second;
    }

    /**
     * делим аргументы

     */

    public int difference(int first, int second){
        return result = first / second;
    }

    /**
     * Получить результат вычисления
     * @return результат
     */


        public int getResult(){
        return this.result;

    }

    /**
     * Очистить результат
     */

    public void cleanResult(){
        this.result=0;
    }

}
