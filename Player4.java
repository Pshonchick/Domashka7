public class Player4 {
    private final Integer price;

    public Integer getPrice() {
        return price;
    }

    public Player4() {
        price = 150;
    }

    public void playSong() {
        String song = "This Song 4";
        System.out.println("Playing :" + song);
    }

    private void playAllSong() {
        String[] playlist = new String[]{
                "This Song 1 ",
                "This Song 2 ",
                "This Song 3",
                "This Song 4 "
        };
    }

}
