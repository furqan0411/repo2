/**
 * 
 */
package bankProjectmain;

import java.sql.Date;

import bankProjectmodel.AccountHolderDetails;
import bankProjectmodel.AddressDetails;
import bankProjectmodel.BankDetails;
import bankProjectmodel.LoanDetails;

/**
 * @author Dell
 *
 */
public class Expenditure {

	
	
	
	private static final Date Date = null;
	LoanDetails loanDetails = new LoanDetails();
	BankDetails bankDetails = new BankDetails();
	AccountHolderDetails accountHolderDetails = new AccountHolderDetails();
	AddressDetails addressDetails = new AddressDetails();
	 

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Expenditure expenditure=new Expenditure();//object for main class
		
		System.out.println("loan example :::::");

		LoanDetails loanDetails = new LoanDetails(); // oject creation for the class

		loanDetails.setEmi(1883);
		loanDetails.setInterestRate(10);
		loanDetails.setLoanAmount(100000);
		loanDetails.setLoanNumber(243546467);

		loanDetails.setLoanTenure(20);
		loanDetails.setLoanType("personal loan");
		loanDetails.setProcessingFee(1932);

		System.out.println("-------loan details----------");
		System.out.println("loan type:" + loanDetails.getLoanType());
		System.out.println("loan emi:" + loanDetails.getEmi());
		System.out.println("loan roi:" + loanDetails.getInterestRate());
		System.out.println("loan amt:" + loanDetails.getLoanAmount());
		System.out.println("loan no.:" + loanDetails.getLoanNumber());
		System.out.println("loan tenure:" + loanDetails.getLoanTenure());
		System.out.println("loan processing fees:" + loanDetails.getProcessingFee());
		
		BankDetails bankDetails = new BankDetails(); // object creation for the class
		
		

		bankDetails.setAccountNumber(64554546);
		bankDetails.setBankName("axis bank");
		bankDetails.setIfscCode("axin73646");
		bankDetails.setBranchName("hubli");

	
		AddressDetails bankAddress = new AddressDetails();//for common details
		 	
		
		 bankAddress.setDoorNumber("123/24"); 
		 bankAddress.setFlatNumber("786");
		 bankAddress.setStreetName("mustafa nagar");
		 bankAddress.setDistrict("dharwad"); 
		 bankAddress.setState("karnataka");
		 bankAddress.setPincode("580010");
		 
		 
		 
		bankDetails.setBankAddress(bankAddress);

		
		  System.out.println("-------------bank  details-------------");
		 System.out.println("acc number:"+bankDetails.getAccountNumber());
		  System.out.println("bank name:"+bankDetails.getBankName());
		  System.out.println("ifsc:"+bankDetails.getIfscCode());
		  
		  
		  
		  System.out.println("door number:"+bankAddress.getDoorNumber());
		  System.out.println("flat number:"+bankAddress.getFlatNumber());
		  System.out.println("street name:"+bankAddress.getStreetName());
		  System.out.println("district:"+bankAddress.getDistrict());
		  System.out.println("state:"+bankAddress.getState());
		  System.out.println("Pincode:"+bankAddress.getPincode());
		 System.out.println("bank address:" + bankDetails.getBankAddress());
		
		 
		 AccountHolderDetails accountHolderDetails = new AccountHolderDetails();
		 AddressDetails customerbankAddress = new AddressDetails();//for common details
		
		 accountHolderDetails.setPanNumber("aclpf54647");
		 accountHolderDetails.setAdharNumber(5547587866767l);
		 customerbankAddress.setAccountHolderAddress();
		 accountHolderDetails.setContactNumber(68869797979l);
		 accountHolderDetails.setEmailId("hdghgfhf@gmail.com");
		 accountHolderDetails.setFullName("furqan sayed");
		
		 System.out.println("------------a/c holder details---------------");
		 System.out.println("pan numbr:" +accountHolderDetails.getPanNumber());
		 System.out.println("aadhar:" +accountHolderDetails.getAdharNumber());
		 System.out.println("cust bank details:" +accountHolderDetails.getAccountHolderAddress());
		 System.out.println("contact:" +accountHolderDetails.getContactNumber());
		 System.out.println("EmailId:" +accountHolderDetails.getEmailId());
		 
			 
			
			 
	}

}
