/**
 * AboutUs.java
 * Displays comprehensive team information for the OOP Mini Project.
 * Developed by Computer Science students at Dire Dawa University.
 */
public class AboutUs {

    /**
     * Displays a professional team profile including:
     * - University and department information
     * - Team members with student IDs
     * - Project context and OOP principles applied
     */
    public static void showTeam() {
        // Header Section
        System.out.println("\n==================================================");
        System.out.println("           OOP MINI PROJECT - TEAM PROFILE        ");
        System.out.println("    Dire Dawa University - School of Computing    ");
        System.out.println("           Department of Computer Science        ");
        System.out.println("==================================================");

        // Team Members Section
        System.out.printf("%-25s %-15s\n", "TEAM MEMBER", "STUDENT ID");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-25s %-15s\n", "1. Abdurahaman Abdella", "DDU1600032");
        System.out.printf("%-25s %-15s\n", "2. Ana Abdurazaq", "DDU15022665");
        System.out.printf("%-25s %-15s\n", "3. Dego Roba", "DDU1600200");
        System.out.printf("%-25s %-15s\n", "4. Nadiyaa Shigute", "DDU1600575");
        System.out.printf("%-25s %-15s\n", "5. Yohannis Garomsa", "DDU1601937");
        System.out.println("==================================================");

        // Project Description Section
        System.out.println("\nPROJECT CONTEXT:");
        System.out.println("This project was developed as part of the Object-Oriented");
        System.out.println("Programming (OOP) course by Computer Science students at");
        System.out.println("Dire Dawa University. Our team combined technical expertise");
        System.out.println("and collaborative effort to deliver a system that adheres to");
        System.out.println("OOP principles:");
        System.out.println("- Encapsulation");
        System.out.println("- Inheritance");
        System.out.println("- Polymorphism");
        System.out.println("- Abstraction");

        System.out.println("\nThe system fulfills all specified functional requirements");
        System.out.println("including file operations, exception handling, and secure");
        System.out.println("user authentication.");

        // Footer Section
        System.out.println("\n==================================================");
        System.out.println("          Project Completion: May 2025        ");
        System.out.println("==================================================\n");
    }
}