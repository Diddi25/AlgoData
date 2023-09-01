package se.kth.id1021.stack;

public class Calculator {

    Item[] expression;
    int instructionPointer;
    Stack stack;

    public Calculator(Item[] expression) {
        this.expression = expression;
        this.instructionPointer = 0;
        this.stack = new StaticStack(); //Kan ändras till DynamicStack()
    }

    public int run() {
        while(instructionPointer < expression.length) {
            step();
        }
        return stack.pop();
    }

    public void step() {

        Item next = expression[instructionPointer++];

        switch (next.type()) {
            case ADD: {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(x + y);
                break;
            }
            case SUB: {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(x - y);
                break;
            }
            case MUL: {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(x*y);
                break;
            }
            case DIV: {
                int x = stack.pop();
                int y = stack.pop();
                stack.push(x/y);
                break;
            }
            case VALUE: {
                stack.push(next.value());
                break;
            }
        }
    }

}
