import java.util.Scanner;

public class Main {

  // 소수 찾기 : 1보다 큰 자연수 중 1과 자신을 약수로 가지는 수
  // 예) 7이라 했을 때 1과 7은 검사 대상 제외 => 2 ~ 6 (N-1) 까지 계속 나눠보고
  // 나눠 떨어지면 소수가 아니고 나누어 떨어지는 수가 없다면 소수

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int count = 0;

    for(int i = 0; i < N; i++) {

      // 소수인경우 true, 아닌경우 false   
      boolean isPrime = true;

      int k = sc.nextInt();

      if(k == 1) {  
        // 1 인경우 소수가 아니므로 다음 반복문으로
        continue;
      }

      // Math.sqrt() :  제곱근을 구하는 함수
      for(int j = 2; j <= Math.sqrt(k); j++) {
        if(k % j == 0) {
          // 나누어 떨어지면 소수가 아니므로 false 반환
          isPrime = false;
          break;
        }
      }
      // 소수인 경우 count 값 증가
      if(isPrime) {
        count++;
      }
    }
    System.out.println(count);
  }
}