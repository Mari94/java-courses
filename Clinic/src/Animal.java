/**
 * Created by User on 05.11.2015.
 */
public class Animal {
    private String name;
    private int id;
    public Animal animal = new Animal(name);

    public Animal(final String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }


    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String toString() {
        return  getName();
    }



}



