package atmAC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class atmReturnController {

    @GetMapping("/atm")   
    public String depositForm(Model model) {
        model.addAttribute("objdeposit", new ATMAccount());
        return "htmdeposit";
    }

    @PostMapping("/atm")
    public String depositSubmit(@ModelAttribute ATMAccount objdeposit) {
        return "htmtranshistory";
    }

}