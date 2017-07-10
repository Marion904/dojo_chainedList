package chained_list2;

import java.util.Iterator;

public class ChainedItem<T> implements Iterator<T>{
	
	private T data;
	private ChainedItem<T> next = null;
	
	public ChainedItem(T data){
		this.data = data;
	}
	
	public T getData(){
		return this.data;
	}
	
	public ChainedItem<T> getNext(){
		return this.next;
	}
	
	public void setNext(ChainedItem<T> next){
		this.next=next;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return this.getNext()!=null;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		return this.getNext().getData();
	}
	


}
