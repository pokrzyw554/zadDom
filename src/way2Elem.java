public class way2Elem
{
    private int value;
    private way2Elem next;
    private way2Elem prev;

    public int getValue()
    {
        return value;
    }

    public way2Elem(int value)
    {
        this.value = value;
    }


    public way2Elem getNext()
    {
        return next;
    }

    public way2Elem getPrev()
    {
        return prev;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public void setNext(way2Elem next)
    {
        this.next = next;
    }

    public void setPrev(way2Elem prev)
    {
        this.prev = prev;
    }


}

