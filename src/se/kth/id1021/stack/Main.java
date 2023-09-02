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

        System.out.println(" resolution " + (t1 - t0)/100000 + " milliseconds");
    }

    /**
     * 13,7 s
     * 16,6 s
     * 13,5
     * 13,8
     * 14,2
     * == medel 14,3
     */
    /**
     * 13,4
     * 14,4
     * 13,2
     * 13,8
     * 14,8
     */
}