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

    public static void setMaxAfterNumber (Node<Integer> first) // 1
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

    public static void setListToMax (Node<Integer> first) // 2
    {
        int max = getMax(first);

        Node<Integer> curr = first;

        while (curr != null)
        {
            curr.setValue(max);
            curr = curr.getNext();
        }
    }

    public static Node<Integer> returnMaxedList (Node<Integer> first) // 3
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

    public static boolean samePointSum (Node<Point> first) // 4
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

    public static Node<Integer> upperSum (Node<Integer> first)
    {
        Node<Integer> curr = first;

        Node<Integer> newFirst = null;
        Node<Integer> newCurr = null;

        int currSum = 0;

        while (curr != null && curr.getNext())
        {
            if (curr.getNext().getValue() > curr.getValue())
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
}