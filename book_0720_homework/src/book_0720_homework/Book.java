package book_0720_homework;

public class Book {

  int ISBN;
  String title;
  String subTitle;
  Author author;
  String date;
  String category;
  String description;

  float avgStar;
  Review[] reviews = new Review[10];

  int stock;
  int price;
}
