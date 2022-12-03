import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());

    String[] arr = new String[num];

    for(int i =  0 ; i < num ; i++) {
      arr[i] = br.readLine();
    }

    // Arrays.sort는 기본적으로 인자를 2가지를 받는다 : Array.sort(arr, new Comparator <T>)
    Arrays.sort(arr, new Comparator<String>() {

      // 기존의 규칙이 아닌 새로운 규칙으로 정렬을 해야 하므로 @Override (오버 라이딩)을 통해 
      // Comparator에 있는 메서드인 compare를 재정의
      @Override
      public int compare(String s1, String s2) {

        // compareTo: String문자열을 사전 순으로 정렬
        // 양수가 반환되면 위치가 서로 바뀌고
        if (s1.length() > s2.length()) {
          return 1;

          // 음수가 반환되면 위치가 바뀌지 않는다
        } else if (s1.length() < s2.length()) {
          return -1;

          // 문자열 길이가 같다면 사전 순 정렬
        } else {
          return s1.compareTo(s2);
        }
      }
    });



    System.out.println(arr[0]);

    // 중복 제거
    for(int i = 1; i < num; i++) {
      if (!arr[i].equals(arr[i - 1])) {
        System.out.println(arr[i]);
      }
    }
  }
}