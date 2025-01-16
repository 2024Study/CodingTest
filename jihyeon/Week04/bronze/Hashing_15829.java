package CodingTest.jihyeon.Week04.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Hashing_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int r = 31;
        long exponent = 1;
        long hash = 0;

        long M = 1234567891;

        for (int i = 0; i < count; i++) {
            int charValue = str.charAt(i) - 'a' + 1;
            hash = (hash + charValue * exponent) % M;
            exponent = (exponent * r) % M;
        }

        bw.write(hash + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
