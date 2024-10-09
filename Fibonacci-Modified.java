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

    public static BigInteger fibonacciModified(int t1, int t2, int n) {
        if (n == 1) {
            return BigInteger.valueOf(t1);
        } else if (n == 2) {
            return BigInteger.valueOf(t2);
        } else {
            BigInteger[] data = new BigInteger[n];
            data[0] = BigInteger.valueOf(t1);
            data[1] = BigInteger.valueOf(t2);
            for (int i = 2; i < n; i++) {
                data[i] = data[i-2].add(data[i-1].multiply(data[i-1]));
            }
            return data[n-1];
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int t1 = Integer.parseInt(firstMultipleInput[0]);

        int t2 = Integer.parseInt(firstMultipleInput[1]);

        int n = Integer.parseInt(firstMultipleInput[2]);

        BigInteger result = Result.fibonacciModified(t1, t2, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}