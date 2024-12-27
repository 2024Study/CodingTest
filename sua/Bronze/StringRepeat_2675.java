package CodingTest.sua.Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class StringRepeat_2675 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            StringBuilder res = new StringBuilder();

            for (char ch : S.toCharArray()) {
                res.append(String.valueOf(ch).repeat(R));
                //아이시발 이부분때문에 댁아리아팟ㅇ슴 진작에 이럴걸
            }

            bw.write(res.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }


}

