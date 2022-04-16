
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer inums[] = { 3, 6, 2, 8, 6 };
		Character chs[] = { 'b', 'r', 'p', 'w' };
		
		MyClass<Integer> a = new MyClass<Integer>(inums);
		MyClass<Character> b = new MyClass<Character>(chs);
		
		System.out.println(a.max());
		System.out.println(b.max());

	}

}
