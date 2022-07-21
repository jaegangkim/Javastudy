package kr.myutil;

public class IntArray {

	private int[] arr;
	private int count; // 0
	public IntArray() {
		this(10);     // IntArray(10);
	}
	public IntArray(int capacity) {
		arr=new int[capacity];
	}
	
	public void add(int data) {
		arr[count++] = data;
	}
	public int get(int index) {
		return arr[index];
	}
	public int size() {
		return count;
	}
	
}
