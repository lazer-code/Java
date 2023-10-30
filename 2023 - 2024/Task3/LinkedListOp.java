public class LinkedListOp
{
    
    public static Node<String> reverse(Node<String> head) {
        Node<String> curr = head, prev = null, next = null;

        while (curr != null)
        {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static boolean followingNumbers(Node<Integer> head, int num)
    {
        Node<Integer> curr = head;
        int counter = 0;

        while (curr != null)
        {
            if (curr.getNext().getValue() == curr.getValue() + 1)
                counter++;

            else
                counter = 0;
        }

        return counter >= num;
    }

    public static int infinityListCounter(Node<String> head)
    {
        Node<String> curr = head;
        int counter = 1;

        curr = curr.getNext();

        while (curr != head)
        {
            curr = curr.getNext();
            counter++;
        }

        return counter;
    }

    public static boolean numInList(Node<Integer> head, int num)
    {
        Node<Integer> curr = head;
        int counter = 0;

        while (curr != null)
        {
            if (curr.getValue() == num)
                return true;

            curr = curr.getNext();
        }
        return false;
    }

    public static void removeDuplicates(Node<Integer> head)
    {
        Node<Integer> curr = head;

        while (curr != null)
        {
            Node<Integer> runner = curr;

            while (runner.getNext() != null)
            {
                if (runner.getNext().getValue() == curr.getValue())
                    runner.setNext(runner.getNext().getNext());

                else
                    runner = runner.getNext();
            }
            curr = curr.getNext();
        }
    }

    public static Node<Integer> twoListsMerging(Node<Integer> head1, Node<Integer>head2)
    {
        Node<Integer> newHead = null, newCurr = null, curr = head1;

        while (curr != null)
        {
            if (numInList(head2, curr.getValue()))
            {
                if (newHead == null)
                {
                    newHead = new Node<Integer>(curr.getValue());
                    newCurr = newHead;
                }

                else
                {
                    newCurr.setNext(new Node<Integer>(curr.getValue()));
                    newCurr = newCurr.getNext();
                }
            }
            curr = curr.getNext();
        }

        removeDuplicates(newHead);
        return newHead;
    }
}
