package CodingTest.jihyeon.Week02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SumNumbers_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String numbers = br.readLine();

        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum = sum + numbers.charAt(i) - '0';
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
