package CodingTest.jihyeon.Week03.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Palindrome_1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String input = br.readLine();

            if (input.equals("0")) {
                break;
            }
            boolean palindrome = true;
            for (int i = 0; i < input.length()/2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    palindrome = false;
                }
            }
            if (palindrome == true) {
                bw.write("yes");
            }
            if (palindrome == false) {
                bw.write("no");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
