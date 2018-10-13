import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class GCDMOD {
    public static long gcd(long a,long b)
    {
        if(b == 0)return a;
        else
        {
            return gcd(b,a % b);
        }
    }
    public static void main(String[] args) throws IOException {
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger mod = new BigInteger("1000000007");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long test,t;
        test = Long.parseLong(bufferedReader.readLine());
        for(t = 0;t<test;t++)
        {
            String s[] = bufferedReader.readLine().split(" ");
            BigInteger A = new BigInteger(s[0]);BigInteger B = new BigInteger(s[1]);BigInteger N = new BigInteger(s[2]);
            BigInteger res1 = A.modPow(N,mod).mod(mod);
            BigInteger res2 = B.modPow(N,mod).mod(mod);
            // System.out.println(res1+" "+res2);
            res1 = res1.add(res2);
            //System.out.println(res1);
            if(A.equals(B))
            {
                //  System.out.println(A.subtract(B));
                System.out.println(res1.gcd(A.subtract(B)).mod(mod));
            }
            else {
                // System.out.println(N.equals(BigInteger.ONE));
                if(N.equals(BigInteger.ONE))
                {
                    //   System.out.println("here1");
                    BigInteger res3 = A.pow(1);BigInteger res4 = B.pow(1);
                    BigInteger r1 = res3.add(res4);
                    System.out.println(r1.gcd(A.subtract(B)).mod(mod));
                }
                else
                {
                    // System.out.println("here2");
                    BigInteger res5 = A.pow(2);BigInteger res6 = B.pow(2);
                    BigInteger r2 = res5.add(res6);
                    System.out.println(r2.gcd(A.subtract(B)));
                }
            }
        }
    }
}
