import java.util.Scanner;

public class Main {

  public static int getSolution(int startRow, int startCol, String[] board) {
    // {"첫번째 줄 흰색 시작으로 정의", "두번째 줄 블랙 시작으로 정의"}
    String[] orgBoard = { "WBWBWBWB", "BWBWBWBW" };
    // 구할 값
    int whiteSol = 0;
    for (int i = 0; i < 8; i++) {
      int row = startRow + i;
      for (int j = 0; j < 8; j++) {
        int col = startCol + j;
        // 현재 체스판의 row에있는 col에 있는 한 값을 가져와서 비교
        if (board[row].charAt(col) != orgBoard[row % 2].charAt(j)) {
          // 다르다면 화이트 체스판을 만들기 위해서는 하나를 더 칠해야한다
          whiteSol++;
        }
      }
    }
    // whiteSol의 값과 blackSol의 값 중에서 더 작은 값을 리턴
    return Math.min(whiteSol, 64 - whiteSol);
  }


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int row = sc.nextInt();
    int col = sc.nextInt();
    sc.nextLine();

    String board[] = new String[row];
    for (int i = 0; i < row; i++) {
      board[i] = sc.nextLine();
    }

    // 체스판 자르기
    int sol = Integer.MAX_VALUE;
    // -8 : 체스판을 만들 수 있는 마지막 row와 col index에 i와 j에 담는다
    for (int i = 0; i <= row -8; i++) {
      for (int j = 0; j <= col -8; j++) {
        // 현 체스판 최소비용 구하기
        int CntSol = getSolution(i,j,board);
        // 전체 최적의 값과 비교
        if (sol > CntSol) {
          // 가장 작은 값을 sol에 담는다
          sol = CntSol;
        }
      } 
    }
      System.out.println(sol);
      sc.close();
  }
}