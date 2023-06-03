package robotdreams;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/RobotDreams", "user", "password");
        Statement statement = connection.createStatement();
        statement.execute("INSERT INTO  `RobotDreams`.`student` (first_name, last_name, avg_grade) VALUES ('Julia', 'Satsyk', '200')");
        ResultSet resultSet = statement.executeQuery("SELECT * FROM `RobotDreams`.`student`");
        ArrayList<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            Student student = new Student();
            student.id = resultSet.getInt("id");
            student.firstName = resultSet.getString("first_name");
            student.lastName = resultSet.getString("last_name");
            student.averageGrade = resultSet.getDouble("avg_grade");

            students.add(student);
        }

        for (Student student: students) {
            System.out.println(student);
        }
    }
}