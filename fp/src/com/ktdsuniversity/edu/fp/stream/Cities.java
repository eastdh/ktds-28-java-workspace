package com.ktdsuniversity.edu.fp.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.ktdsuniversity.edu.fp.objects.City;
import com.ktdsuniversity.edu.fp.objects.CityList;

public class Cities {

  static final String PATH = "C:/Java Exam/java-stream-countries-states-cities-database-master/csv";
  static final String FILE_NAME = "states.csv";

  // 1. 모든 도시의 이름만 출력해본다.
  public static void printStateNames() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    cityList.map(City::getName) // Stream<String>
        .forEach(System.out::println); // void
  }

  // 2. countryName이 "South Korea"인 데이터의 Native를 중복없이 출력해본다.
  public static void printNative() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    cityList.filter(c -> c.getCountryName().equals("South Korea")) // Stream<City>
        .map(City::getNativeStr) // Stream<String>
        .distinct() // Stream<String>
        .forEach(System.out::println);
  }

  // 3. 모든 도시의 population을 출력해본다.
  public static void printPopulation() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    cityList.map(City::getPopulation) // Stream<Integer>
        .forEach(System.out::println);
  }

  // 4. 모든 도시의 population을 출력해본다. 단, 0 이상만 출력한다.
  public static void printPopulationWithoutZero() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    cityList.map(City::getPopulation) // Stream<Integer>
        .filter(i -> i > 0) // Stream<Integer>
        .forEach(System.out::println);
  }

  // 5. countryName이 "A"로 시작하는 국가의 도시들의 TimeZone을 중복없이 출력해본다.
  public static void printAsTimeZone() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    cityList.filter(c -> c.getCountryName().startsWith("A")) // Stream<City>
        .map(City::getTimezone) // Stream<String>
        .distinct() // Stream<string>
        .forEach(System.out::println);
  }

  // 6. countryId가 10 이상인 국가들의 도시명을 출력해본다.
  public static void printCountryIdOverTen() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    cityList.filter(c -> c.getCountryId() >= 10) // Stream<City>
        .map(City::getName)// Stream<String>
        .forEach(System.out::println);

  }

  // 7. countryName이 "South Korea"인 도시의 population 총 합을 출력해본다.
  public static void printSumOfSouthKoreaStates() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    int sumOfPopulation = cityList.filter(c -> c.getCountryName().equals("South Korea")) // Stream<City>
        .mapToInt(City::getPopulation) // IntStream
        .sum(); // int
    System.out.println(sumOfPopulation);

  }

  // 8. population 기준으로 내림차순 정렬해 10개 도시의 이름과 population을 출력해본다.
  public static void topTenPopulation() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    cityList.sequential() // Stream<City>
        .sorted((c1, c2) -> c2.getPopulation() - c1.getPopulation()) // Stream<City>
        .map(c -> c.getName() + ": " + c.getPopulation()) // Stream<String>
        .limit(10) // Stream<String>
        .forEach(System.out::println);
  }

  // 9. type이 "special self-governing province" 인 도시의 이름과 countryName을 출력해본다.
  public static void printSelfGoverning() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    cityList.filter(c -> c.getType().equals("special self-governing province")) // Stream<City>
        .map(c -> c.getName() + ", " + c.getCountryName()) // Stream<String>
        .forEach(System.out::println);
  }

  // 10. 모든 도시들을 id 별로 오름차순 정렬해 출력해본다.
  public static void printAscId() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    cityList.sequential() // Stream<city>
        .sorted((c1, c2) -> c1.getId() - c2.getId()) // Stream<city>
        .forEach(System.out::println);
  }

  // 11. iso2 값이 숫자 형태인 것만 출력해본다.
  public static void printIso2IsNumber() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    cityList.filter(c -> c.getIso2().matches("[0-9]+")) // Stream<City>
        .forEach(System.out::println);
  }

  // 12. iso2 값이 숫자형태가 아닌 도시의 국가명(countryName)을 오름차순 정렬해 출력해본다.
  public static void printIso2NotNumberCountryName() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    cityList.filter(c -> !c.getIso2().matches("[0-9]+")) // Stream<City>
        .map(City::getCountryName) // Stream<String>
        .distinct() // Stream<String>
        .sequential() // Stream<String>
        .sorted() // Stream<String>
        .forEach(System.out::println);
  }

  // 13. 국가명(countryName) 별 도시의 목록을 그룹핑하여 출력해본다.
  public static void printStatesGroupByCountry() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    Map<String, List<City>> groupMap = cityList.sequential() // Stream<City>
        .collect(Collectors.groupingBy(c -> c.getCountryName()));

    groupMap.forEach((k, v) -> {
      System.out.println(k + "-".repeat(50));
      v.forEach(System.out::println);
    });

  }

  // 14. latitude와 longitude가 없는 도시들의 이름만 출력해본다.
  public static void printNoLL() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    cityList.filter(c -> c.getLatitude() == null && c.getLongitude() == null) // Stream<City>
        .map(City::getName) // Stream<String>
        .forEach(System.out::println);
  }

  // 15. 국가명(countryName)이 Canada인 도시 중 3개는 건너띄고 2개만 출력해본다.
  public static void printCanadaSkipAndLimit() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    cityList.filter(c -> c.getCountryName().equals("Canada")) // Stream<city>
        .skip(3) // Stream<City>
        .limit(2) // Stream<City>
        .forEach(System.out::println);
  }

  // 16. level과 parentId가 0보다 큰 도시만 출력해본다.
  public static void printLevelAndParentIdAreOverZero() {
    Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    cityList.filter(c -> c.getLevel() > 0 && c.getParentId() > 0) // Stream<City>
        .forEach(System.out::println);
  }

  public static void main(String[] args) {

    // Stream<City> cityList = CityList.loadCityStream(PATH, FILE_NAME);
    // cityList.forEach(System.out::println);

    printStateNames();
    System.out.println("=".repeat(60));

    printNative();
    System.out.println("=".repeat(60));

    printPopulation();
    System.out.println("=".repeat(60));

    printPopulationWithoutZero();
    System.out.println("=".repeat(60));

    printAsTimeZone();
    System.out.println("=".repeat(60));

    printCountryIdOverTen();
    System.out.println("=".repeat(60));

    printSumOfSouthKoreaStates();
    System.out.println("=".repeat(60));

    topTenPopulation();
    System.out.println("=".repeat(60));

    printSelfGoverning();
    System.out.println("=".repeat(60));

    printAscId();
    System.out.println("=".repeat(60));

    printIso2IsNumber();
    System.out.println("=".repeat(60));

    printIso2NotNumberCountryName();
    System.out.println("=".repeat(60));

    printStatesGroupByCountry();
    System.out.println("=".repeat(60));

    printNoLL();
    System.out.println("=".repeat(60));

    printCanadaSkipAndLimit();
    System.out.println("=".repeat(60));

    printLevelAndParentIdAreOverZero();
    System.out.println("=".repeat(60));

  }

}
