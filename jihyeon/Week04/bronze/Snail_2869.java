package CodingTest.jihyeon.Week04.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Snail_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int rising = Integer.parseInt(st.nextToken());
        int falling = Integer.parseInt(st.nextToken());
        int treeLength = Integer.parseInt(st.nextToken());
        int dailySnailSpeed = rising - falling;

        int day = (treeLength - falling) / dailySnailSpeed;

        if ((treeLength - falling) % dailySnailSpeed != 0) {
            day++;
        }

        bw.write(String.valueOf(day));
        bw.flush();
        bw.close();
    }
}
