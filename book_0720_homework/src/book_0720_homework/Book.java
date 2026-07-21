package book_0720_homework;

public class Book {

  int isbn; // String이 더욱 적합하다!
  String title;
  String subTitle;
  Author author;
  String date;
  String category;
  String description;

  float avgStar; // 계산 값은 클래스에 포함시키지 않는다!
  Review[] reviews = new Review[10];

  int stock;
  int price;
}
