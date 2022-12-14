import java.io.IOException;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) throws IOException {

    Scanner in = new Scanner(System.in);

    int T = in.nextInt();


    for(int i = 0; i < T; i++) {

      int H = in.nextInt();
      int W = in.nextInt();
      int N = in.nextInt();

      // 만약 N = 6 이고, H = 6 이라면 나머지가 0 이 되어 0층이 되어버린다
      // 배정해야 되는 층은 6층
      
      // N = 12 , H = 6 이여도 12 % 6 = 0 으로 0층이라는 값이 나오지만 배정해야 되는 층은 6층
      // 즉, N % H = 0 일 때는 H 층이 배정받는 층 수가 된다
      if(N % H == 0) {
        // *100 =>  YXX 또는 YYXX 에서 볼 수 있듯이 최소 100의 자릿수부터 시작하므로, Y 에 100을 곱해야한다
        System.out.println((H * 100) + (N / H));

      } else {
        // (N / H) + 1 => N = 3 이고, H = 8 일 때 나눗셈을 하면 몫이 0 이지만, X 는 0 이 아닌 1 부터 시작하기 때문
        System.out.println(((N % H) * 100) + ((N / H) + 1));
      }
    }
  }
}


