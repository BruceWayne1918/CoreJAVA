import java.util.Arrays;
import java.util.Comparator;

public class SortTester {
	
	public static void main (String []args) {
		
		Double unsortedArr[] = {1.23,2.35,4.456,3.25,5.75};
		
		Comparator <Double>ref= new SelectionSort();
		
		selectionSort(unsortedArr, ref);
		
		System.out.println(Arrays.toString(unsortedArr));
		
		
	}
	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	
}}}}}
