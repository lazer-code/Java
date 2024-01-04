public class Main
{
    public static boolean isPalindrome (Stack<Character> s) // Ex1
    {
        Stack<Character> t = new Stack<Character>();
        Stack<Character> t2 = new Stack<Character>();

        while (!s.isEmpty())
        {
            t.push(s.top());
            t2.push(s.pop());
        }

        while (!s.isEmpty())
            s.push(s.pop());

        while (!s.isEmpty())
            if (!s.pop().equals(t.pop()))
                return false;

        return true;
    }

    public static int sumMaxList (Stack<Integer>[] s) // Ex2
    {
        int sum = 0;

        for (int i = 0; i < s.length; i++)
            sum += getMax(s[i]);

        return sum;
    }

    public static int getTopsSum (Node<Stack<Integer>> s) // Ex3
    {
        int sum = 0;

        while (s.hasNext())
        {
            if (!s.getValue().isEmpty())
                sum += s.getValue().top();

            s = s.getNext();
        }

        sum += s.getValue().top();

        return sum;
    }

    public static int getMax (Stack<Integer> s) // Additional function for Ex2
    {
        Stack<Integer> t1 = new Stack<Integer>();
        Stack<Integer> t2 = new Stack<Integer>();

        int max = 0;

        if (s.isEmpty())
            return 0;

        while (!s.isEmpty())
        {
            t1.push(s.top());
            t2.push(s.pop());
        }

        while (!t2.isEmpty())
            if (t1.top() > max)
                max = t1.pop();

        while (!t1.isEmpty())
            s.push(t1.pop());

        return max;
    }
}