import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String name1 = o1.getNameOfStudent();
        String surname1 = o1.getSurname();
        String name2 = o2.getNameOfStudent();
        String surname2 = o2.getSurname();
        String fullName1 = name1 + " " + surname1;
        String fullName2 = name2 + " " + surname2;
        return fullName1.compareTo(fullName2);
    }
}
