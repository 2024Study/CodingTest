package CodingTest.jihyeon.Week02.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AplusBminusC_31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        int numC = Integer.parseInt(c);

        int sumNumber = numA + numB - numC;
        String sumString = a + b;
        int finalSumString = Integer.parseInt(sumString) - numC;

        bw.write(String.valueOf(sumNumber));
        bw.newLine();
        bw.write(String.valueOf(finalSumString));

        bw.flush();
        bw.close();
    }
}
