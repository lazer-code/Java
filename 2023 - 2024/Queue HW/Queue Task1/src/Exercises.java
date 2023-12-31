public class Main
{
    public static void remDups(Queue<Integer> q) // Ex1
    {
        Queue<Integer> temp = new Queue<>();
        boolean flag = false;

        q.insert(-999);

        while (!q.isEmpty())
        {
            temp.insert(-999);

            while(temp.head() != -999)
            {
                if (temp.head() == q.head() && q.head() != -999)
                    flag = true;

                temp.insert(temp.remove());
            }

            temp.remove();

            if (!flag)
                temp.insert(q.remove());

            else
                q.remove();
        }

        while (!temp.isEmpty())
            q.insert(temp.remove());
    }

    public static <T> boolean search(Queue<T> q, T val) // Ex2
    {
        Queue<T> newQ = new Queue<>();
        boolean flag = false;

        while (!q.isEmpty())
        {
            if (q.head().equals(val))
                flag = true;

            newQ.insert(q.remove());
        }

        return flag;
    }

    public static void merge(Queue<Integer> q1, Queue<Integer> q2) // Ex3
    {
        Queue<Integer> q3 = new Queue<>();

        while (!q1.isEmpty() && !q2.isEmpty())
        {
            if (q1.head() > q2.head())
                q3.insert(q2.remove());

            else if (q2.head() > q1.head())
                q3.insert(q1.remove());

            else
            {
                q3.insert(q1.remove());
                q3.insert(q2.remove());
            }
        }

        if (q1.isEmpty())
            while (!q2.isEmpty())
                q3.insert(q2.remove());

        else
            while(!q1.isEmpty())
                q3.insert(q1.remove());

        while (!q3.isEmpty())
            q1.insert(q3.remove());
    }

    public static Queue<Integer> onlyTwo(Queue<Integer> q) // Ex 4
    {
        Queue<Integer> newQ = new Queue<>();
        q.insert(-999);

        while (q.head() != -999)
        {
            int val = q.remove();

            if (search(q, val))
                newQ.insert(val);

        }

        q.remove();

        return newQ;
    }

    public static <T> Queue<T> reverse(Queue<T> q) // Ex5
    {
        Queue<T> temp = new Queue<>();
        Queue<T> newQ = new Queue<>();
        T val = null;
        T lastVal = q.head();
        T head;

        while (!lastVal.equals(q.head()))
        {
            while (!q.isEmpty())
            {
                val = q.head();
                temp.insert(q.remove());
            }
            lastVal = val;

            newQ.insert(lastVal);

            while (!temp.isEmpty())
                q.insert(temp.remove());
        }

        return newQ;
    }

    public static String getLast(Queue<String> q, int k)
    {
        Queue<String> temp = new Queue<>();

        String lastName = "";
        int i = 1;
        while (!q.isEmpty())
        {
            if (i % k == 0)
            {
                lastName = q.head();
                temp.insert(q.remove());
            }

            i++;
        }
        return lastName;
    }

}

