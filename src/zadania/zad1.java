package zadania;
//1. Stwórz tablicę intów i wypełnij ją wartościami. Sprawdź czy elementy
// w tablicy są posortowane niemalejąco. ROSNOCO KURWA Zwróć true, jeżeli prawda, wpp. false.
public class zad1
{
    public static void main(String[] args)
    {
        int[] tablica = new int[5];
        tablica[0] = 5;
        tablica[1] = 4;
        tablica[2] = 5;
        tablica[3] = 5;
        tablica[4] = 5;
        for(int i = 0; i < 5; i++)
        {
            System.out.println(tablica[i]);     //dziala
        }

        System.out.println(czyMalejaca(tablica));
    }

    private static boolean czyMalejaca(int tab[])
    {
        int tmp = tab[0];   //jakas w chuj mala wartosc
        for(int i = 0; i < tab.length; i++)
        {
            if(tmp>tab[i])
            {
                return false;
            }
        }
        return true;
    }
}
