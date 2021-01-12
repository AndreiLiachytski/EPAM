import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(final String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Василий", " Иванов", 21, 8));
        list.add(new Student(2, "Григорий ", " Дрозд", 20, 10));
        list.add(new Student(3, "Роман", " Семченков", 15, 2));
        list.add(new Student(4, "Кирилл", " Метелица", 21, 8));
        list.add(new Student(5, "Андрей", " Петров", 20, 10));
        list.add(new Student(6, "Денис", " Иванов", 21, 6));
        list.add(new Student(7, "Александр", " Первый", 15, 7));
        list.add(new Student(8, "Петр", " Великий", 17, 7));
        list.add(new Student(9, "Сергей", " Вакула", 15, 9));
        list.add(new Student(10, "Артем", " Сидоров", 17, 8));

        list.stream()
                .filter((student -> student.getPerformance() >= 9)).sorted(Comparator.comparing(Student::getPerformance))
                .forEach(System.out::println);
    }
}
