// Course.java
public class Course {
    private String id;
    private String title;
    private String description;

    public Course(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + title + " - " + description;
    }
}
