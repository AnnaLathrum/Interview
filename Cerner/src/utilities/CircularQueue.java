package utilities;

import java.util.LinkedList;


public class CircularQueue<T> extends LinkedList<T>{

	private static final long serialVersionUID = 1L;
	
	public CircularQueue() {
		super();
	}
	
	@Override
	public boolean add(T object) {
		if(super.size() != 24) {
			return super.add(object);
		}else {
			super.pollFirst();
			return super.add(object);
		}
	}
	
	
//	public void printQueue() {
//		for(int i = this.size() - 1; i >= 0; i--) {
//			System.out.printf("[%2d]  %s\n", i, this.get(i));
//		}
//	}
	
	public void printQueue() {
		for(int i = 0; i <= this.size() - 1; i++) {
			System.out.printf("[%2d]  %s\n", i, this.get(i));
		}
	}
}
