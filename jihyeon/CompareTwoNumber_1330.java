package CodingTest.jihyeon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CompareTwoNumber_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int a, b = 0;
        try {
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
        if(a > b) {
            System.out.println(">");
        }
        if(a == b) {
            System.out.println("==");
        }
        if(a < b) {
            System.out.println("<");
        }
    }
}
