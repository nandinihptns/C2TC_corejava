package testpk;

class withdraw
{
	int amt_withdraw=2000;
}

public class inh extends withdraw
{
	int amt_left=5000;

	public static void main(String[] args) {
		inh a1=new inh();
		System.out.println("amount left"+a1.amt_withdraw);
		System.out.println("amount left"+a1.amt_left);
		// TODO Auto-generated method stub

	}

}
