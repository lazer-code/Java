public class Stack<T> {
	private Node<T> head;
    /* הפעולה בונה ומחזירה מחסנית ריקה **/
    public Stack()
    {
        this.head = null;
    }
    public void push(T x)
    {
        Node<T> temp = new Node<T>(x);
        temp.setNext(head);
        head = temp;
    }
    /* הפעולה מכניסה את הערך x לראש המחסנית הנוכחית **/
    /* הפעולה מוציאה ומחזירה את הערך הנמצא  בראש המחסנית הנוכחית **/
    public T pop()
    {
        T x = head.getValue();
        head = head.getNext();
        return x;
    }
    /* הפעולה מחזירה את הערך הנמצא  בראש המחסנית הנוכחית **/
    public T top()
    {
        return head.getValue();
    }
    /* הפעולה מחזירה 'אמת' אם המחסנית הנוכחית ריקה, ומחזירה 'שקר' אחרת **/
    public boolean isEmpty()
    {
        return head == null;
    }
    /* הפעולה מחזירה מחרוזת המתארת את המחסנית הנוכחית */
    @Override
    public String toString()
    {
        String s = "[";
        Node<T> p = this.head;
        while (p != null)
        {
            s = s + p.getValue().toString();
            if (p.getNext() != null)
                s = s + ",";
            p = p.getNext();
        }
        s = s + "]";
        return s;
    }
}

