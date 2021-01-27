package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase {

	@Test
	 void ShorterTable() {
		long millisActualTimeQuick = System.currentTimeMillis(); // pocz¹tkowy czas w milisekundach.
		int []tab1= {4,2,7,2,9,2,17,3,4,25,7543,6,32,7,2,6,7,80,0};
		QuickSort.quick_sort(tab1,0,18);
		long executionTimeQuickSort = System.currentTimeMillis() - millisActualTimeQuick; // czas wykonania programu w milisekundach. 
		System.out.println("Czas w milisekundach w przypadku quick sort 19 elementowej tablicy: "+executionTimeQuickSort);
		long millisActualTimeBubble = System.currentTimeMillis();
		BubbleSort.bubbleSort(tab1);
		long executionTimeBubbleSort=System.currentTimeMillis()- millisActualTimeBubble;
		System.out.println("Czas w milisekundach w przypadku bubble sort 19 elementowej tablicy: "+executionTimeBubbleSort);
		
	}
	@Test
	void LongerTable() {
		long millisActualTime = System.currentTimeMillis(); // pocz¹tkowy czas w milisekundach.
		int []tab2= {4,2,7,2,6,32,7,2,6,7,80,0,4,2,7,2,6,32,7,2,6,7,80,0,4,2,7,2,6,32,7,2,6,7,80,0,4,2,7,2,6,32,7,2,6,7,80,0};
		QuickSort.quick_sort(tab2,0,47);
		long executionTimeQuickSort = System.currentTimeMillis() - millisActualTime; // czas wykonania programu w milisekundach. 
		System.out.println("Czas w milisekundach w przypadku quick sort 48 elementowej tablicy: "+executionTimeQuickSort);
		millisActualTime = System.currentTimeMillis();
		BubbleSort.bubbleSort(tab2);
		long executionTimeBubbleSort=System.currentTimeMillis()- millisActualTime;
		System.out.println("Czas w milisekundach w przypadku bubble sort 48 elementowej tablicy: "+executionTimeBubbleSort);
	}
}


