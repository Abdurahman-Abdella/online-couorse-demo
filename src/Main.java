// Main.java
import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Admin admin = new Admin("admin", "1234");
    private static ArrayList<User> users = new ArrayList<>();
    private static CourseManager courseManager = new CourseManager();

    public static void main(String[] args) {
        courseManager = new CourseManager();
        courseManager.getAllCourses().addAll(FileHandler.loadCourses());

        while (true) {
            System.out.println("\n==== Online Course Management ====");
            System.out.println("1. Login as Admin");
            System.out.println("2. Login as User");
            System.out.println("3. Register as User");
            System.out.println("4. About Us");
            System.out.println("5. Exit");
            System.out.print("Select option: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    handleAdminLogin();
                    break;
                case "2":
                    handleUserLogin();
                    break;
                case "3":
                    registerUser();
                    break;
                case "4":
                    AboutUs.showTeam();
                    break;
                case "5":
                    FileHandler.saveCourses(courseManager.getAllCourses());
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }

    private static void handleAdminLogin() {
        System.out.print("Username: ");
        String u = sc.nextLine();
        System.out.print("Password: ");
        String p = sc.nextLine();

        if (admin.login(u, p)) {
            adminMenu();
        } else {
            System.out.println("Login failed.");
        }
    }

    private static void adminMenu() {
        while (true) {
            System.out.println("\n-- Admin Panel --");
            System.out.println("1. Add Course");
            System.out.println("2. Delete Course");
            System.out.println("3. List Courses");
            System.out.println("4. View All Users");
            System.out.println("5. Logout");
            System.out.print("Choose: ");
            String c = sc.nextLine();

            switch (c) {
                case "1":
                    System.out.print("Course ID: ");
                    String id = sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Description: ");
                    String desc = sc.nextLine();
                    courseManager.addCourse(new Course(id, title, desc));
                    break;
                case "2":
                    System.out.print("Course ID to remove: ");
                    String delId = sc.nextLine();
                    courseManager.removeCourse(delId);
                    break;
                case "3":
                    courseManager.listCourses();
                    break;
                case "4":
                    System.out.println("Registered Users:");
                    for (User u : users) {
                        System.out.println("- " + u.getUsername());
                    }
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void registerUser() {
        System.out.print("Choose username: ");
        String u = sc.nextLine();
        System.out.print("Choose password: ");
        String p = sc.nextLine();
        users.add(new User(u, p));
        System.out.println("User registered.");
    }

    private static void handleUserLogin() {
        System.out.print("Username: ");
        String u = sc.nextLine();
        System.out.print("Password: ");
        String p = sc.nextLine();

        for (User user : users) {
            if (user.login(u, p)) {
                userMenu(user);
                return;
            }
        }
        System.out.println("Login failed.");
    }

    private static void userMenu(User user) {
        while (true) {
            System.out.println("\n-- User Dashboard --");
            System.out.println("1. View Available Courses");
            System.out.println("2. Enroll in Course");
            System.out.println("3. My Courses");
            System.out.println("4. Logout");
            System.out.print("Choose: ");
            String c = sc.nextLine();

            switch (c) {
                case "1":
                    courseManager.listCourses();
                    break;
                case "2":
                    System.out.print("Enter Course ID to enroll: ");
                    String id = sc.nextLine();
                    Course course = courseManager.getCourseById(id);
                    if (course != null) {
                        user.enrollCourse(course);
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case "3":
                    user.viewMyCourses();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
