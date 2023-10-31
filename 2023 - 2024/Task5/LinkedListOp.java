public class LinkedListOp
{
    public static int getMax (Node<Integer> first)
    {
        Node<Integer> curr = first;
        int max = curr.getValue();

        while (curr != null)
        {
            if (curr.getValue() > max)
                max = curr.getValue();

            curr = curr.getNext();
        }

        return max;
    }

    public static int valueCounter(Node<Integer> first, int n)
    {
        Node<Integer> curr = first;

        int counter = 0;

        while (curr != null)
        {
            if (curr.getValue() == n)
                counter++;

            curr = curr.getNext();
        }

        return counter;
    }

    public static void ex1(Node<Integer> first)
    {
        int max = getMax(first);

        Node<Integer> curr = first;

        while (curr != null)
        {
            Node<Integer> temp = curr.getNext();
            curr.setNext(new Node<Integer>(max));
            curr.getNext().setNext(temp);
            curr = curr.getNext().getNext();
        }
    }

    public static void ex2(Node<Integer> first)
    {
        int max = getMax(first);

        Node<Integer> curr = first;

        while (curr != null)
        {
            curr.setValue(max);
            curr = curr.getNext();
        }
    }

    public static Node<Integer> ex3(Node<Integer> first)
    {
        int max = getMax(first);

        Node<Integer> newFirst = new Node<Integer>(max);
        Node<Integer> curr = first;
        Node<Integer> newCurr = newFirst;

        while (curr != null)
        {
            newCurr.setValue(max);
            newCurr = newCurr.getNext();
            curr = curr.getNext();
        }

        return newFirst;
    }

    public static boolean ex4(Node<Point> first)
    {
        Node<Point> curr = first;

        int sum = first.getValue().getX() + first.getValue().getY();

        while (curr != null)
        {
            if (sum != curr.getValue().getX() + first.getValue().getY())
                return false;

            curr = curr.getNext();
        }

        return true;
    }

    public static Node<Integer> ex5 (Node<Integer> first)
    {
        Node<Integer> curr = first;

        Node<Integer> newFirst = null;
        Node<Integer> newCurr = null;

        int currSum = 0;

        while (curr != null)
        {
            if (curr.getNext() == null)
            {
                currSum += curr.getValue();
                newCurr.setNext(new Node<Integer>(currSum));
            }

            else if (curr.getNext().getValue() > curr.getValue())
                currSum += curr.getValue();

            else
            {
                currSum += curr.getValue();
                if (newFirst == null)
                {
                    newFirst = new Node<Integer>(currSum);
                    newCurr = newFirst;
                }

                else
                {
                    newCurr.setNext(new Node<Integer>(currSum));
                    newCurr = newCurr.getNext();
                }

                currSum = 0;
            }

            curr = curr.getNext();
        }

        return newFirst;
    }

    public static boolean ex6(Node<Integer> first)
    {
        Node<Integer> curr = first;

        int count = 0;

        for (int i = 1; curr != null; i++)
        {
            while (curr.getValue() == i)
            {
                curr = curr.getNext();
                count++;
            }

            if (count != i)
                return false;
        }

        return true;
    }

    public static Node<Integer> ex7(Node<Integer> first)
    {
        Node<Integer> curr = first;

        Node<Integer> newFirst = null;
        Node<Integer> newCurr = null;

        while (curr != null)
        {
            int n = valueCounter(first, curr.getValue());

            if (valueCounter(newFirst, curr.getValue()) == 0)
            {
                for (int i = 1; i <= n; i++)
                {
                    if (newFirst == null)
                    {
                        newFirst = new Node<Integer>(curr.getValue());
                        newCurr = newFirst;
                    }

                    else
                    {
                        newCurr.setNext(new Node<Integer>(curr.getValue()));
                        newCurr = newCurr.getNext();
                    }
                }
            }

            curr = curr.getNext();
        }

        return newFirst;
    }
}