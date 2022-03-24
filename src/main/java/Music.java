public class Music {
    private String music;

    public Music(String music) {
        this.music = music;
    }

    public static void main(String[] args) {
        ServiceCommunicator sc = new ServiceCommunicator();
        Music music = new Music("outlander");
        sc.setURL("https://itunes.apple.com/search?term=" + music.music + "&limit=1");
        sc.connect();
        System.out.println(sc.get());
    }
}
