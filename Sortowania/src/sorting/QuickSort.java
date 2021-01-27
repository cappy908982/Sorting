
package sorting;
 
import java.util.Scanner;
 
public class QuickSort {
	
	
	private static void printArray(int[] tab, int low, int high) {
		System.out.print("| ");
		for(int i = low; i <= high; i++)
		{
			System.out.print(tab[i] + " | ");
		}
		System.out.println();
		System.out.println();
	}
	public static void quick_sort(int[] tab, int indexLow, int indexHigh) {
		 
		//Jeœli tablica ma tylko jeden element koñczymy algorytm
		if (indexLow >= indexHigh || indexLow < 0 || indexHigh < 0)
		{
			return;
		}
	 
		//Tworzymy zmienn¹ piwot by przechowywaæ wartoœæ punktu osiowego
		int pivot = tab[indexLow];
		//lowerNumbersEndIndex wskazuje pozycjê na któr¹ wstawiamy elementy mniejsze od punktu osiowego
		int lowerNumbersEndIndex = indexLow + 1;
	 
	 
		for (int iterator = indexLow+1; iterator <= indexHigh; iterator++)
		{
			//Po napotkaniu mniejszego b¹dŸ równego elementu, zamieniamy go miejscami
			//z pierwszym wiêkszym elementem
			if (tab[iterator] <= pivot)
			{
				int pom = tab[lowerNumbersEndIndex];
				tab[lowerNumbersEndIndex] = tab[iterator];
				tab[iterator] = pom;
				lowerNumbersEndIndex++;
			}
		}
	 
		//Wstawiamy punkt osiowy we w³aœciwe miejsce w tablicy
		int pom = tab[lowerNumbersEndIndex - 1];
		tab[lowerNumbersEndIndex - 1] = tab[indexLow];
		tab[indexLow] = pom;
	 
		System.out.println("Podtablica " +indexLow + ":" + indexHigh);
		printArray(tab, indexLow, indexHigh);
	 
		//Wywo³ujemy algorytm rekurencyjnie, dla lewej i prawej podtablicy
		quick_sort(tab, indexLow, lowerNumbersEndIndex-2);
		quick_sort(tab, lowerNumbersEndIndex, indexHigh);
	}
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in); //inicjalizujemy Scanner - obiekt pozwalajacy na wczytywanie zmiennych od uzytkownika
		System.out.println("Wprowadz liczbe elementow tablicy: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Podaj element nr." + i + ": ");
			arr[i]= sc.nextInt(); //wczytujemy kolejne elementy tablicy
		}
		System.out.println("Oto wprowadzona tablica:");
		printArray(arr, 0, n-1);
		System.out.println();
		quick_sort(arr, 0, n-1);
		System.out.println();
		System.out.println("Oto wprowadzona tablica po przesortowaniu:");
		printArray(arr, 0, n-1);
		sc.close(); //zwalniamy zasoby
	}
	
}
