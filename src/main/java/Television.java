public class Television extends ServiceCommunicator{
    private String search;
    public Television(String search) {
        search.replace(" ", "-");
        this.search = search;
    }

    public void getTelevision() {
        setURL("http://api.tvmaze.com/singlesearch/shows?q=" + this.search);
        //http://api.tvmaze.com/singlesearch/shows?q=outlander
        connect();
        System.out.println(get());
    }


    public static void main(String[] args) {
        Television television = new Television("outlander");
        television.getTelevision();
    }
}
