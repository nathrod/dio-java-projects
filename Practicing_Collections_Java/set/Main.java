package set;

public class Main {
    public static void main(String[] args){
//        GuestSet guestSet = new GuestSet();
//
//        guestSet.addGuest("Um", 1234);
//        guestSet.addGuest("dois", 1234);
//        guestSet.addGuest("tres", 1235);
//        guestSet.addGuest("quatro", 1236);
//
//        System.out.println(guestSet.countGuests());
//        guestSet.displayGuests();

        UniqueWordsSet words = new UniqueWordsSet();

        words.addWord("Banana");
        words.addWord("Uva");
        words.addWord("Melancia");
        words.addWord("Mamão");

        words.displayUniqueWords();
        words.removeWord("Uva");
        words.displayUniqueWords();
        words.checkWord("Pera");

    }
}
