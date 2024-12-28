package CodingTest.sua.Bronze;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Scale_2920 {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] ascending = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] descending = {8, 7, 6, 5, 4, 3, 2, 1};

        int[] input = new int[8];
        for (int i = 0; i < 8; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }


        if (Arrays.equals(input, ascending)) {
            bw.write("ascending");
        } else if (Arrays.equals(input, descending)) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }

        bw.flush();
        bw.close();

    }
}
