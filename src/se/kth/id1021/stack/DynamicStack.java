package se.kth.id1021.stack;

public class DynamicStack extends Stack {

    private int[] dynamicStack = new int[4];
    private int dynamicStackPointer = 0;

    @Override
    public void push(int value) {
        if(dynamicStackPointer == dynamicStack.length - 1) {
            copyItemsToNewStack(new int[dynamicStack.length * 2]);
        }
        dynamicStack[dynamicStackPointer] = value;
        dynamicStackPointer++;
    }

    @Override
    public int pop() {
        if(dynamicStack.length == 0) {
            return 0;
        }
        determineIfStackShouldShrink();
        int popNumber = dynamicStack[--dynamicStackPointer];
        dynamicStack[dynamicStackPointer] = 0;
        return popNumber;
    }

    private void determineIfStackShouldShrink() {
        if(dynamicStack.length / 2 > dynamicStackPointer - 1) {
            copyItemsToNewStack(new int[dynamicStack.length / 2]);
        }
        return;
    }

    private void copyItemsToNewStack(int[] newDynamicStack) {
        for(int i = 0; i < dynamicStackPointer; i++) {
            newDynamicStack[i] = dynamicStack[i];
        }
        dynamicStack = newDynamicStack;
    }
}
