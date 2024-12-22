package CodingTest.sua;

import java.io.*;
import java.util.StringTokenizer;

public class APlusBMinus4_10951 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            StringTokenizer st = new StringTokenizer(line);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int res = A + B;
            bw.write(res + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }




    }

