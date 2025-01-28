package CodingTest.jihyeon.Week04.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FizzBuzz_28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = new String[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = br.readLine();
        }

        int start = -1;

        for (int i = 0; i < 3; i++) {
            if (isNumeric(numbers[i])) {
                start = Integer.parseInt(numbers[i]) - i;
                break;
            }
        }
        bw.write(determineFizzbuzz(start + 3));
        bw.newLine();
        bw.flush();
        bw.close();
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static String determineFizzbuzz(int number) {

        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(number);
    }
}

