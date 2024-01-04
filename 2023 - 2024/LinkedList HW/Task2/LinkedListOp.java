public class LinkedListOp
{
    public static int namesWithA(Node<String> head)
    {
        Node<String> curr = head;
        int counter = 0;

        while (curr != null)
        {
            if (curr.getValue().charAt(0) == 'A')
                counter++;

            curr = curr.getNext();
        }
        return counter;
    }

    public static int charsWithChar(Node<Character> head, char ch)
    {
        Node<Character> curr = head;
        int counter = 0;

        while (curr != null)
        {
            if (curr.getValue() == ch)
                counter++;

            curr = curr.getNext();
        }
        return counter;
    }

    public static void numberOfCharInList(Node<Character> head)
    {
        Node<Character> curr = head;

        while (curr != null)
        {
            char ch = curr.getValue();
            int counter = charsWithChar(head, ch);

            System.out.println(ch + " : " + counter);
            curr = curr.getNext();
        }
    }

    public static Node<Integer> charsMath(Node<Character> curr)
    {
        //Node<Character> curr = head;
        Node<Integer> newHead = null;
        Node<Integer> newCurr = null;

        while (curr != null)
        {
            int val1 = (int)curr.getValue() - 48;
            int val2 = (int)curr.getNext().getNext().getValue() - 48;
            char op = curr.getNext().getValue();

            int res = switch (op)
            {
                case '/' -> val1 / val2;
                case '*' -> val1 * val2;
                case '-' -> val1 - val2;
                case '+' -> val1 + val2;
                default -> 0;
            };

            if (newHead == null)
            {
                newHead = new Node<Integer>(res);
                newCurr = newHead;
            }

            else
            {
                newCurr.setNext(new Node<Integer>(res));
                newCurr = newCurr.getNext();
            }

            if (curr.getNext().getNext().getNext() == null)
                return newHead;

            curr = curr.getNext().getNext().getNext();
        }
        return newHead;
    }
}
