class Bank
{
        int currentbalance=1000;
	public static void greetcustomer()
	{
		System.out.println("welcome to the banking sector");
	}
	public  void deposit(int amount)
	{
		currentbalance=currentbalance+amount;
		System.out.println("amount deoposit sucessfully ");
	}
	public void withdrawl(int amount)
	{
		currentbalance=currentbalance-amount;
		System.out.println("amount withdrawl sucessfully");
	}
	public int getcurrentbalance()
	{
		return currentbalance;
	}
	public static void main(String args[])
	{
		Bank op=new Bank();
		greetcustomer();
		System.out.println("current bank balance"+op.getcurrentbalance());
		op.deposit(500);
		System.out.println("deposit amount"+op.getcurrentbalance());
		op.withdrawl(500);
		System.out.println("withdrawl amount"+op.getcurrentbalance());
	
		
	}
}

	