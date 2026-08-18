class Solution {
  public static void main(String[] args) {
    Solution my = new Solution();
    // TCs
    // int[] number = {-2, 3, 0, 2, -5}; // TC #1
    // int[] number = {-3, -2, -1, 0, 1, 2, 3}; // TC #2
    int[] number = {-1, 1, -1, 1}; // TC #3

    // Solution output
    int output = my.solution(number);
    System.out.println(output);
  }

  public int solution(int[] number) {
    int answer = 0;
    for (int i = 0; i < number.length - 2; i++) {
      for (int j = i + 1; j < number.length - 1; j++) {
        for (int k = j + 1; k < number.length; k++) {
          if (number[i] + number[j] + number[k] == 0) {
            answer++;
          }
        }
      }
    }
    return answer;
  }
}
