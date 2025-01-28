package CodingTest.jihyeon.Week02.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NumbersCount_2577 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number1 = Integer.parseInt(br.readLine());
        int number2 = Integer.parseInt(br.readLine());
        int number3 = Integer.parseInt(br.readLine());

        int[] numberList = new int[10];

        String multiplyResult = String.valueOf(number1 * number2 * number3);

        for (int i = 0; i < multiplyResult.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (multiplyResult.charAt(i)-'0' == j) {
                    numberList[j]++;
                }
            }
        }
        for (int i = 0; i < numberList.length; i++) {
            bw.write(String.valueOf(numberList[i]));
            if (i != numberList.length - 1) {
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
