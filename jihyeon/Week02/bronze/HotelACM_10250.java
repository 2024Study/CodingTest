package CodingTest.jihyeon.Week02.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class HotelACM_10250 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int dataCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < dataCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int floorCount = Integer.parseInt(st.nextToken());
            int roomCount = Integer.parseInt(st.nextToken());
            int customerCount = Integer.parseInt(st.nextToken());

            int floor = customerCount % floorCount;
            if (floor == 0) {
                floor = floorCount;
            }

            int room = (customerCount + floorCount - 1) / floorCount;


            bw.write(String.format("%d%02d", floor, room));
            if (i < dataCount - 1) {
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
