
public class TestAccount{

	public static void main(String[] args) {
		Account f = new Account("1096","Peter","123456",10000);
		f.draw(100);
		f.deposit(1000000.2414);
		System.out.println(f.check());
		
	}
}
