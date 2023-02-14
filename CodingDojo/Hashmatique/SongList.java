import java.util.HashMap;

public class SongList {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Breathe Me", "Help, I have done it again\nI have been here many times before\nHurt myself again today\nAnd, the worst part is there's no-one else to blame");
        trackList.put("Chasing Cars", "We'll do it all\nEverything\nOn our own\nWe don't need\nAnything or anyone");
        trackList.put("Viva La Vida", "I used to rule the world\nSeas would rise when I gave the word\nNow in the morning I sleep alone\nSweep the streets I used to own");
        trackList.put("Some Nights", "Some nights, I stay up cashing in my bad luck\nSome nights, I call it a draw\nSome nights, I wish that my lips could build a castle\nSome nights, I wish they'd just fall off");
        
        String selectedTrack = trackList.get("Breathe Me");
        System.out.println("Track: " + selectedTrack);
        
        System.out.println("\nAll Tracks:");
        for (String trackTitle : trackList.keySet()) {
            System.out.println("Track: " + trackTitle + "\nLyrics: " + trackList.get(trackTitle) + "\n");
        }
    }
}
