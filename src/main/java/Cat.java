import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Cat {
    private String name;
    private String color;
    private byte age;

    public Cat() {
    }

    public Cat(String name, String color, Byte age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }
}
