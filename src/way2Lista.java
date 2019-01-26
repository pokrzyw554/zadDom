public class way2Lista
{
    public static way2Elem last = null;
    public static way2Elem first = null;

    public way2Lista()
    {
        first = last = null;
    }


   public static void addFirst(int value)
    {       //robi nam nowego firsta a poprzedniego firsta ustawia jako preva aktualnego firsta
       // way2Elem elem = new way2Elem(value);
        //nie potrzebne bo robisz to w swoich klamrach
        if(first==null)
        {
            way2Elem elem = new way2Elem(value);
            first = last = elem;
        }else
        {
            way2Elem elem = new way2Elem(value);
            elem.setPrev(first);
            first.setNext(elem);
            first = elem;                   //check
        }
    }
    public static void addLast(int value)
    {
        // way2Elem elem = new way2Elem(value);
        //nie potrzebne bo robisz to w swoich klamrach

        if(isEmpty())  //is empty zamiennie z first==null
        {
            way2Elem elem = new way2Elem(value);
            first = last = elem;
        }else
        {
            way2Elem elem = new way2Elem(value);
            elem.setNext(last);
            last.setPrev(elem);
            last = elem;                   //check
        }
    }
    public  static int peekFirst(int value)
    {
        return first.getValue();
    }
    public static int peekLast(int value)
    {
        return last.getValue();
    }
    public static int removeLast()
    {
        int value = last.getValue();
        //co jak pusta lista?   check
        if(last.getNext()==null)
        {
            first = last = null;        //poprawnie zwraca ostatnie wartosci
        }
            else
            {
            last = last.getNext();
            last.setPrev(null);
            }
        return value;
    }
    public static int removeFirst()
    {
        int value = first.getValue();
        //co jak pusta lista?
        if(first.getPrev()==null)
        {
            first = last = null;
        }
        else
        {
            first = first.getPrev();
            first.setNext(null);
        }
        return value;
    }
    public static void printAll()
    {
        //jebnij petle ktora zaczyna od firsta
        way2Elem tmp = first;
        while(tmp !=null)
        {
            System.out.println(tmp.getValue()+" ");
            tmp = tmp.getPrev();
        }
        System.out.println();
    }
    public static void printReverse()
    {
        way2Elem tmp = last;
        while(tmp !=null)
        {
            System.out.println(tmp.getValue()+" ");
            tmp = tmp.getNext();        //albo skopiuj se z gita :v
        }
        System.out.println();
    }

    public  static boolean isEmpty()
    {
        return first == null;
    }

    public static boolean czyZnajduje(int value)
    {
        way2Elem tmp = first;
        while(tmp != null)
        {
            if(value == tmp.getValue())
            {
                return true;
            }
            tmp = tmp.getPrev();
        }
        return false;
    }

    public static  void usun(int value)
    {
        way2Elem tmp = first;
        while(tmp != null)
        {
            if(value == first.getValue())
            {
                removeFirst();
            }else if(value == last.getValue())
            {
                removeLast();
            }
            else if(value == tmp.getValue())
            {
                tmp.getPrev().setNext(tmp.getNext());
                tmp.getNext().setPrev(tmp.getPrev());
                //opcjonalnie return, zalezy czy chcesz kasowac wszystkie elementy czy tylko pierwszy napotkany
            }
            tmp = tmp.getPrev();
        }
    }

}
