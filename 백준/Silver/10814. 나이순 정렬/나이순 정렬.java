import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) throws IOException {

    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    String[][] arr = new String[N][2];


    for(int i = 0; i < N; i++) {
      // 나이
      arr[i][0] = in.next();
      // 이름
      arr[i][1] = in.next();
    }


    Arrays.sort(arr, new Comparator<String[]>() {
      // 나이순으로 정렬
      @Override
      public int compare(String[] s1, String[] s2) {
        return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
      }

    });

    for(int i = 0; i < N; i++) {
      System.out.println(arr[i][0] + " " + arr[i][1]);
    }

  }
}


