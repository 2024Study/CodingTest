package CodingTest.jihyeon.Week03.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class PrimeNumber_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] numbers = new int[count];
        int primeCount = 0;

        for(int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
            boolean isPrime = true;

            for (int j = 2; j < numbers[i]; j++){
                if (numbers[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && numbers[i] != 1) {
                primeCount++;
            }
        }
        bw.write(String.valueOf(primeCount));
        bw.flush();
        bw.close();
    }
}
