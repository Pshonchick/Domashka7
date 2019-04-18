import java.util.ArrayList;
import java.util.Random;

public class Player6 {
    private final Integer price;

    public Integer getPrice() {
        return price;
    }

    public Player6() {
        price = 250;
    }

    public void playSong() {
        String song = "The best song " ;
        System.out.println("Playing :" + song);
    }
   public static ArrayList<String> playlist = new ArrayList<>();

    public void playAllSongs() {
        for (int i = 0; i < playlist.size() - 1; i++) {
            System.out.println("Playing:" + " " + playlist.get(i));
        }

    }


    public static void shuffle(ArrayList playlist)
    {
        Random random = new Random();
        random.nextInt(playlist.size()-1);
        for (int i = 0; i <playlist.size()-1 ; i++) {
            int change = i + random.nextInt(playlist.size() - i);
            String temp = (String) playlist.get(i);
            playlist.set(i, playlist.get(change));
            playlist.set(change, temp);
        }

 /*   public void playAllSong() {
        String[] playlist = new String[]{

                "This Song 5 ",
                "This Song 4 ",
                "This Song 3 ",
                "This Song 2",
                "This Song 1 "

        } ;*/
  /*      shuffle(playlist);
        for (int i = 0; i < playlist.length; i++) {
            System.out.println(playlist[i] + "");
        }
        System.out.println(playlist);*/

    }/* int[] solutionArray = { 1, 2, 3, 4, 5, 6, 16, 15, 14, 13, 12, 11 };

        shuffleArray(solutionArray);
        for (int i = 0; i < solutionArray.length; i++)
        {
            System.out.print(solutionArray[i] + " ");
        }
        System.out.println();*/

    private void shuffle(String[] playlist) {
    }
}
