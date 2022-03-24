public class Zipcode extends ServiceCommunicator {
    private String zipcode;
    public Zipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void getZipcode() {
        setURL("http://api.zippopotam.us/us/" + this.zipcode);
        connect();
        System.out.println(get());
    }

    public static void main(String[] args) {
        Zipcode zipcodeObj = new Zipcode("92024");
        zipcodeObj.getZipcode();;
    }
}
