import java.util.Scanner;

public class Main {

  // 최대 공약수는 두 개 이상의 수가 공통으로 가지는 약수 중 가장 큰 수
  // 예) 두 수 18과 24가 있다
  // 18의 약수 : 1, 2, 3, 6, 9, 18
  // 24의 약수 : 1, 2, 3, 4, 6, 8, 12, 24
  // 이들 약수중에 공통으로 가지는 약수는 {1, 2, 3, 6}이고 이들 중 가장 큰 수는 6
  // (유클리드 호제법)
  // GCD(581, 322)일 때 r(나머지) = 259
  // 즉, GCD(581, 322) = GCD(322, 259)
  // 그럼 다시 GCD(322, 259)를 보면 r=63
  // GCD(322, 259) = GCD(259, 63)
  // 또 다시 GCD(259, 63)을 보면 r=7
  // 즉, GCD(259, 63) = GCD(63, 7)이다
  // 다시 GCD(63, 7)을 보면 r=0 이다
  // 그러면 GCD(63, 7) = GCD(7, 0)이다
  // 결과적으로 나머지가 없다는 것은 공통된 약수로 나누어 떨어진다는 의미이므로 7이 최대공약수가 된다
  // => GCD(581, 322) = GCD(322, 259) = GCD(259, 63) =  GCD(63, 7) = GCD(7, 0) = 7
  // 최소 공배수: GCD(최대 공약수)를 구해 준 뒤 두 의 곱에서 최대 공약수로 나누기

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();

    // 최대 공약수
    int d = gcd(a, b);  

    System.out.println(d);
    System.out.println(a * b / d);

  }

  // 최대공약수 재귀 방식
  public static int gcd(int a, int b) {
    if (b == 0)
      return a;

    // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
    return gcd(b, a % b);
  }
}