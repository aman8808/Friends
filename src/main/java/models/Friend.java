package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "friend")
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    private int age;

    @OneToMany(mappedBy = "friend", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Auto> autos;

     public Friend() {
     }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
        autos = new ArrayList<>();
    }

    public void addAuto(Auto auto) {
         auto.setFriend(this);
         autos.add(auto);
    }

    public void removeAuto(Auto auto) {
         autos.remove(auto);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Auto> getAutos() {
         return autos;
    }
    public void setAutos(List<Auto> autos) {
         this.autos = autos;
    }

    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
