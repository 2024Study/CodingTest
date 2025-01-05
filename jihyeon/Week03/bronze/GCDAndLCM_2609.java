package CodingTest.jihyeon.Week03.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class GCDAndLCM_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int number1 = Integer.parseInt(st.nextToken());
        int number2 = Integer.parseInt(st.nextToken());

        int originalNumber1 = number1;
        int originalNumber2 = number2;

        while (number2 != 0) {
            int remainder = number1 % number2;
            number1 = number2;
            number2 = remainder;
        }
        int gcd = number1;

        int lcm = (originalNumber1 * originalNumber2) / gcd;

        bw.write(gcd + "\n" + lcm + "\n");
        bw.flush();
        bw.close();
    }
}
