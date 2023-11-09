public class LinkedListOp
{
    public static int getMax(Node<Integer> head)
    {
        Node<Integer> curr = head;

        int max = head.getValue();


        while (curr != null)
        {
            if (curr.getValue() > max)
                max = curr.getValue();

            curr = curr.getNext();
        }

        return max;
    }

    public static int getMin(Node<Integer> head)
    {
        Node<Integer> curr = head;

        int min = getMax(head);

        while (curr != null)
        {
            int currMax = getMax(curr);

            if (currMax < min)
                min = currMax;

            curr = curr.getNext();
        }

        return min;
    }
}
