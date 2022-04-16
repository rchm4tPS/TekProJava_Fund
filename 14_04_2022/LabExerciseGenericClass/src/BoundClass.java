
public class BoundClass
{
	public static void main(String[] args) {
		// Creating object of sub class C and then
		// passing it to Bound as a type parameter.
		Bound<C> bec = new Bound<C>(new C());
		bec.doRunTest();
		
		// Creating object of sub class B and then
		// passing it to Bound as a type parameter.
		Bound<B> beb = new Bound<B>(new B());
		beb.doRunTest();
		
		// Similarly passing super class A
		Bound<A> bea = new Bound<A>(new A());
		bea.doRunTest();
	}
}
