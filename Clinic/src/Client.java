/**
 * Created by User on 05.11.2015.
 */
public class Client {
    private int id;
    private String name;
    public Client client = new Client(name);

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "'}";
    }


    }
