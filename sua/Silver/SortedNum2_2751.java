package CodingTest.sua.Silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class SortedNum2_2751 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=1; i<=N; i++){
            int nums = Integer.parseInt(br.readLine());
            numbers.add(nums);
        }

        Collections.sort(numbers);

        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            sb.append(num).append('\n');

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
