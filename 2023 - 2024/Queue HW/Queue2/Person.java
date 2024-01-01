public class Person
{
    private String name;
    private int enterTime;

    public Person(String name, int enterTime)
    {
        this.name = name;
        this.enterTime = enterTime;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getEnterTime()
    {
        return enterTime;
    }

    public void setEnterTime(int enterTime)
    {
        this.enterTime = enterTime;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", enterTime=" + enterTime +
                '}';
    }
}
