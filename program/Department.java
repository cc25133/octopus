import java.util.Objects;

public class Department {
    private int id;
    private String name;

    public Department(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public boolean Equals(Department another){
        return Objects.equals(id, another.id);
    }

    public String toString(){
        return "id" + id + ", name = "+name;
    }
}
