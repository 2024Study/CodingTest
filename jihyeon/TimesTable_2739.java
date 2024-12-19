package CodingTest.jihyeon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimesTable_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int number;

        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException();
        }

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d%n", number, i, number*i);
        }
    }
}
