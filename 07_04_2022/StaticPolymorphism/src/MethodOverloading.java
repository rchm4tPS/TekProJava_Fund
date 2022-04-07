
class MethodOverloading {
	public static void main(String[] args) {
		// membuat satu Object bernama Obj
		// yang merupakan instansiasi class Overload
		Overload Obj = new Overload();
		
		// satu variabel result bertipe double
		double result;
		
		// Pemanggilan method demo
		Obj.demo(10);
		Obj.demo(10, 20);
		result = Obj.demo(5.5);
		System.out.println("O/P : " + result);
	}
}
