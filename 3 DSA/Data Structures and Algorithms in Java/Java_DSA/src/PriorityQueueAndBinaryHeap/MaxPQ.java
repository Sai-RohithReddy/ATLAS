package PriorityQueueAndBinaryHeap;

import java.util.Arrays;

public class MaxPQ {
	
	private Integer[] heap;
	private int size;
	
	public MaxPQ(int capacity) {
		heap = new Integer[capacity + 1];
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	public void insert(int val) {
		if (size == heap.length - 1) {
			resize(2 * heap.length);
		}
		
		size++;
		heap[size] = val;
		swim(size);
	}
	
	private void resize(int capacity) {
		Integer[] temp = new Integer[capacity];
		
		for (int i = 0; i < heap.length; i++) {
			temp[i] = heap[i];
		}
		heap = temp;
	}
	
	private void swim(int k) {
		while(k > 1 && heap[k/2] < heap[k]) {
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			
			k = k/2;
		}
	}
	
	public void printMaxHeap() {
//		for (int val : heap) { // will get null pointer exception, because of presence of null val in arr
//			System.out.print(val + " ");
//		}
		
		for (int i = 1; i <= size; i++) {
			System.out.print(heap[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		MaxPQ pq = new MaxPQ(3);
		
		System.out.println(pq.size());
		System.out.println(pq.isEmpty());
		
		pq.insert(4);
		pq.insert(5);
		pq.insert(2);
		pq.insert(6);
		pq.insert(1);
		pq.insert(3);
		
		System.out.println(Arrays.toString(pq.heap));
		
		System.out.print("Elements in heap are: ");
		pq.printMaxHeap();
		
		System.out.println(pq.size());
		System.out.println(pq.isEmpty());
		
	}

}
