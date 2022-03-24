public class Music extends ServiceCommunicator{
    private String music;

    public Music(String music) {
        this.music = music;
    }

    public void getMusic() {
        setURL("https://itunes.apple.com/search?term=" + this.music + "&limit=1");
        connect();
        System.out.println(get());
    }

    public static void main(String[] args) {
        Music music = new Music("He's-Been-Good");
        music.getMusic();
    }
}
