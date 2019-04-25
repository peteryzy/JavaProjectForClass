
public class Account {
	String AccountNum;
	public String name;
	String password;
	double balance;
	
	
	public Account(){
		
	}
	
	public Account(String AccountNum,String name,String password,double balance){
		this.AccountNum = AccountNum;
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	
	public void deposit(double money){
		this.balance += money;
	}
	
	public void draw(double money){
		this.balance -= money; 
	}
	
	public double check(){
		return this.balance;
	}
}
