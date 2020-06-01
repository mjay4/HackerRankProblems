import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    
   
  
    /*
     * Complete the 'getNumberOfIntegers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING L
     *  2. STRING R
     *  3. INTEGER K
     */
    public static int no_of_non_zero(BigInteger n){
        int count=0;
        while(!n.equals(BigInteger.ZERO)){
            BigInteger[] ar = n.divideAndRemainder(new BigInteger("10"));
            if(ar[1].equals(BigInteger.ZERO)){}
            else{
                count++;
            }
            n = ar[0];
        }
        return count;
    }
    public static int getNumberOfIntegers(String L, String R, int k) {
    
        BigInteger l = new BigInteger(L);
        BigInteger r = new BigInteger(R);
        r = r.add(BigInteger.ONE);
        BigInteger i;
        int count =0;
        for( i=l.add(BigInteger.ONE); !i.equals(r) ;i = i.add(BigInteger.ONE)){
            int z = no_of_non_zero(i);
            if(z==k)
                count++;
        }
        return count;
    }

}

public class get_number_of_Integers {
    public static void main(String[] args) throws IOException {
        

        String L = "100";

        String R = "100000";

        int K = 1;

        int ans = Result.getNumberOfIntegers(L, R, K);

        System.out.println(ans);
    }
}
