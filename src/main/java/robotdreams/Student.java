package robotdreams;

public class Student {
    Integer id;
    String firstName;
    String lastName;
    Double averageGrade;

    @Override
    public String toString() {
        return "Id:" + id.toString() + ":" + lastName + ", " + lastName + ":" + averageGrade;
    }
}
