import java.util.Random;

public class ServerNameGenerator {
    private static String[] nouns = {
            "Architecture",
            "Carnation",
            "Distance",
            "Fill",
            "Glasses",
            "Saviour",
            "Retina",
            "Wrist",
            "Sphinx",
            "Dog"
    };
    private static String[] adjectives = {
            "unable",
            "loving",
            "secretive",
            "dedicated",
            "ruddy",
            "delicious",
            "selective",
            "utter",
            "neat",
            "tasty"
    };
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println(
        adjectives[rnd.nextInt(adjectives.length - 1)]
        + " " +
        nouns[rnd.nextInt(nouns.length - 1)]);
    }
}
