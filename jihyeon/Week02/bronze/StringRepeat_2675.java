package CodingTest.jihyeon.Week02.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class StringRepeat_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int repeatCount = Integer.parseInt(st.nextToken());
            String word = st.nextToken();;

            StringBuilder result = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                result.append(String.valueOf(ch).repeat(repeatCount));
            }
            bw.write(result.toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
