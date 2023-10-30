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

    public static void setMaxNumber (Node<Integer> first)
    {
        int max = getMax(first);

        Node<Integer> curr =
    }
}
