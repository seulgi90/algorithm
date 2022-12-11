import java.util.Scanner;

public class Main {

  //  문제
  //  김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 
  //  그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
  //  이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 
  //  블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
  //  N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // N장의 카드
    int N = sc.nextInt();
    // 블랙잭
    int M = sc.nextInt();
    // 3장의 합
    int sum = 0;
    // M에 최대한 가까운 3장의 합 = 근사치
    int tmp = 0;

    int arr[] =  new int[N];

    for(int i = 0; i < N; i++) {
      // 카드에 적힌 수 
      arr[i] = sc.nextInt();
    }

    for (int i = 0; i < N; i++) {

      // i+1째에 위치한 arr부터
      for (int j = i+1; j < N; j++) {

        // j+1째에 위치한 arr부터 
        for (int k = j+1; k < N; k++) {

          sum = arr[i] + arr[j] + arr[k]; 

          // tmp보다 크고 블랙잭보다 작거나 같으면 
          if(tmp < sum && sum <= M) {

            // 3장의 합을 tmp에 넣는다
            tmp = sum;
          }
        }
      }
    }

    // 가장 근접한 근사치 출력
    System.out.println(tmp);


  }
}

