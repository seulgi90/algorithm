class Solution {
    public int[] solution(int num, int total) {
        
          int[] answer = new int[num];

        int m = total / num;
        int n = total % num == 0 ? num / 2 : num / 2 - 1;

        int s = m - n;

        for (int i = 0; i < num; i++) {
            answer[i]= s + i; 
        }
        return answer;
    }   
 
}