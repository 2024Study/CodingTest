package CodingTest.jihyeon.Week03.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BinomialCoefficient_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int factorialN = 1, factorialK = 1, factorialNK = 1;

        for (int i = 1; i <= n; i++) {
            factorialN *= i;
            if (i == k) {
                factorialK = factorialN;
            }
            if (i == n - k) {
                factorialNK = factorialN;
            }
        }

        int result = factorialN / (factorialK * factorialNK);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
