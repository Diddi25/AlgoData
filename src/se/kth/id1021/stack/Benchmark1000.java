package se.kth.id1021.stack;

public class Benchmark1000 {

    public static void main(String[] args) {

        Item[] bigElementArray = new Item[1000];

        for (int i = 0; i < 501; i++) {
            bigElementArray[i] = Item.Value(7);
        }

        for (int i = 501; i < 1000; i++) {
            bigElementArray[i] = Item.Add();
        }

        long t0 = System.nanoTime();

        Calculator calculator = new Calculator(bigElementArray);

        int result = calculator.run();

        System.out.println("Calculator: result = " + result);

        long t1 = System.nanoTime();

        System.out.println(" resolution " + (t1 - t0) + " nanoseconds");

    }

}
