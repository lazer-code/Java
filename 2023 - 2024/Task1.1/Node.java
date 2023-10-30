public class LinkedListOp
{
    public static int getListLength(Node head)
    {
        Node curr = head;
        int len = 0;

        while (curr != null)
        {
            len++;

            curr = curr.getNext();
        }

        return len;
    }
    
    public static void removeDuplicates(Node head)
    {
        Node curr = head;
        
        while (curr != null)
        {
            Node runner = curr;

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

}
