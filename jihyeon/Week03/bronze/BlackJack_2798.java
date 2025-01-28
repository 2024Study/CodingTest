package CodingTest.jihyeon.Week03.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BlackJack_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer dealer = new StringTokenizer(br.readLine(), " ");
        int cardCount = Integer.parseInt(dealer.nextToken());
        int gameNumber = Integer.parseInt(dealer.nextToken());

        StringTokenizer cards = new StringTokenizer(br.readLine(), " ");
        int[] numbers = new int[cardCount];
        int result = 0;

        for (int i = 0; i < cardCount; i++) {
            numbers[i] = Integer.parseInt(cards.nextToken());
        }
        for (int i = 0; i < cardCount - 2; i++) {
            for (int j = i + 1; j < cardCount - 1; j++) {
                for (int k = j + 1; k < cardCount; k++) {
                    int sum = numbers[i] + numbers[j] + numbers[k];
                    if (sum <= gameNumber && sum > result) {
                        result = sum;
                    }
                }
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
