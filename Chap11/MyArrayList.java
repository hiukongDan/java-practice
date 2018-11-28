public class MyArrayList{
	private final int DEFAULT_SIZE = 20;
	private Object[] array = new Object[DEFAULT_SIZE];
	private int arraySize = DEFAULT_SIZE;
	private int count = 0;
	
	public MyArrayList(){}
	
	private void arrayIncrease(){
		Object[] a = new Object[arraySize + DEFAULT_SIZE];
		for (int i = 0; i < arraySize; i++)
			a[i] = this.array[i];
			
		arraySize += DEFAULT_SIZE;
		this.array = a;
	}
	
	public void add(Object o){
		if (count >= arraySize){
			this.arrayIncrease();
		}
		array[count++] = o;
	}
	
	public void add(int index, Object o){
		if (count >= arraySize){
			this.arrayIncrease();
		}
		
		for (int i = this.count; i > index; i--)
			this.array[i] = this.array[i-1];
			
		this.array[index] = o;
		count++;
	}
	
	public void clear(){
		this.array = new Object[DEFAULT_SIZE];
		this.count = 0;
		arraySize = 0;
	}
	
	public boolean contains(Object o){
		for (int i = 0; i < count; i++)
			if (this.array[i] == o)
				return true;
				
		return false;
	}
	
	public Object get(int index){
		if (index >= count)
			return null;
		return this.array[index];
	}
	
	public int indexOf(Object o){
		for (int i = 0; i < count; i++)
			if (this.array[i] == o)
				return i;
		return -1;
	}
	
	public boolean isEmpty(){
		return count == 0;
	}
	
	public int lastIndexOf(Object o){
		for (int i = count - 1; i >=0; i--)
			if (this.array[i] == o)
				return i;
		return -1;
	}
	
	public void remove(Object o){
		for (int i = 0; i < this.count; i++){
			if (this.array[i] == o){
				for (int j = i; j < this.count - 1; j++){
					this.array[j] = this.array[j-1];
				}
				this.count = this.count - 1;
			}
		}
	}
	
	public int size(){
		return count;
	}
	
	public void remove(int index){
		if (index < 0 || index >= count)
			return;
		for (int i = index; i < count - 1; i++)
			this.array[i] = this.array[i+1];
			
		this.count -= 1;
	}
	
	public Object set(int index, Object o){
		this.add(index, o);
		return o;
	}
	
}
