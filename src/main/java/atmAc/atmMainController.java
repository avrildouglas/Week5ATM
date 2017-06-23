package atmAc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import atmAc.ATMAccount;
import atmAc.atmAcRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/atm") // This means URL's start with /atm (after Application path)

public class atmMainController {
	@Autowired // This means to get the bean called atmAcRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private atmAcRepository atmAcRepository;
	private double amtBalCurr;

	@GetMapping(path="/deposit") // Map ONLY GET Requests
	public @ResponseBody String Deposit (@RequestParam double depAmt){
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		double amtDeposit;
		
	    ATMAccount c = new ATMAccount();
		amtDeposit = depAmt;
		amtBalCurr += amtDeposit;
	    c.setAccAmount(amtBalCurr);
	    atmAcRepository.save(c);
		
		return "Deposit complete. Balance is: " + amtBalCurr;
	}
	
	@GetMapping(path="/withdraw") // Map ONLY GET Requests
	public @ResponseBody String Withdrawal (@RequestParam double withdrawAmt){
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		double amtWithdraw;
	
	    ATMAccount c = new ATMAccount();

		amtWithdraw = withdrawAmt; //Amount withdrawn from form
	    amtBalCurr -= amtWithdraw;
		c.setAccAmount(amtBalCurr);
		atmAcRepository.save(c);
		
		return "Withdrawal complete. Balance is: " + amtBalCurr;
	}
	
	
	@GetMapping(path="/balance") // Map ONLY GET Requests
	public @ResponseBody String Balance (@RequestParam double balAmt){
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		double lastBal;
	
	    ATMAccount c = new ATMAccount();
	    lastBal = 0.00;
	    return "Your current balance is: $" + amtBalCurr;

	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<ATMAccount> getAllTransHistory() {
		// This returns a JSON or XML with the users
		return atmAcRepository.findAll();
	}
	
}