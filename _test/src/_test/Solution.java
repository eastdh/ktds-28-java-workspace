package _test;

class Solution {
  public static void main(String[] args) {
    Solution my = new Solution();
    // TCs
    String my_string = "i love you"; // TC #1
    // String my_string = "programmers";		//TC #2

    // Solution output
    String[] output = my.solution(my_string);
    System.out.print("[");
    for (int i = 0; i < output.length; i++) {
      System.out.print(output[i]);
      if (i == (output.length - 1)) break;
      else System.out.print(", ");
    }
    System.out.println("]");
  }

  public String[] solution(String my_string) {
    String[] answer = my_string.split(" ");
    return answer;
  }
}
