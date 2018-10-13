import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CHEFSTON {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();
        for (int testcase = Integer.parseInt(br.readLine()); testcase > 0; testcase--) {
            String s1[] = br.readLine().split(" ");
            int n = Integer.parseInt(s1[0]);
            int k = Integer.parseInt(s1[1]);
            String s2[] = br.readLine().split(" ");
            int A[] = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(s2[i]);
            }
            String s3[] = br.readLine().split(" ");
            int B[] = new int[n];
            for (int i = 0; i < n; i++) {
                B[i] = Integer.parseInt(s3[i]);
            }
        }
        System.out.print(s);
    }
}
