public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        //test add
        System.out.println(myCalculator.add(5,7));
        //test subtract
        System.out.println(myCalculator.subtract(45,11));
        //test multiply
        System.out.println(myCalculator.multiply(17,3));
        //test divide
        System.out.println(myCalculator.divide(15,3));
        //test module
        System.out.println(myCalculator.module(154,3));
    }
}
