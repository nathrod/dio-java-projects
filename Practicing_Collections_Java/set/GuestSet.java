package set;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
    private Set<Guest> guestSet;

    public GuestSet(){
        this.guestSet = new HashSet<>();
    }

    public void addGuest(String name, int invitationCode){
        guestSet.add(new Guest(name, invitationCode));
    }

    public void removeGuestByInvitationCode(int invitationCode){
        Guest guestToRemove = null;
        for(Guest guest : guestSet){
            if(guest.getInvitationCode() == invitationCode){
                guestToRemove = guest;
                break;
            }
        }
        guestSet.remove(guestToRemove);
    }

    public int countGuests(){
        return guestSet.size();
    }

    public void displayGuests(){
        System.out.println(guestSet);
    }
}
