package map;

import java.util.HashMap;
import java.util.Map;

public class ContactAgenda {
    private Map<String, Integer> contactAgenda;

    public ContactAgenda(){
        this.contactAgenda = new HashMap<>();
    }

    public void addContact(String name, Integer phoneNumber){
        contactAgenda.put(name, phoneNumber);
    }

    public void removeContact(String name){
        if(!contactAgenda.isEmpty()){
            contactAgenda.remove(name);
        }
    }

    public void displayContacts(){
        System.out.println(contactAgenda);
    }

    public Integer searchByName(String name){
        Integer phoneNumber = null;
        if(!contactAgenda.isEmpty()){
            phoneNumber = contactAgenda.get(name);
        }
        return phoneNumber;
    }
}
