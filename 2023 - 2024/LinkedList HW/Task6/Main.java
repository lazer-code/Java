import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        TaxiStation[] taxiStations = new TaxiStation[3];

        for (int i = 1; i < 4; i++)
        {
            System.out.printf("\033[36mEnter %d TaxiStation name: \033[0m", i);
            taxiStations[i - 1] = new TaxiStation(sc.next());

            boolean stop = false;
            int taxiCounter = 1;

            while (!stop)
            {
                taxiStations[i - 1].addTaxi(newTaxi());

                taxiCounter++;

                System.out.printf("\033[33mFor stop enter 'stop': \033[0m");

                if (sc.next().equals("stop"))
                    stop = true;
            }
        }

        int s = 0;
        while (true)
        {
            System.out.println("\n\n\033[35m1. Add a taxi to a station\n2. Search taxi\n3. Free drivers\n4. Freest taxistation\nElse to exit\033[0m");
            int opt = sc.nextInt();

            switch(opt)
            {
                default:
                    System.out.printf("\033[31mBye\n");
                    return;

                case 1:
                    System.out.printf("\033[36mChose the number of station (1 - 3): \033[0m");
                    s = sc.nextInt();

                    taxiStations[s - 1].addTaxi(newTaxi());
                    break;

                case 2:
                    System.out.printf("\033[36mChose the number of station (1 - 3): \033[0m");
                    s = sc.nextInt();

                    System.out.printf("\033[36mEnter number of people: \033[0m");
                    int p = sc.nextInt();

                    System.out.println(taxiStations[s - 1].availableTaxi(p));
                    break;

                case 3:
                    System.out.printf("\033[36mChose the number of station (1 - 3): \033[0m");
                    s = sc.nextInt();

                    System.out.println(taxiStations[s - 1].freeDrivers());
                    break;

                case 4:
                    System.out.println(mostFree(taxiStations));
                    break;
            }



        }
    }

    public static String mostFree(TaxiStation[] taxiStations)
    {
        String mostName = "";
        int mostFree = 0;

        for (int i = 0; i < taxiStations.length; i++)
        {
            Node<Taxi> curr = taxiStations[i].getTaxiList();

            int counter = 0;

            while (curr != null)
            {
                if (curr.getValue().isFree())
                    counter++;

                curr = curr.getNext();
            }

            if (counter > mostFree)
            {
                mostName = taxiStations[i].getName();
                mostFree = counter;
            }
        }

        return mostName;
    }

    public static Taxi newTaxi()
    {
        Scanner sc = new Scanner(System.in);

        System.out.printf("\033[36mEnter taxi license: \033[0m");
        String license = sc.next();

        System.out.printf("\033[36mEnter taxi driver name: \033[0m");
        String name = sc.next();

        System.out.printf("\033[36mEnter taxi seats number: \033[0m");
        int seats = sc.nextInt();

        return new Taxi(license, name, seats);
    }
}
