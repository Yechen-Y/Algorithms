import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        double index = 1;
        while (!StdIn.isEmpty()) {
            if (StdRandom.bernoulli(1 / index)) {
                champion = StdIn.readString();
            } else {
                StdIn.readString();
            }
            index++;
        }
        StdOut.println(champion);
    }
}
