package set;

import java.util.HashSet;
import java.util.Set;

public class ContactAgenda {
    private Set<Contact> contactSet;

    public ContactAgenda(){
        contactSet = new HashSet<>();
    }

    public void addContact(String name, String phoneNumber){
        contactSet.add(new Contact(name, phoneNumber));
    }

    public void displayContacts(){
        System.out.println(contactSet);
    }

    public void searchByName(String name){
        Set<Contact> searchByName = new HashSet<>();
        boolean found = false;
        for(Contact contact : contactSet){
            if(contact.getName().equalsIgnoreCase(name)){
                searchByName.add(contact);
                found = true;
                break;
            }
        }

        if(found){
            System.out.println(searchByName.toString());
        }else{
            System.out.println("No contact found");
        }
    }

    public void updateContactNumber(String name, String newNumber){
        boolean found = false;
        for(Contact contact : contactSet){
            if(contact.getName().equalsIgnoreCase(name)){
                found = true;
                break;
            }
        }

        contact.setPhoneNumber(newNumber);
    }
}
