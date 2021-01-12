
/*1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.
*/

public class Test1 {

    private int firstVariable;
    private int secondVariable;

    public int setFirst(int first) {
        this.firstVariable = first;
        return first;
    }

    public int setSecond(int second) {
        this.secondVariable = second;
        return second;
    }

    public int getSum(int first, int second) {
        return first + second;
    }

    public int getMaxValue(int first, int second) {
        return Math.max(first, second);
    }

    public void printFirst() {
        System.out.println(firstVariable);
    }

    public void printSecond() {
        System.out.println(secondVariable);
    }

}
