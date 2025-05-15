// CourseManager.java
import java.util.ArrayList;

public class CourseManager {
    private ArrayList<Course> courses;

    public CourseManager() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added: " + course.getTitle());
    }

    public void removeCourse(String courseId) {
        boolean removed = courses.removeIf(c -> c.getId().equals(courseId));
        if (removed)
            System.out.println("Course removed.");
        else
            System.out.println("Course not found.");
    }

    public void listCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        System.out.println("Available Courses:");
        for (Course c : courses) {
            System.out.println(c);
        }
    }

    public Course getCourseById(String id) {
        for (Course c : courses) {
            if (c.getId().equals(id)) return c;
        }
        return null;
    }

    public ArrayList<Course> getAllCourses() {
        return courses;
    }
}
