package CodingTest.jihyeon.Week04.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BecomingVillageLeader_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[][] apartment = new int[k + 1][n + 1];

            for (int j = 1; j <= n; j++) {
                apartment[0][j] = j;
            }

            for (int floor = 1; floor <= k; floor++) {
                for (int room = 1; room <= n; room++) {
                    apartment[floor][room] = apartment[floor - 1][room] + apartment[floor][room - 1];
                }
            }

            bw.write(apartment[k][n] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
