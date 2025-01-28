package CodingTest.jihyeon.Week04.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Honeycomb_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            bw.write("1");
            bw.flush();
            bw.close();
            return;
        }

        int layer = 1;
        int range = 2;

        while (range <= N) {
            range += 6 * layer;
            layer++;
        }

        bw.write(layer + "\n");
        bw.flush();
        bw.close();
    }
}
