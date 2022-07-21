package kr.myutil;

public class ObjectArray {

	private Object[] arr;
	private int count; // 0
	public ObjectArray() {
		this(10);     // IntArray(10);
	}
	public ObjectArray(int capacity) {
		arr=new Object[capacity];
	}
	
	public void add(Object data) {
		arr[count++] = data;
	}
	public Object get(int index) {
		return arr[index];
	}
	public int size() {
		return count;
	}
	
}
