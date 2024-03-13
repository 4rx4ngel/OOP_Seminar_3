import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<Student> {
    public StudyGroupIterator(List<Student> studentList) {
        this.students = studentList;
    }
    private List<Student> students = new ArrayList<>();
    private int count;
    @Override
    public boolean hasNext() {
        return count < students.size();
    }

    @Override
    public Student next() {
        return students.get(count++);
    }
}
