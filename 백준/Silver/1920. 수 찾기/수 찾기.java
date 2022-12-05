import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int[] arr = new int[N];

    for(int i = 0; i < N; i++) {
      arr[i] = in.nextInt();
    }

    // 이진탐색 조건 - 반드시 정렬이 되어있어야함
    Arrays.sort(arr);

    int M = in.nextInt();

    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < M; i++) {

      // 찾고자 하는 값이 있을 경우 1, 없을 경우 0을 출력
      if(binarySearch(arr, in.nextInt()) >= 0) {
        sb.append(1).append('\n');
      }
      else {
        sb.append(0).append('\n');
      }
    }
    System.out.println(sb);
  }

  // Arrays 클래스에 binarySearch 메서드 제공
  public static int binarySearch(int[] arr, int key) {

    // 탐색 범위 첫 번째 인덱스
    int lower = 0;

    // 탐색 범위 마지막 인덱스
    int upper = arr.length - 1;

    // lower가 upper보다 커지기 전까지 반복
    while(lower <= upper) {

      // 중간 위치 구하기
      int mid = (lower + upper) / 2;

      // key값이 중간 위치의 값보다 작을 경우
      if(key < arr[mid]) {
        upper = mid - 1;
      }

      // key값이 중간 위치의 값보다 클 경우
      else if(key > arr[mid]) {
        lower = mid + 1;
      }

      // key값과 중간 위치의 값이 같을 경우
      else {
        return mid;
      }
    }

    // 찾고자 하는 값이 존재하지 않을 경우: while문 종료
    return -1;

  }
}