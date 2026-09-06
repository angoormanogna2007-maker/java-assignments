package Interface;

interface Fan{
    void revolve();
}
class KhaitanFan implements Fan
{
    public void revolve()
    {
        System.out.println("KhaitanFan provides good revolving service");
    }
}


