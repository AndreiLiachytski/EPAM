
/*2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса.*/

public class Test2 {

    private int firstVariable;
    private int secondVariable;

    public Test2() {
    }

    public Test2(final int first, final int second) {
        this.firstVariable = first;
        this.secondVariable = second;
    }

    public int getFirstVariable() {
        return firstVariable;
    }

    public void setFirstVariable(final int firstVariable) {
        this.firstVariable = firstVariable;
    }

    public int getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(final int secondVariable) {
        this.secondVariable = secondVariable;
    }
}
