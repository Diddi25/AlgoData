package se.kth.id1021.stack;

public class StaticStack extends Stack {

    private final int[] staticStack = new int[1024];
    private int staticStackPointer = 0;

    @Override
    public void push(int value) {
        if (staticStackPointer == staticStack.length - 1) {
            throw new StackOverflowError("Full stack, cannot push");
        }
        staticStack[staticStackPointer] = value;
        staticStackPointer++;
    }

    @Override
    public int pop() {
        if (staticStack.length == 0) {
            return 0;
        }
        int popNumber = staticStack[--staticStackPointer];
        staticStack[staticStackPointer] = 0;
        return popNumber;
    }

}
