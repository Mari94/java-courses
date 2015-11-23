/**
 * Created by User on 02.11.2015.
 */
public class ClinicRun {
    public static void main(String[] args) {
        final Clinic clinic = new Clinic(int Clientid,int Animalid);

        clinic.addClient(0, new Client("Dima", new Cat("Tom")));
        clinic.addClient(1, new Client("Sasha", new Dog("Bilbo")));
        clinic.addClient(2, new Client("Masha", new CatDog(new Cat("Bars"),new Dog(new Animal ("Bim")) )));


    }
}
