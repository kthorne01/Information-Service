public class Zipcode {
    private String zipcode;
    public Zipcode(String zipcode) {
        this.zipcode = zipcode;
    }



    public static void main(String[] args) {
        ServiceCommunicator sc = new ServiceCommunicator();
        Zipcode zipcodeObj = new Zipcode("92024");
        sc.setURL("http://api.zippopotam.us/us/" + zipcodeObj.zipcode);
        sc.connect();
        System.out.println(sc.get());

    }
}
