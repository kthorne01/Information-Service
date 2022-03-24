import java.util.ArrayList;
import java.util.Locale;

public class TestApp {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        while (true) {

            userInput.clear();
            System.out.print("Command>");
            ArrayList<String> inputArgs = userInput.getArgs();

            switch (inputArgs.get(0)) {
                case "television" :
                    userInput.clear();
                    System.out.println("Please enter a television series: ");
                    ArrayList<String> televisionInput = userInput.getArgs();
                    Television television = new Television(televisionInput.get(0));
                    television.getTelevision();
                    break;
                case "music":
                    userInput.clear();
                    System.out.println("Please enter a music : ");
                    ArrayList<String> musicInput = userInput.getArgs();
                    Music music = new Music(musicInput.get(0));
                    music.getMusic();
                    break;
                case "zipcode":
                    userInput.clear();
                    System.out.println("Please enter a zipcode : ");
                    ArrayList<String> zipcodeInput = userInput.getArgs();
                    Zipcode zipcode = new Zipcode(zipcodeInput.get(0));
                    zipcode.getZipcode();
                    break;
                case "exit": System.exit(0);
                default:
                    System.out.println("Try again!");
            }
        }
    }
}
