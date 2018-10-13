import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Intest implements Runnable {

    public void solve() throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt(), p = 0, x;
        while (n --> 0) {
            x = in.nextInt();
            if (x % k == 0) p++;
        }
        System.out.println(p);
    }

    public void run() {
        try {
            solve();
        } catch (IOException e) {
            System.exit(64);
        }
    }

    public static void main(String[] arg) throws IOException {
        new Thread(new Intest()).start();
    }
}
