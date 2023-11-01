package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Model.Account;
import Service.AtmService;
import Service.IciciService;
@RestController
@RequestMapping("/icici")
public class IciciController {

	private AtmService atmService;

	public IciciController() {
		this.atmService = new IciciService();
	}
@GetMapping
	public double withDrawBalance(@RequestParam String name) {

		Account account = findAccount(name);
		
		if (account != null) {
			double withDrawaAmount = atmService.withdraw(account, 300);
			System.out.println("withDrawaAmount " + withDrawaAmount);
			return withDrawaAmount;
		}
		return 0;

	}

	private Account findAccount(String name) {

		Account account = null;
		switch (name) {
			case "aditi": {
				account = new Account(4325678, "Aditi", 999999.00, 9090);
				break;
			}
			case "sadaf": {
				account = new Account(523647, "Sadaf", 50456.00, 2830);
				;
				break;
			}
			case "aarnav": {
				account = new Account(9273737, "Aarnav", 3737900.00, 8374);
				break;
			}
			case "vansh": {
				account = new Account(8623458, "Vansh", 128383.00, 8989);
				break;
			}
			case "prabh": {
				account = new Account(1010103, "Prabhjeet", 737363.00, 3546);
				break;
			}
			case "yuvraj": {
				account = new Account(8623459, "Yuvraj", 9238393.00, 1984);
				break;
			}
			case "akhil": {
				account = new Account(1010103, "Akhil", 8373838.00, 7982);
				break;
			}
			case "sahil": {
				account = new Account(4325698, "Sahil", 26363654.00, 7302);
				break;
			}
			default: {
				System.out.println("Name case not found");
			}
		}
		return account;
	}

}
