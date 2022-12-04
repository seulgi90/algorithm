import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {

      String str = br.readLine();

      boolean check = true;

      // 문자가 0일시 while문 탈출
      if(str.equals("0")) {
        break;
      }

      for (int i = 0; i < str.length()/2; i++) {

        // charAt() 함수를 이용해서 첫 인덱스와 마지막 인덱스부터 비교
        // 입력받은 값의 절반만큼 돌면서 하나는 맨 앞자리부터, 다른 하나는 맨 뒷자리부터 절반까지 같은지 검사
        if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
          check = false;
        }
      }

      if (check) {
        System.out.println("yes");
          
      } else {
        System.out.println("no");
      }
    }
  }
}