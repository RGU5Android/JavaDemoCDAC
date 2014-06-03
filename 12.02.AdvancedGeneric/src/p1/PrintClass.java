package p1;

public class PrintClass<T> {
	T object;

	public PrintClass(T data) {
		this.object = data;
	}

	@Override
	public String toString() {
		return "PrintClass [object=" + object + "]";
	}

}
