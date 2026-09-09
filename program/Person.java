import java.util.Objects;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public boolean Equals(Person another){
        return Objects.equals(name, another.name);
    }

    public String toString(){
        String message = "name = "+ name+", address = "+ address;
        return message;
    }
}
