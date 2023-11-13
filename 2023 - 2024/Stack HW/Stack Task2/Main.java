public class Main
{
    public static <T> boolean isSame (Stack<T> stack1, Stack<T> stack2) // Ex1
    {
        Stack<T> temp1 = stack1;
        Stack<T> temp2 = stack2;

        while (!stack1.isEmpty() && !stack2.isEmpty())
        {
            if (!stack1.top().equals(stack2.top()))
                return false;

            temp1.push(stack1.pop());
            temp2.push(stack2.pop());
        }

        if (stack1.isEmpty() && !stack2.isEmpty() || !stack1.isEmpty() && stack2.isEmpty())
            return false;

        return true;
    }

    public static Stack<Integer> sort (Stack<Integer> stack) // Ex2
    {
        Stack<Integer> temp = new Stack<Integer>();

        while (!stack.isEmpty())
        {
            int curr = stack.pop();

            while (!temp.isEmpty() && temp.top() > curr)
                stack.push(temp.pop());

            temp.push(curr);
        }
        while (!temp.isEmpty())
            stack.push(temp.pop());

        return temp;
    }

    public static void sortedInsert (Stack<Integer> stack, int n) // Ex3
    {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty() && stack.top() < n)
            tempStack.push(stack.pop());

        stack.push(n);

        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());
    }

    void ChangeHalf(Stack<Character> s) // Ex4
    {
        Stack<Character> temp1 = new Stack<Character>();
        Stack<Character> temp2 = new Stack<Character>();

        int size = 0;

        while (!s.isEmpty())
        {
            char curr = s.pop();

            temp1.push(curr);
            temp2.push(curr);

            size++;
        }

        while (!temp2.isEmpty())
            s.push(temp2.pop());

        int half = size / 2;

        for (int i = 0; i < half; i++)
        {
            char top = s.pop();
            char bottom = s.pop();

            s.push(top);
            s.push(bottom);
        }
    }

    public static boolean isUp (Stack<Integer> stack)
    {
        Stack<Integer> temp = new Stack<Integer>();

        int last = stack.pop();

        while (!stack.isEmpty())
        {
            int curr = stack.pop();

            temp.push(curr);

            if (curr > last)
                last = curr;

            else
                return false;
        }

        return true;
    }

    public static boolean contains (Stack<Integer> s1, Stack<Integer> s2) // Ex6
    {
        Stack<Integer> t2 = new Stack<Integer>();
        Stack<Integer> clone = new Stack<Integer>();

        int curr1 = s1.top();

        while (!s2.isEmpty())
        {
            int curr2 = s2.pop();

            t2.push(curr2);
            clone.push(curr2);
        }

        while (!clone.isEmpty())
            s2.push(clone.pop());

        boolean started = false;

        while (!t2.isEmpty())
        {
            if (t2.top() == curr1)
            {
                s1.pop();
                curr1 = s1.top();

                started = true;
            }

            if (t2.top() != curr1 && started)
                return false;
        }
        return true;
    }
}
