import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] beatles = {"John", "George", "Ringo", "Paul"};

        String[] newBeatles = beatles.clone();
        for (int i = 0; i < newBeatles.length; i++) {
            System.out.println(newBeatles[i]);
        }

        newBeatles[1] = "Fred";
        for (int i = 0; i < newBeatles.length; i++) {
            System.out.println(newBeatles[i]);
        }

        System.out.println(newBeatles);
        System.out.println(beatles);

        System.out.println(newBeatles[1]);  // Fred
        System.out.println(beatles[1]);     // Fred


    }
}