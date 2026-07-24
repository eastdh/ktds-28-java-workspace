import java.util.Arrays;

class Solution {
  public static void main(String[] args) {
    Solution my = new Solution();
    // TCs
    String[] seoul = {"Jane", "Kim"}; // TC #1

    // Solution output
    String output = my.solution(seoul);
    System.out.println(output);
  }

  public String solution(String[] seoul) {
    return "김서방은 " + Arrays.asList(seoul).indexOf("Kim") + "에 있다";
  }
}
