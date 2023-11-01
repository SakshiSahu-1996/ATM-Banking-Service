package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Model.Account;
import Service.AtmService;
import Service.HdfcService;
@RestController
@RequestMapping("/hdfc")
public class HdfcController {
	
	
	private AtmService atmService;
	
	public HdfcController() {
		// Parent Reference and Child Object | Runtime Polymorphism
		this.atmService = new HdfcService();
	}
	
	@GetMapping
	public double withDrawBalance(@RequestParam String name) {
		
		Account account = null;
		
		switch(name) {
			case "isha" : {
				Account isha = new Account(101010, "Isha", 999999.00, 1234);
				account = isha;
				break;
			}
			case "akshat" : {
				Account akshat = new Account(101011, "Akshat", 50456.00, 0000);
				account = akshat;
				break;
			}
			case "palak" : {
				Account palak = new Account(101012, "Palak", 3737900.00, 9999);
				account = palak;
				break;
			}
			case "doremon" : {
				Account doremon = new Account(1010103, "Doremon", 128383.00, 8989);
				account = doremon;
				break;
			}
			default: {
				System.out.println("Name case not found");
				
			}
		}
		if(account != null) {
		double withDrawaAmount = atmService.withdraw(account, 300);
		System.out.println("withDrawaAmount " + withDrawaAmount);
		return withDrawaAmount;
		}
		return 0;
	}

}
