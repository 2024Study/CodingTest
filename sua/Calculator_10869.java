package CodingTest.sua;

import java.io.*;
import java.util.StringTokenizer;

public class Calculator_10869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int sum = A+B;
        int minus = A-B;
        int multiple = A*B;
        int quotient = A/B;
        int remainder = A%B;


        bw.write(String.valueOf(sum));
        bw.newLine();

        bw.write(String.valueOf(minus));
        bw.newLine();

        bw.write(String.valueOf(multiple));
        bw.newLine();

        bw.write(String.valueOf(quotient));
        bw.newLine();

        bw.write(String.valueOf(remainder));
        bw.newLine();


        bw.flush();
        bw.close();
    }
}
