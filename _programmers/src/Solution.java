class Solution {
  public static void main(String[] args) {
    Solution my = new Solution();
    // TCs
    // int x = 10;
    // int x = 12;
    int x = 11;
    // int x = 13;

    // Solution output
    boolean output = my.solution(x);
    System.out.println(output);
  }

  public boolean solution(int x) {
    int sum = 0;
    int n = x;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return x % sum == 0;
  }
}
