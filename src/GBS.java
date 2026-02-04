import java.util.*;
public class GBS {
	static Scanner sc=new Scanner(System.in);
	private static long totalmoney;
	static private String password="786";
	
	
	private static void depositmoney() {
		
			System.out.println("enter the amount you want to deposit");
			long amt=sc.nextInt();
			totalmoney=totalmoney+amt;
			System.out.println("Money Successfully added and the tot is "+totalmoney);
		
	}
	private static void withdrawmoney() {
		
		System.out.println("enter the amount you want to withdraw");
		long amt=sc.nextInt();
		if(amt>totalmoney || amt<=0) {
			System.out.println("Wrong amount entered try again");
		}
		else {
			totalmoney=totalmoney-amt;
			System.out.println("the amount is deducted and total money is "+ totalmoney);
		}
		}

		
	private static void checkmoney() {
		System.out.println("your current amount is "+ totalmoney);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to GBS Guru Banking System");
		
		int n=3;
		while(n!=0){
			n--;
		System.out.println("enter your password");
		String pass=sc.nextLine();
		if(pass.equals(password)) {
			boolean a=true;
		while(a==true){
		System.out.println("Press 1 to DepositMoney\n"+
							"Press 2 to WithdrawMoney\n"+
							"Press 3 to CheckMoney\n"+
							"Press 4 to exit\n");
		
		int input=sc.nextInt();
		
		
			
			switch(input) {
		case 1:
			depositmoney();
			break;
		case 2:
			withdrawmoney();
			break;
		case 3:
			checkmoney();
			break;
			
		case 4:
			System.exit(1);
				break;
				}
			System.out.println("Do u want to continue Y/N");
			sc.nextLine();
			String cont =sc.nextLine();
			if(cont.equalsIgnoreCase("Y")) {
				a=true;
			}
			else {
				System.exit(1);
			}
		
		}

	}


else {
	System.out.println("u have got "+n+" tries");
	if(n==0) {
		System.out.println("hahahaha system locked try after 24 hours");
		System.exit(1);
	}
	
}
}
	}
}