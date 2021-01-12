/*3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.
*/

public class Student {

    private final String surname;
    private final int groupID;
    private final int performance;

    public Student(final int id, final String name, final String surname, final int groupID, final int performance) {
        this.surname = surname;
        this.groupID = groupID;
        this.performance = performance;
    }

    public int getPerformance() {
        return performance;
    }

    @Override
    public String toString() {
        return "Студент группы № " + groupID + " " + surname + " имеет средний балл " + performance + ".";
    }
}


