package CodingTest.jihyeon.Week02.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AlarmClock_2884 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int clockMinute = 0, clockHour = 0;

        if (minute >= 45) {
            clockMinute = minute - 45;
            clockHour = hour;
        }
        if (minute < 45) {
            clockMinute = 60- (45 - minute);
            if (hour == 0) {
                clockHour = 23;
            } else {
                clockHour = hour- 1;
            }
        }
        bw.write(String.valueOf(clockHour) + " " + String.valueOf(clockMinute));
        bw.flush();
        bw.close();
    }
}
