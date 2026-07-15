package workflow;

public class LoremIpsum {

  public static void main(String[] args) {

    // longText 문자열 변수에 's'가 몇 개 있는지 세어보기
    String longText =
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since 1966, when designers at Letraset and James Mosley, the librarian at St Bride Printing Library in London, took a 1914 Cicero translation and scrambled it to make dummy text for Letraset's Body Type sheets. It has survived not only many decades, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised thanks to these sheets and more recently with desktop publishing software like Aldus PageMaker and Microsoft Word including versions of Lorem Ipsum.";
    char[] letters = longText.toCharArray();

    int sCount = 0;
    for (int i = 0; i < letters.length; i++) {
      if (letters[i] == 's') {
        sCount++;
      }
    }
    System.out.println(sCount);

    // 알파벳 전부 세어보기
    char[] lowLetters = longText.toLowerCase().toCharArray();
    int[] counts = new int[26];

    for (int i = 0; i < lowLetters.length; i++) {
      int letterNum = (int) lowLetters[i];
      if (letterNum >= 97 && letterNum <= 123) {
        counts[letterNum - 97]++;
      }
    }

    for (int i = 0; i < 26; i++) {
      System.out.println((char) (97 + i) + " : " + counts[i]);
    }
  }
}
