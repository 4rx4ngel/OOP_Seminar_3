
public class StudyGroup implements Comparable<StudyGroup>{
    private String groupName;
    private Integer studentsTotal;


    public StudyGroup(String groupName, Integer studentsTotal) {
        this.groupName = groupName;
        this.studentsTotal = studentsTotal;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getStudentsTotal() {
        return studentsTotal;
    }

    public int compareTo(StudyGroup groupToCompare) {
        return Integer.compare(this.studentsTotal, groupToCompare.studentsTotal);
    }

    public String toString() {
        return "Группа: " + groupName + " --- Количество студентов: " + studentsTotal;
    }
}
