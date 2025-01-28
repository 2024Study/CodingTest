package CodingTest.jihyeon.Week02.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Scale_2920 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String type = "";
        int[] scales = new int[8];
        boolean ascending = true;
        boolean descending = true;
        
        for (int i = 0; i < 8; i++) {
            scales[i] = Integer.parseInt(st.nextToken());
            if (scales[i] != i + 1) {
                ascending = false;
            }
            if (scales[i] != 8 - i) {
                descending = false;
            }
        }
        if (ascending) {
            type = "ascending";
        }
        if (descending) {
            type = "descending";
        }
        if (!ascending && !descending) {
            type = "mixed";
        }
        bw.write(type);
        bw.flush();
        bw.close();
    }
}
