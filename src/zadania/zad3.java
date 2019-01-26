package zadania;
//3. Podaj dwie tablice intów o takim samym rozmiarze,
// zsumuj wartości na tych samych indeksach i wynik zwróć w nowej tablicy.
public class zad3
{
    public static void main(String[] args)
    {
        int[] tablica0 = new int[5];
        tablica0[0] = 5;
        tablica0[1] = 7;
        tablica0[2] = 4;
        tablica0[3] = 0;
        tablica0[4] = 1;
        int[] tablica1 = new int[5];
        tablica1[0] = 5;
        tablica1[1] = 5;
        tablica1[2] = 5;
        tablica1[3] = 5;
        tablica1[4] = 5;
        int[] tablica2 = new int[5];
        for(int i = 0; i < tablica2.length; i++)
        {
            tablica2[i] = tablica0[i] + tablica1[i];
        }
        for(int i = 0; i < tablica2.length; i++)
        {
            System.out.println(tablica2[i]);
        }       //w sumie działą
    }

  /*   int[] dodajTaby(int[] tab0, int[] tab1)
    {

    }
*/
}
