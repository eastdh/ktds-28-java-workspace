
class Solution {
  public static void main(String[] args) {
    Solution my = new Solution();
    // TCs
    String s = "Zbcdefg"; // TC #1

    // Solution output
    String output = my.solution(s);
    System.out.println(output);
  }

  public String solution(String s) {

    for (int str : s.chars().toArray()) {}

    // 대문자 소문자 분리
    // 각각 .chars().toArray()해서 sort

    return s;
  }
}
