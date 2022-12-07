import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  // 자료구조 - 큐 :  삽입은 끝에서 삭제는 앞에서
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    Queue<Integer> queue = new LinkedList<>();

    int N = sc.nextInt();

    for(int i = 1; i <= N; i++) {
      // 맨 뒤 데이터 삽입
      queue.offer(i);
    }

    while(queue.size() > 1) {
      // 맨 앞 데이터 삭제
      queue.poll();
      // 맨 앞 데이터 삭제 후 맨 위로 올라온 데이터를 마지막 인덱스에 데이터 삽입
      queue.offer(queue.poll());
    }

    System.out.println(queue.poll());
  }
}