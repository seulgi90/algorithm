import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     

    int a = Integer.parseInt(br.readLine());

    int sum = 0;

    for(int i = 0; i < a; i++) {
      // 각 숫자의 아스키코드는 0을 의미하는 48을 빼주면 자신의 수를 가지게 된다
      sum += br.read() - 48;
    }

    System.out.print(sum);
  }
}