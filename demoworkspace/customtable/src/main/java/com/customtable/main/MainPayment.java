package com.customtable.main;

import com.customtable.dao.PaymentDAO;
import com.customtable.model.CardPayment;
import com.customtable.model.Payment;
import com.customtable.model.UPIPayment;



public class MainPayment {

	public static void main(String[] args) {
		
		
		runSave();
		

	}

	private static void runSave() {
		
		PaymentDAO pd = new PaymentDAO();
		
		Payment p1 = new Payment();
		p1.setId("P1");
		p1.setAmount(1000);
		
		UPIPayment p2 = new UPIPayment();
		p2.setId("P2");
		p2.setAmount(500);
		
		CardPayment p3 = new CardPayment();
		p3.setId("p3");
		p3.setAmount(50000);
		
		pd.save(p3);
		pd.save(p2);
		pd.save(p1);
		
			
		
		
		
	}

}
