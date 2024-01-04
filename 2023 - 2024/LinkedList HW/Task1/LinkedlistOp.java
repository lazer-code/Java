public class LinkedListOp
{
    public static int getLargest(Node head)
    {
        Node curr = head;

        int maxVal = curr.getValue();

        while (curr != null)
        {
            if (curr.getValue() > maxVal)
                maxVal = curr.getValue();

            curr = curr.getNext();
        }

        return maxVal;
    }

    public static int getSum(Node head)
    {
        Node curr = head;

        int sumVal = 0;

        while (curr != null)
        {
            sumVal += curr.getValue();

            curr = curr.getNext();
        }

        return sumVal;
    }

    public static int getTotalNodes(Node head)
    {
        Node curr = head;

        int totalVal = 0;

        while (curr != null)
        {
            totalVal++;

            curr = curr.getNext();
        }

        return totalVal;
    }

    public static int getTotalEven(Node head)
    {
        Node curr = head;

        int i = 0, totalEvenVal = 0;

        while (curr != null)
        {
            if (i % 2 == 0)
                totalEvenVal++;

            i++;
            curr = curr.getNext();
        }

        return totalEvenVal;
    }

    public static Node reverse(Node head)
    {
        Node curr = head, prev = null, next = null;

        while (curr != null)
        {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
