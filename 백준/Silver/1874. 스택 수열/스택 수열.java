
import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    int n = sc.nextInt();

    Stack<Integer> stack = new Stack<>();

    int start = 0;

    while(n-- > 0) {
      int value = sc.nextInt();

      if (value > start) {
        // start + 1부터 입력받은 value 까지 push
        for(int i = start + 1; i <= value; i++) {
          stack.push(i);
          sb.append('+').append('\n');
        }
        // 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화 
        start = value;
      } else if (stack.peek() != value) {
        System.out.println("NO");
        return;
      }

      stack.pop();
      sb.append('-').append('\n');

    }
    System.out.println(sb);
  }
}