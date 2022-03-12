
public class Sasuke extends Itachi {
	String Dojutsu = "Sharingan";
	
	void printDojutsu() {
		super.printDojutsu();	// bagian yang ditambahkan ke class Sasuke
		System.out.println(this.Dojutsu);
	}
}
