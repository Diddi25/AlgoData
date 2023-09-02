package se.kth.id1021.stack;

public class Benchmark1000 {

    public static void main(String[] args) {
        benchmark();
    }

    private static void benchmark() {

        int result = 0;

        Item[] bigElementArray = buildExpression(5);

        Calculator calculator = new Calculator(bigElementArray);

        long t0 = System.nanoTime();

        result = calculator.run();

        long t1 = System.nanoTime();

        System.out.println("resolution " + (t1 - t0)/1000 + " millisekunder");

        System.out.println("Calculator: result = " + result);
    }

    private static Item[] buildExpression(int elements) {

        Item[] bigElementArray = new Item[elements];

        int upperLimit = (elements/2) + 1;

        for (int i = 0; i < upperLimit; i++) {
            bigElementArray[i] = Item.Value(7);
        }

        for (int i = upperLimit; i < elements; i++) {
            bigElementArray[i] = Item.Add();
        }

        return bigElementArray;
    }

}

