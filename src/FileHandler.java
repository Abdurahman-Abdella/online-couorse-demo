// FileHandler.java
import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    public static void saveCourses(ArrayList<Course> courses) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("courses.dat"))) {
            out.writeObject(courses);
        } catch (IOException e) {
            System.out.println("Error saving courses: " + e.getMessage());
        }
    }

    public static ArrayList<Course> loadCourses() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("courses.dat"))) {
            return (ArrayList<Course>) in.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
