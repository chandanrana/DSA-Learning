import java.util.ArrayList;
import java.util.List;

public final class Employee {
    private final int id;
    private final String name;
    private final String dept;
    private final List<String> empData;

    public Employee(int id, String name, String dept, List<String> empData) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.empData = new ArrayList<>(empData);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }
}
