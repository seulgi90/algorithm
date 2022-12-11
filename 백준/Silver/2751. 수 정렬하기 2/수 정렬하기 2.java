import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 변수 num에 값을 공백 단위로 구분해서 입력받는다
    int num = Integer.parseInt(br.readLine());

    ArrayList<Integer> arr = new ArrayList<>();

    for (int i = 0; i < num; i++) {
      // add 메소드를 사용해서 개행으로 배열 arr[num]에 값을 입력, 리스트에 마지막에 데이터가 추가되게 된다
      arr.add(Integer.parseInt(br.readLine()));
      //      arr.add(num);
      //      System.out.println("num:" + arr.add(num));

    }
    // 리스트 배열 오름차순 정렬
    Collections.sort(arr);

    StringBuilder sb = new StringBuilder();

    for(int value : arr) {
      sb.append(value).append("\n");
    }
    System.out.println(sb);


  }
}
