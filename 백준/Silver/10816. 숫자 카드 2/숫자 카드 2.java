import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int[] arr = new int[N];

    for(int i = 0; i < N; i++) {
      arr[i] = in.nextInt();
    }

    // 이진 탐색 조건: 정렬
    Arrays.sort(arr);

    int M = in.nextInt();

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < M; i++) {
      int key = in.nextInt();

      // upperBound와 lowerBound의 차이 값
      sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
    }
    System.out.println(sb);
  }


  private static int lowerBound(int[] arr, int key) {
    int lower = 0; 
    int upper = arr.length; 

    // lower가 upper랑 같아질 때 까지 반복
    while (lower < upper) {

      // mid 값 = 중간위치
      int mid = (lower + upper) / 2;

      // key 값이 중간 위치의 값보다 작거나 같을 경우
      if (key <= arr[mid]) {
        upper = mid;
      }
      // 중복 시 왼쪽 탐색
      else {
        lower = mid + 1;
      }

    }

    return lower;
  }

  private static int upperBound(int[] arr, int key) {
    int lower = 0; 
    int upper = arr.length; 

    while (lower < upper) {

      int mid = (lower + upper) / 2;

      if (key < arr[mid]) {
        upper = mid;
      }
      else {
        lower = mid + 1;
      }

    }

    return lower;
  }
}
