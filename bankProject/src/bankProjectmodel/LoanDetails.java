/**
 * 
 */
package bankProjectmodel;

import java.sql.Date;

/**
 * @author Dell
 *
 */
public class LoanDetails {
	
	
		private static final Date i = null;
		private String loanType;
		private float emi;
		private Date dueDate;
		private int loanTenure;
		private float loanAmount;
		private float interestRate;
		private float processingFee;
		private long loanNumber;

		private String loanTackerAddress;

		/**
		 * @return the loanType
		 */
		public String getLoanType() {
			
			return loanType;
		}

		/**
		 * @param loanType the loanType to set
		 */
		public void setLoanType(String loanType) {
			this.loanType = loanType;
		}

		/**
		 * @return the emi
		 */
		public float getEmi() {
			return emi;
		}

		/**
		 * @param emi the emi to set
		 */
		public void setEmi(float emi) {
			this.emi = emi;
		}

		/**
		 * @return the dueDate
		 */
		public Date getDueDate() {
			return dueDate;
		}

		/**
		 */
		public void setDueDate(Date dueDate) {
			this.dueDate = dueDate;
		}

		/**
		 * @return the loanTenure
		 */
		public int getLoanTenure() {
			return loanTenure;
		}

		/**
		 * @param loanTenure the loanTenure to set
		 */
		public void setLoanTenure(int loanTenure) {
			this.loanTenure = loanTenure;
		}

		/**
		 * @return the loanAmount
		 */
		public float getLoanAmount() {
			return loanAmount;
		}

		/**
		 * @param loanAmount the loanAmount to set
		 */
		public void setLoanAmount(float loanAmount) {
			this.loanAmount = loanAmount;
		}

		/**
		 * @return the interestRate
		 */
		public float getInterestRate() {
			return interestRate;
		}

		/**
		 * @param interestRate the interestRate to set
		 */
		public void setInterestRate(float interestRate) {
			this.interestRate = interestRate;
		}

		/**
		 * @return the processingFee
		 */
		public float getProcessingFee() {
			return processingFee;
		}

		/**
		 * @param processingFee the processingFee to set
		 */
		public void setProcessingFee(float processingFee) {
			this.processingFee = processingFee;
		}

		/**
		 * @return the loanNumber
		 */
		public long getLoanNumber() {
			return loanNumber;
		}

		/**
		 * @param loanNumber the loanNumber to set
		 */
		public void setLoanNumber(long loanNumber) {
			this.loanNumber = loanNumber;
		}

		/**
		 * @return the loanTackerAddress
		 */
		public String getLoanTackerAddress() {
			return loanTackerAddress;
		}

		/**
		 * @param string the loanTackerAddress to set
		 */
		public void setLoanTackerAddress(AddressDetails loanTackerAddress) {
			this.loanTackerAddress = "loanTackerAddress";
		}

		
		
		
		}
		
		
