import java.util.Random;

public class EmailRandomiser {
    public static String getRandomEmailAddress() {
        StringBuilder email = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            email.append(random.nextInt(9));
        }
        email.append("@abc.com");
        return email.toString();
    }
}
