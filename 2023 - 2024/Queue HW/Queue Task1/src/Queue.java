public class Queue<T>
{
    private Node<T> first;
    private Node<T> last;
    /* הפעולה בונה ומחזירה תור ריק **/
    public Queue()
    {
        this.first = null;
        this.last = null;
    }
    /* הפעולה מכניסה את הערך X  לראש התור הנוכחי **/
    public void insert(T x)
    {
        Node<T> temp = new Node<T>(x);
        if (this.first == null)
            this.first = temp;
        else
            this.last.setNext(temp);
        this.last = temp;
    }
    /* הפעולה מוציאה ומחזירה את הערך הנמצא  בראש התור הנוכחי **/
    public T remove()
    {
        T x = this.first.getValue();
        this.first = this.first.getNext();
        if (this.first == null)
            this.last = null;
        return x;
    }
    /* הפעולה מחזירה את הערך הנמצא  בראש התור הנוכחי **/
    public T head()
    {
        return this.first.getValue();
    }
    /* הפעולה מחזירה 'אמת' אם התור הנוכחי ריק, ומחזירה 'שקר' אחרת **/
    public boolean isEmpty()
    {
        return this.first == null;
    }
    @Override
    public String toString()
    {
        if (this.isEmpty())
            return "[]";
        String str = "";
        Queue<T> temp = new Queue<T>();
        while (!this.isEmpty())
        {
            str += "[" + this.first.getValue() + "]\r\n";
            temp.insert(this.remove());
        }
        while (!temp.isEmpty())
            this.insert(temp.remove());
        return str;
    }
}
