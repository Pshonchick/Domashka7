public class Player1 {
    private final Integer price;

    public Integer getPrice() {
        return price;
    }


    public Player1() {
        price = 100;
    }

    public void playSong() {
        String song = "This Song 1";
        System.out.println("Playing :" + song);
    }
}
