class Exercises
{
    public static Queue<Integer> frequencyQueue(Queue<Integer> q) // Ex2
    {
        Queue<Integer> t1 = new Queue<>();
        Queue<Integer> frequency = new Queue<>();


        while (!q.isEmpty())
        {
            int i = 0;
            boolean flag = false;

            Queue<Integer> t2 = new Queue<>();

            while (!frequency.isEmpty())
            {
                if (i % 2 == 0 && frequency.head().equals(q.head()))
                    flag = true;

                t2.insert(frequency.remove());
                i++;
            }

            while (!t2.isEmpty())
                frequency.insert(t2.remove());


            if (!flag)
            {
                frequency.insert(q.head());
                frequency.insert(countVal(q, q.head()));
            }

            t1.insert(q.remove());
        }

        while (!t1.isEmpty())
            q.insert(t1.remove());

        return frequency;
    }

    public static int longestNoPeopleTime(Queue<Person> q) // Ex3
    {
        int max = 0;
        int prev = q.remove().getEnterTime();
        int curr = q.remove().getEnterTime();

        while (!q.isEmpty())
        {
            if (curr - prev > max)
                max = curr - prev;

            prev = curr;
            curr = q.remove().getEnterTime();
        }
        return max;
    }

    public static Queue<Student> whoIsAccepted(Queue<Student> enroleess) // Ex4
    {
        Queue<Student> accepted = new Queue<>();

        while (!enroleess.isEmpty())
        {
            if (enroleess.head().getBagrut() > 85 && enroleess.head().getPsy() > 650)
                accepted.insert(enroleess.remove());

            else
                enroleess.remove();
        }

        return accepted;
    }

    public static String largestQueue(Cinema cinema) // Ex6
    {
        String maxName = "";
        int maxValue = 0;

        for (int i = 0; i < cinema.getMovies().length; i++)
        {
            if (getLen(cinema.getMovies()[i].getMovieQueue()) > maxValue)
            {
                maxName = cinema.getMovies()[i].getMovieName();
                maxValue = getLen(cinema.getMovies()[i].getMovieQueue());
            }
        }
    }

    public static <T> int getLen(Queue<T> q)
    {
        Queue<T> t = new Queue<T>();
        int count = 0;

        while (!q.isEmpty())
        {
            t.insert(q.remove());
            count++;
        }

        while (!t.isEmpty())
            q.insert(t.remove());

        return count;
    }

    public static <T> int countVal(Queue<T> q, T val)
    {
        Queue<T> t = new Queue<>();
        int count = 0;

        while (!q.isEmpty())
        {
            if (q.head().equals(val))
                count++;

            t.insert(q.remove());
        }

        while (!t.isEmpty())
            q.insert(t.remove());

        return count;
    }
}

