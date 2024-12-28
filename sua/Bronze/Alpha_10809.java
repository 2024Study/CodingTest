package CodingTest.sua.Bronze;

import java.io.*;

public class Alpha_10809 {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //영어 소문자들을 alpha에 넣기
        //a~z까지 음 아스키코드로 써볼까? 아니면 각 알파벳마다 그걸 찾아야하나..?

        //걍 애초에 어떤걸 입력하든 소문자로 변환해서 저장해버리자
        String inputLower = br.readLine().toLowerCase();

        //저 inputLower문자열을 input이라는 문자하나하나 배열로 변환하기 응 indexOf는 String만 지원해
//        char[] input = inputLower.toCharArray();


        //if문으로 조건문 돌려서 공백 구분하여 출력하기
        //indexOf는 해당되는 값없으면 자동으로 -1 출력해주네 개꿀
        for(char c = 'a'; c<='z'; c++){
            int index = inputLower.indexOf(c);
            bw.write(index + " ");
        }

        bw.flush();
        bw.close();

    }
}
