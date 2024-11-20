package pack;
import java.util.*;

public class AtmOperation implements Atminterface{
	
	AtmLayout atm=new AtmLayout();
	List<List<Object>> ministmt = new ArrayList<>();

	public void viewBalance(){
		System.out.println("Available Balance is: " +atm.getBalance() );
	}

	public void withdrawAmount(double withdrawAmount){
		if(withdrawAmount%500==0){
			if(withdrawAmount<=atm.getBalance()){
				System.out.println("Collect your cash!! " + withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				ministmt.add(Arrays.asList(withdrawAmount, "Amount withdrawn"));
				//ministmt.put(withdrawAmount, "Amount withdrawn");
				viewBalance();

			}
			else{
				System.out.println("Insufficient Balance");
			}
		}
		else{
			System.out.println("Please enter amount in terms of 500.");
			System.out.println("Please select your choise:");
		}

	}

	public void depositeAmount(double depositeAmount){
		System.out.println("Deposited Amount is: " +depositeAmount);
		atm.setBalance(atm.getBalance()+depositeAmount);
		ministmt.add(Arrays.asList(depositeAmount, "Deposited Successfully"));
		//ministmt.put(depositeAmount,"Deposited Successfully");
		viewBalance();

	}

	public void viewMiniStatment(){
		for (List<Object> pair : ministmt) {
            System.out.println( pair.get(0) + " = " + pair.get(1));
        }
		// for (Map.Entry<Double, String> entry : ministmt.entrySet()) {
    	// 	System.out.println(entry.getKey() + " = " + entry.getValue());
		// }
	}
}