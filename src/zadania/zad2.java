package zadania;

import java.util.Scanner;

//2. Stwórz tablicę intów o wielkości podanej przez użytkownika.
// Wypełnij ją wartościami losowymi, a następnie wypisz wszystkie elementy.
public class zad2
{
    public static void main(String[] args)
    {
        Scanner wejscie = new Scanner(System.in);
        System.out.println("UŻYTKOWNIKU. podaj mi długość swojej talbicy  ( ͡° ͜ʖ ͡° ) ");
        int podana = wejscie.nextInt();
        int tablica[] = new int[podana];
        for(int i = 0; i < tablica.length; i++)
        {
            tablica[i] = (int) (Math.random()*100);
        }
        for(int b :
                tablica)
        {
            System.out.println(b);
        }
    }
}
