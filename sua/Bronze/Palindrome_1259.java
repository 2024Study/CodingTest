package CodingTest.sua.Bronze;

import java.io.*;

public class Palindrome_1259 {
    //스택과 큐를 이용해서 두개의 값이 일치하는지에 따라 팰린드롬 판별할 수 있지만 이건 메모리 사용량이 높다고함
    //stringbuilder의 resvers 메소드를 쓰면되는데 이것도 메모리 사용량 많아지고 먼가 그냥 이제 라이브러리보다 노가다 로직에 익숙해질예정
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//  이게 reverse 메소드로 문자열 뒤집기
//        while (true) {
//            String str = br.readLine();
//            if (str.equals("0")) break; // "0" 입력 시 종료
//
//            String reversedStr = new StringBuilder(str).reverse().toString(); // 문자열 뒤집기
//
//            if (str.equals(reversedStr)) {
//                bw.write("yes\n");
//            } else {
//                bw.write("no\n");
//            }
//        }
//
//        bw.flush();
//        bw.close();
//    }


        //양끝에서 비교

        while (true) {
            String str = br.readLine();
            if (str.equals("0")) break; // "0" 입력 시 종료

            boolean isPalindrome = true;
            int length = str.length();
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.flush();
        bw.close();
    }
}

