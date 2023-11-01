package DataSource;

import Model.Account;

public class IciciDataSource {
	
	public Account[] listOfAccounts() {

		Account aditi = new Account(4325678, "Aditi", 999999.00, 9090);
		Account sadaf = new Account(523647, "Sadaf", 50456.00, 2830);
		Account aarnav = new Account(9273737, "Aarnav", 3737900.00, 8374);
		Account vansh = new Account(8623458, "Vansh", 128383.00, 8989);
		Account prabh = new Account(1010103, "Prabhjeet", 737363.00, 3546);
		Account yuvraj = new Account(8623459, "Yuvraj", 9238393.00, 1984);
		Account akhil = new Account(1010103, "Akhil", 8373838.00, 7982);
		Account sahil = new Account(4325698, "Sahil", 26363654.00, 7302);
		
		Account[] accountArray = { aditi, sadaf, aarnav, vansh, prabh, yuvraj, akhil, sahil };
		return accountArray;
	}


}
