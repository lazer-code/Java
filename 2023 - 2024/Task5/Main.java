public class Main
{
    public static void main(String[] args)
    {
        Node<Integer> n7 = new Node<Integer>(8);
        Node<Integer> n6 = new Node<Integer>(4, n7);
        Node<Integer> n5 = new Node<Integer>(11, n6);
        Node<Integer> n4 = new Node<Integer>(7, n5);
        Node<Integer> n3 = new Node<Integer>(5, n4);
        Node<Integer> n2 = new Node<Integer>(5, n3);
        Node<Integer> n1 = new Node<Integer>(1, n2);

        System.out.println(LinkedListOp.upperSum(n1));
    }
}
