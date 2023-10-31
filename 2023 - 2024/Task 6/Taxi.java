public class Taxi
{
    private String licence;
    private String driver;
    private int places;
    private boolean isFree;

    public Taxi(String licence, String driver, int places)
    {
        this.licence = licence;
        this.driver = driver;
        this.places = places;
        this.isFree = true;
    }

    public String getLicence()
    {
        return licence;
    }

    public String getDriver()
    {
        return driver;
    }

    public int getPlaces()
    {
        return places;
    }

    public boolean isFree()
    {
        return isFree;
    }

    public void free()
    {
        this.isFree = true;
    }

    public void unFree()
    {
        this.isFree = false;
    }

    @Override
    public String toString()
    {
        return "Taxi{" +
                "licence='" + licence + '\'' +
                ", driver='" + driver + '\'' +
                ", places=" + places +
                ", isFree=" + isFree +
                '}';
    }
}
