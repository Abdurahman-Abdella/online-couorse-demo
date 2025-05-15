// User.java
import java.util.ArrayList;

public class User extends person {
    private ArrayList<Course> enrolledCourses;

    public User(String username, String password) {
        super(username, password);
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public boolean login(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        System.out.println("Enrolled in: " + course.getTitle());
    }

    public void viewMyCourses() {
        if (enrolledCourses.isEmpty()) {
            System.out.println("You have not enrolled in any courses.");
            return;
        }
        System.out.println("Your Enrolled Courses:");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getTitle());
        }
    }
}
