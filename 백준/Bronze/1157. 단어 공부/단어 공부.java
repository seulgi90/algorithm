import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] arr = new int[26]; // 영문자의 개수는 26개임
    String s = in.next().toUpperCase();

    int max = -1;
    char st = '?';

    for (int i = 0; i< s.length();i++) {
      arr[s.charAt(i)-65]++;

      if(max < arr[s.charAt(i)-65]) {
        max = arr[s.charAt(i) -65];
        st = s.charAt(i);

      } else if (max == arr[s.charAt(i)-65]) {
        st = '?';
      }
    
    }
        System.out.println(st);
  }  
}