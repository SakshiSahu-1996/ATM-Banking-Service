package Service;

import org.springframework.stereotype.Service;

import DataSource.IciciDataSource;
import Model.Account;
@Service
public class IciciService extends AtmService {

	private IciciDataSource iciciDataSource;

	public IciciService() {
		this.iciciDataSource = new IciciDataSource();
	}

	@Override
	public double withdraw(Account account, double amount) {
		Account[] accountArray = iciciDataSource.listOfAccounts();
		for (int index = 0; index < accountArray.length; index++) {
			Account storedAccount = accountArray[index];
			boolean numberValidation = storedAccount.getNumber() == account.getNumber();
			boolean passwordValidation = storedAccount.getPassword() == account.getPassword();
			if (numberValidation && passwordValidation) {
				double storedBalance = storedAccount.getBalance();
				if (amount <= storedBalance) {
					storedBalance = storedBalance - amount;
					storedAccount.setBalance(storedBalance);
					System.out.println("Withdrawal success available balance " + storedBalance);
					return amount;
				} else {
					System.out.println("Withdrawal fail");
					return 0;
				}
			}
		}
		System.out.println("Withdrawal fail");
		return 0;
	}

	@Override
	public double deposit(Account account, double amount) {
		Account[] accountArray = iciciDataSource.listOfAccounts();
		for (int index = 0; index < accountArray.length; index++) {
			Account storedAccount = accountArray[index];
			boolean numberValidation = storedAccount.getNumber() == account.getNumber();
			boolean passwordValidation = storedAccount.getPassword() == account.getPassword();
			if (numberValidation && passwordValidation) {
				double storedBalance = storedAccount.getBalance();
				storedBalance = storedBalance + amount;
				storedAccount.setBalance(storedBalance);
				System.out.println("Deposit success available balance " + storedBalance);
				return amount;
			}
		}
		System.out.println("Withdrawal fail");
		return 0;
	}

	@Override
	public double showBalance(Account account) {
		Account[] accountArray = iciciDataSource.listOfAccounts();
		for (int index = 0; index < accountArray.length; index++) {
			Account storedAccount = accountArray[index];
			boolean numberValidation = storedAccount.getNumber() == account.getNumber();
			boolean passwordValidation = storedAccount.getPassword() == account.getPassword();
			if (numberValidation && passwordValidation) {
				double storedBalance = storedAccount.getBalance();
				System.out.println("Available balance " + storedBalance);
				return storedBalance;
			}
		}
		System.out.println("Invalid Account");
		return 0;
	}

	@Override
	public boolean changePin(Account account, int password) {
		Account[] accountArray = iciciDataSource.listOfAccounts();
		for (int index = 0; index < accountArray.length; index++) {
			Account storedAccount = accountArray[index];
			boolean numberValidation = storedAccount.getNumber() == account.getNumber();
			boolean passwordValidation = storedAccount.getPassword() == account.getPassword();
			if (numberValidation && passwordValidation) {
				storedAccount.setPassword(password);
				System.out.println("Pin changed ");
				return true;
			}
		}
		System.out.println("fail");
		return false;
	}

}
