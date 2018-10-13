import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CHEFCH {
    static int solver(String s) {
        int flips = 0;
        int minflips = Integer.MAX_VALUE;
        //fix the first character '+'
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && s.charAt(i) != '+')
                flips++;
            else if (i % 2 != 0 && s.charAt(i) != '-')
                flips++;

        }
        if (minflips > flips)
            minflips = flips;
        flips=0;
        //fix the first character '-'
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && s.charAt(i) != '-')
                flips++;
            else if (i % 2 != 0 && s.charAt(i) != '+')
                flips++;

        }
        if (minflips > flips)
            minflips = flips;

        return minflips;

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        for (int testcases = Integer.parseInt(br.readLine()); testcases > 0; testcases--) {
            String ip = br.readLine();
            s.append(solver(ip)).append('\n');
        }
        System.out.print(s);
    }
}
