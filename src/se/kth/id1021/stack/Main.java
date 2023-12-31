package se.kth.id1021.stack;

public class Main {

    public static void main(String[] args) {

        Item[] expression = {
                Item.Value(10),
                Item.Value(2),
                Item.Value(5),
                Item.Mul(),
                Item.Add(),
        };

        long t0 = System.nanoTime();

        Calculator calculator = new Calculator(expression);

        int result = calculator.run();

        System.out.println("Calculator: result = " + result);

        long t1 = System.nanoTime();

        System.out.println(" resolution " + (t1 - t0) + " nanoseconds");
    }

}