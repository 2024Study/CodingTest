package CodingTest.jihyeon.Week02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class MaximumAndMinimum_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] numbers = new int[count];


        for(int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        for(int i = 0; i < count; i++) {
            if(numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
            if(numbers[i] < minNumber ) {
                minNumber = numbers[i];
            }
        }

        bw.write(minNumber + " " + maxNumber);
        bw.flush();
        bw.close();
    }
}
