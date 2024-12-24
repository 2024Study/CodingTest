package CodingTest.jihyeon.Week02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MaximumValue_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] number = new int[9];
        int maxNumber = 0;
        int maxIndex = 0;

        for (int i = 0; i < 9; i++) {
            number[i] = Integer.parseInt(br.readLine());
            if(number[i] >  maxNumber) {
                maxNumber = number[i];
                maxIndex = i+1;
            }
        }
        bw.write(maxNumber +"\n" + maxIndex);
        bw.flush();
        bw.close();
    }
}
