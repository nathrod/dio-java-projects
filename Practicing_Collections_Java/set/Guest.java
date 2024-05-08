package set;

import java.util.Objects;

public class Guest {
    private String name;
    private int invitationCode;

    public Guest(String name, int invitationCode){
        this.name = name;
        this.invitationCode = invitationCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest guest)) return false;
        return getInvitationCode() == guest.getInvitationCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInvitationCode());
    }

    @Override
    public String toString() {
        return "Guest{"+"name: "+name+", code: "+invitationCode+"}";
    }

    public String getName() {
        return name;
    }

    public int getInvitationCode() {
        return invitationCode;
    }
}
