package _test;

class Solution {
  public static void main(String[] args) {
    Solution my = new Solution();
    // TCs
    String str1 = "abc"; // TC #1
    String str2 = "aabcc"; // TC #1
    // String str1 = "tbt";		//TC #2
    // String str2 = "tbbttb";		//TC #2

    // Solution output
    int output = my.solution(str1, str2);
    System.out.println(output);
  }

  public int solution(String str1, String str2) {
    int answer = str2.contains(str1) ? 1 : 0;
    return answer;
  }
}
