public class Student implements Comparable<Student>{
    private String nameOfStudent;
    private Integer ageOfStudent;
    private String surname;



    public Student(String nameOfStudent, String surname, Integer ageOfStudent) {
        this.nameOfStudent = nameOfStudent;
        this.ageOfStudent = ageOfStudent;
        this.surname = surname;
    }
    public String getNameOfStudent() {
        return nameOfStudent;
    }
    public String getSurname() {
        return surname;
    }

    public Integer getAgeOfStudent() {
        return ageOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAgeOfStudent(Integer ageOfStudent) {
        this.ageOfStudent = ageOfStudent;
    }

    @Override
    public String toString() {
        return "Студенты: " +
                "имя= '" + nameOfStudent + "'" +
                ", фамилия: '" + surname + "'" +
                ", возраст: '" + ageOfStudent + "'";
    }

    @Override
    public int compareTo(Student o) {
        return this.nameOfStudent.compareTo(o.getNameOfStudent());
    }
}
