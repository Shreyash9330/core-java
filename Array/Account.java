package basic;

public class Account {

		int accno;
		String name;
		double balance;
		
		// default constructor
		Account()
		{
			accno= 6545855;
			name="Shreyash";
			balance = 5000.0;
		}
		
		// parametrized constructor 
		
		Account (int ano,string nm ,double bal)
		{
			accno= ano;
			name= nm;
			balance = bal;

		}
		
		
	@Override
		public String toString() {
			return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account();
		System.out.println(acc.toString());
	
	}

}
