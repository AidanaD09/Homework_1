public class Main {
    public static void main(String[] args) {
      String printThreeWords1 = "Orange";
      String printThreeWords2 = "Banana";
      String printThreeWords3 = "Apple";

      System.out.println(printThreeWords1);
      System.out.println(printThreeWords2);
      System.out.println(printThreeWords3);

      int a = 1;
      int b = -1;
      int checkSumSign = a + b;
      if (checkSumSign >= 0) {
        System.out.println("Сумма положительная");
      }
      else {
        System.out.println("Сумма отрицательная");
      }

      System.out.println(checkSumSign);

      int value = 6;
      int printColor = value;
      if (value <= 0) {
        System.out.println("Красный");
      }
      if (value <= 100) {
        System.out.println("Желтый");
      }
      if (value > 100) {
        System.out.println("Зеленый");
      }

      System.out.println(printColor);

      compareNumbers();
      int c = 96;
      int d = 69;
      if (c >= d) {
        System.out.println("c >= d");
      }
      else {
        System.out.println("c < d");
      }
      System.out.println(compareNumbers);








    }
}