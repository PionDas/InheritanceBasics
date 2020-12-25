public class Main {
    public static void main(String[] args) {
    Bird phoenix = new Bird("Nina", "Golden", 2, true,2);
    System.out.println(phoenix.getName());

    phoenix.eat("Meat");
    phoenix.fly(100);
   // System.out.println(phoenix.getWings());
    phoenix.fly();
    }
}
