public class FreakyFriday{
  public static void main(String[] args){
    Person tess = new Person();
    tess.name = "Tess";
    tess.age = 40;

    Person anna = new Person();
    anna.name = "Anna";
    anna.age = 16;

    System.out.println("\n");
    System.out.println("\"Freaky Friday\"");
    System.out.println("\n");


    System.out.println("Single mother Tess Coleman is " + tess.age + " years old and her teenage daughter Anna is " + anna.age + ".");
    System.out.println("\n");

    ageSwap(tess, anna);

    System.out.println("But after receiving cryptic fortunes at a Chinese restaurant, the two wake up the next day to discover that Tess is " + tess.age + " and Anna is " + anna.age + ". Freaky!");
    System.out.println("\n");
  }
  private static void ageSwap(Person a, Person b){
    int c = a.age;
    a.age = b.age;
    b.age = c;
  }
  static class Person{
    String name;
    int age;
  }
}