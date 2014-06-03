package p1;

public class Stack<T> {
	Object array[];
	int top;
	final int maxSize;

	public Stack(int size) {
		// TODO Auto-generated constructor stub
		this.maxSize = size;
		this.top = -1;
		array = new Object[size];
	}

	boolean isEmpty() {
		return (this.top == -1);
	}

	boolean isFull() {
		return (this.top == (this.maxSize - 1));
	}

	void pop() {
		try {
			if (isEmpty()) {
				throw new ArrayIndexOutOfBoundsException();
			} else {
				Object ans = this.array[this.top];
				top--;
				System.out.println("Element POPED : " + ans);
			}
		} catch (Exception ex) {
			System.out.println("Stack is Empty" + ex.getMessage());
		}
	}

	void push(Object data) {
		try {
			if (isFull()) {
				throw new ArrayIndexOutOfBoundsException();
			} else {
				this.array[++top] = data;
			}
		} catch (Exception ex) {
			System.out.println("Stack is Full" + ex.getMessage());
		}
	}
}