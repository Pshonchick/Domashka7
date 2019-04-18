import java.util.ArrayList;

public class Player5 {
    private final Integer price;

    public Integer getPrice() {
        return price;
    }

    public Player5() {
        price = 180;
    }

    public void playSong() {
        String song = "This Song 1";
        System.out.println("Playing :" + song);
    }

    public static ArrayList<String> playlist = new ArrayList<>();

    public void playAllSongs() {
        for (int i = 0; i < playlist.size() - 1; i--) {
            System.out.println("Playing:" + " " + playlist.get(i));
        }


    }

    ;
}
