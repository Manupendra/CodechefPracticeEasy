import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        boolean prime[] = new boolean[200];
        prime[0] = false;
        prime[1] = false;
        int n = 2;
        while (n < 200) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    break;
                }
                if (i == Math.sqrt(n))
                    prime[n] = true;

            }

            //System.out.print(s);
            n++;
        }
        /*for (int i = 0; i < 200; i++) {
            if (prime[i] == true)
                System.out.print(prime[i]+" ");
        }*/
        for (int i = 0; i < 5999 ; i++) {
            System.out.print("0"+" ");
        }
    }
}
