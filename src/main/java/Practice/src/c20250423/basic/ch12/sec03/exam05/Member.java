package Practice.src.c20250423.basic.ch12.sec03.exam05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private String id;
    private String name;
    private int age;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getNo() {return id;}

    public String getName() {return name;}

    @Override
    public int hashCode() {
        int hashCode = id.hashCode() + name.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            if(id.equals(target.getNo()) && name.equals(target.getName())) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Member [id=" + id + ", name=" + name + "]";
    }
}

