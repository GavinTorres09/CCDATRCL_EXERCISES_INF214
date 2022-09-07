import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

    // Creates a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        // 2.Adds new songs to Playlist
        Playlist.add("Self Control");
        Playlist.add("Thinkin Bout You");
        Playlist.add("Bound 2");
        Playlist.add("Moon");
        Playlist.add("Novacane");

        //3. Adds a new song at the front of the Playlist
        Playlist.addFirst("Chanel");

        // 4.Adds a new song at the end of the Playlist
        Playlist.addLast("Same Drugs");

        // 5.Display node at the front in the LinkedList
        System.out.println(Playlist.get(0));

        // 6.Replace the last song using the set() method
        Playlist.set(5, "Honesty");

        // 7.Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Playlist);
    }
}
