public class Main
{
    public static void main(String[] args)
    {
        Node<Integer> n14 = new Node<Integer>(5);
        Node<Integer> n13 = new Node<Integer>(3, n14);
        Node<Integer> n12 = new Node<Integer>(3, n13);
        Node<Integer> n11 = new Node<Integer>(1, n12);
        Node<Integer> n10 = new Node<Integer>(7, n11);
        Node<Integer> n9 = new Node<Integer>(7, n10);
        Node<Integer> n8 = new Node<Integer>(1, n9);
        Node<Integer> n7 = new Node<Integer>(3, n8);
        Node<Integer> n6 = new Node<Integer>(4, n7);
        Node<Integer> n5 = new Node<Integer>(5, n6);
        Node<Integer> n4 = new Node<Integer>(4, n5);
        Node<Integer> n3 = new Node<Integer>(7, n4);
        Node<Integer> n2 = new Node<Integer>(4, n3);
        Node<Integer> n1 = new Node<Integer>(3, n2);

        System.out.println(LinkedListOp.ex7(n1));
    }
}
