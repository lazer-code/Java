public class Main
{
    public static boolean findNumber(Stack<Integer> stack, int num)
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
}
