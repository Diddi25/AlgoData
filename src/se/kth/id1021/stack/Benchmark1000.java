package se.kth.id1021.stack;

public class Benchmark1000 {

    public static void main(String[] args) {
        benchmark();
    }

    private static void benchmark() {

        int result = 0;

        Item[] bigElementArray = buildExpression(5000);

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

/**
 * 82,3
 * 86,2
 * 81,2
 * 83,6
 * 83,2
 */

/**
 * 109,7
 * 89,1
 * 83,7
 * 96,4
 * 140,0
 */

/**
 * 145,4
 * 204,6
 * 126,2
 * 112,9
 * 226,3
 */

/**
 * 124,9
 * 151,7
 * 138,1
 * 205,9
 * 125,5
 */

/**
 * 254,7
 * 247,5
 * 213,0
 * 259,8
 * 247,5
 */

