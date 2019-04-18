public class Main {
    public static void main(String[] args) {
        Player1 player1 = new Player1();
        player1.playSong();
        Player4 player4 = new Player4() ;
        player4.playSong();
        Player5 player5 =new Player5();
        Player5.playlist.add("This song 4 ");
        Player5.playlist.add("This song 3 ");
        Player5.playlist.add("This song 2 ");
        Player5.playlist.add("This song 1 ");
        System.out.println(Player5.playlist.toString());


        Player6 player6 = new Player6();
        Player6.playlist.add("The best song1");
        Player6.playlist.add("The best song2");
        Player6.playlist.add("The best song3");
        Player6.playlist.add("The best song4");
        Player6.playlist.add("The best song5");
        System.out.println(Player6.playlist.toString());
        Player6.shuffle(Player6.playlist);
        System.out.println(Player6.playlist.toString());
        player6.playSong();
    }

}
