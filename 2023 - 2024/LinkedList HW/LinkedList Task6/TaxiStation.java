public class TaxiStation
{
    private String name;
    private Node<Taxi> taxiList;

    public TaxiStation(String name)
    {
        this.name = name;
        this.taxiList = null;
    }

    public String getName()
    {
        return name;
    }

    public Node<Taxi> getTaxiList()
    {
        return taxiList;
    }

    public void addTaxi(Taxi taxi)
    {
        if (this.taxiList == null)
            this.taxiList = new Node<Taxi>(taxi);

        else
        {
            Node<Taxi> curr = this.taxiList;

            while (curr.getNext() != null)
                curr = curr.getNext();

            curr.setNext(new Node<Taxi>(taxi));
        }
    }

    public String availableTaxi(int n)
    {
        Node<Taxi> curr = this.taxiList;

        while (curr != null)
        {
            if (curr.getValue().getPlaces() >= n && curr.getValue().isFree())
            {
                curr.getValue().unFree();
                return "We found you an available taxi!\nThe license plate number is: " + curr.getValue().getLicence();
            }

            curr = curr.getNext();
        }

        return "We couldn't find you a taxi!";
    }

    public Node<String> freeDrivers()
    {
        Node<Taxi> curr = this.taxiList;

        Node<String> newFirst = null;
        Node<String> newCurr = null;

        while (curr != null)
        {
            if (curr.getValue().isFree())
            {
                if (newFirst == null)
                {
                    newFirst = new Node<String>(curr.getValue().getDriver());
                    newCurr = newFirst;
                }

                else
                {
                    newCurr.setNext(new Node<String>(curr.getValue().getDriver()));
                    newCurr = newCurr.getNext();
                }
            }
            curr = curr.getNext();
        }

        return newFirst;
    }
}
