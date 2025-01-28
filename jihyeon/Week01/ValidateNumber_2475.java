package CodingTest.jihyeon.Week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ValidateNumber_2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[5];
        int sum = 0;
        int result;

        for (int i = 0; i < 5; i++) {
            try {
                numbers[i] = Integer.parseInt(st.nextToken());
            } catch (NumberFormatException e) {
                throw new NumberFormatException(e.getMessage());
            }
            sum = sum + numbers[i]*numbers[i];
        }
        result = sum % 10;

        System.out.println(result);
    }
}
