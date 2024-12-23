package CodingTest.sua;

import java.io.*;

public class CharacterAndStrings_27866 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //배열로 문자열 입력받기
        //입력받은 정수에 해당하는 배열 문자 반환

        char[] arr = br.readLine().toCharArray();
        int index = Integer.parseInt(br.readLine())-1;
        char result = arr[index];

        bw.write(result);
        bw.newLine();
        bw.flush();

        br.close();
        bw.close();

    }
}

