package pack;
import java.util.*;
public class ATM{
	private static int status;
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		AtmOperation imp=new AtmOperation();
		int atmnum=12345;
		int atmpin=123;
		System.out.println("WELCOME TO ATM MACHINE");
		System.out.println("ENTER THE ATM NUMBER:");
		int atmnum2=sc.nextInt();
		System.out.println("ENTER THE ATM PIN:");
		int atmpin2=sc.nextInt();
		if(atmnum==atmnum2 && atmpin==atmpin2){
			while(true){
				System.out.println(" 1. View Available Balance \n 2. Withdraw Amount \n 3. Deposite Amount \n 4. View ministatement \n 5. Exit");
				System.out.println("Enter the choice:");
				int c=sc.nextInt();
				if(c==1){
					imp.viewBalance();
				}
				else if(c==2){
					System.out.println("Enter the amount to withdraw:");
					double withdrawamount=sc.nextDouble();
					imp.withdrawAmount(withdrawamount);
				}
				else if(c==3){
					System.out.println("Enter the amount to deposite");
					double depositeamount=sc.nextDouble();
					imp.depositeAmount(depositeamount);
				}
				else if(c==4){
					imp.viewMiniStatment();
				}
				else if(c==5){
					System.out.println("Collect your card\n THANK YOU!!!");
					System.exit(status);
				}
				
			}
		}
		else {
			System.out.println("INCORRECT ATM NUMBER OR PIN!");
		}
	}
}