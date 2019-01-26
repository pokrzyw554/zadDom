package zadania;
//4(*)Podaj dwie tablice intów o różnym rozmiarze,
// zsumuj wartości na tych samych indeksach i wynik zwróć w nowej tablicy.
public class zad4
{
    public static void main(String[] args)
    {
        int[] tablica0 = new int[5];
        tablica0[0] = 5;
        tablica0[1] = 7;
        tablica0[2] = 4;
        tablica0[3] = 0;
        tablica0[4] = 1;
        int[] tablica1 = new int[6];
        tablica1[0] = 5;
        tablica1[1] = 5;
        tablica1[2] = 5;
        tablica1[3] = 5;
        tablica1[4] = 5;
        tablica1[5] = 11;
        int wieksza = (tablica0.length>tablica1.length ? tablica0.length : tablica1.length);
                            //do zmiennej wieksza przypisuje nam liczbe wiekszej tablicy
        int mniejsza = (tablica0.length<tablica1.length ? tablica0.length : tablica1.length);
        int[] tablica2 = new int[wieksza];
        for(int i = 0; i < mniejsza; i++)
        {
            tablica2[i] = tablica0[i] + tablica1[i];
        }
        for(int z = mniejsza; z<wieksza; z++)
        {
            tablica2[z] = tablica1[z];
        }
        for(int i = 0; i < tablica2.length; i++)
        {
            System.out.println(tablica2[i]);
        }       //w sumie działą
    }
}
