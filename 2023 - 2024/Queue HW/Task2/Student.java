public class Student
{
    private int id;
    private int psy;
    private int bagrut;

    public Student(int id, int psy, int bagrut)
    {
        this.id = id;
        this.psy = psy;
        this.bagrut = bagrut;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getPsy()
    {
        return psy;
    }

    public void setPsy(int psy)
    {
        this.psy = psy;
    }

    public int getBagrut()
    {
        return bagrut;
    }

    public void setBagrut(int bagrut)
    {
        this.bagrut = bagrut;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "id=" + id +
                ", psy=" + psy +
                ", bagrut=" + bagrut +
                '}';
    }
}
