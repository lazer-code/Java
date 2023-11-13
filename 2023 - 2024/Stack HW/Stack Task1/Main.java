public class Main
{
    public static boolean findNumber (Stack<Integer> stack, int num) // Ex1
    {
        Stack<Integer> tempStack = new Stack<Integer>();
        boolean flag = false;

        while (!stack.isEmpty())
        {
            int currNum = stack.pop();

            if (currNum == num)
                flag = true;

            tempStack.push(currNum);
        }

        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());
        
        return flag;
    }


    public static int numTimes (Stack<Integer> stack, int num) // Ex2
    {
        Stack<Integer> tempStack = new Stack<Integer>();
        int count = 0;

        while (!stack.isEmpty())
        {
            int currNum = stack.pop();

            if (currNum == num)
                count++;

            tempStack.push(currNum);
        }

        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());

        return count;
    }

    public static <T> int valTimes (Stack<T> stack, T val) // Ex3
    {
        int count = 0;

        Stack<T> tempStack = new Stack<T>();

        while (!stack.isEmpty())
        {
            T currVal = stack.pop();

            if (currVal.equals(val))
                count++;

            tempStack.push(currVal);
        }

        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());

        return count;
    }

    public static Stack<Integer> removeDuplications (Stack<Integer> stack) // Ex4
    {
        Stack<Integer> tempStack = new Stack<Integer>();

        while (!stack.isEmpty())
        {
            if (valTimes(tempStack, stack.top()) == 0)
                tempStack.push(stack.top());

            stack.pop();
        }

        return tempStack;
    }

    public static <T> Stack<T> joinTwoStacks (Stack<T> stack1, Stack<T> stack2) // Ex5
    {
        Stack<T> tempStack = new Stack<T>();

        while (!stack1.isEmpty())
        {
            if (valTimes(tempStack, stack1.top()) == 0)
                tempStack.push(stack1.top());

            stack1.pop();
        }

        while (!stack2.isEmpty())
        {
            if (valTimes(tempStack, stack2.top()) == 0)
                tempStack.push(stack2.top());

            stack2.pop();
        }

        return tempStack;
    }

    public static boolean isStackSorted(Stack<Integer> stack) // Ex6
    {
        Stack<Integer> tempStack = new Stack<Integer>();

        boolean sorted = true;

        while (!stack.isEmpty())
        {
            int current = stack.pop();

            while (!tempStack.isEmpty() && tempStack.top() > current)
            {
                stack.push(tempStack.pop());
                sorted = false;
            }

            tempStack.push(current);
        }

        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());

        return sorted;
    }

    public static void removeMax (Stack<Integer> stack) // Ex7
    {
        Stack<Integer> tempStack = new Stack<Integer>();

        int max = getMax(stack);

        while (!stack.isEmpty())
        {
            if (stack.top() != max)
                tempStack.push(stack.pop());

            else
                stack.pop();
        }

        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());
    }


    public static void circularShift (Stack<Integer> stack)
    {
        Stack<Integer> tempStack = new Stack<Integer>();

        int temp = stack.pop();

        while (!stack.isEmpty())
            tempStack.push(stack.pop());

        stack.push(temp);

        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());
    }

    public static int getMax (Stack<Integer> stack)
    {
        int max = stack.top();

        while (!stack.isEmpty())
        {
            if (stack.top() > max)
                max = stack.top();

            stack.pop();
        }

        return max;
    }
}
