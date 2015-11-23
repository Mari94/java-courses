/**
 * Created by User on 02.11.2015.
 */
public class Clinic {

    public Clinic(int Clientid, int Animalid){
        this.ClientId = Clientid;
        this.AnimalId = Animalid;

    }
    /**
     * Добавляем клиента.
     */
    public void addClient(final Client client){
        client.setId(Clientid);
        this.client.put(client.getId(), client);



    }
    public void addPet(int AnimalId, Animal animal){
        animal.setId(AnimalId);
        this.client.get(AnimalId).addAnimal(animal);

    }

}

