class Main {
	public static void main(String[] args) {
		Enum e1 = Enum.RED;
		Enum.myStaticFun();
		e1.myFunction();

		// Enum.myFunction() ;
		Enum.myStaticFun();
		Enum.RED.myFunction();

	}

}
