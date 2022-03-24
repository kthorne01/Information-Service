public class Television {

    private String search;
    public Television(String search) {
        search.replace(" ", "-");
        this.search = search;
    }


    public static void main(String[] args) {
        ServiceCommunicator sc = new ServiceCommunicator();
        Television television = new Television("outlander");
        sc.setURL("http://api.tvmaze.com/singlesearch/shows?q=" + television.search);
        //http://api.tvmaze.com/singlesearch/shows?q=outlander
        sc.connect();
        System.out.println(sc.get());

    }
}
