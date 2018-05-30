package rc.dbinitdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rc.dbinitdemo.entity.BankAccountEntity;
import rc.dbinitdemo.models.BankAccount;

@RestController
@RequestMapping("/accounts")
public class BankAccountController {

    @Autowired
    private BankAccountRepository bankAccountRepository;

    public BankAccountController(BankAccountRepository bankAccountRepository){
        this.bankAccountRepository = bankAccountRepository;
    }

//    @GetMapping("/all")
//    public Iterable<BankAccount> all(){
//        return this.bankAccountRepository.findAll();
//    }
//
    @RequestMapping(value = "/account", method = RequestMethod.POST)
    public BankAccountEntity createAccount(@RequestBody BankAccount bankAccount) {
        System.out.println("In Post request.... {}" + bankAccount.getAmount());
        return /*bankAccount ;*/this.bankAccountRepository.save(new BankAccountEntity(bankAccount));
    }




//    @RequestMapping(value = "/accounts", method = RequestMethod.POST)
//    public BankAccount Account() {
//        BankAccount bankAccount = new BankAccount();
//        bankAccount.setAmount(200);
////        bankAccount.setId(2);
//        Owner owner = new Owner();
//        owner.setName("xyz");
//        owner.setAddress("pune");
//        bankAccount.setSource(owner);
//        return this.bankAccountRepository.save(bankAccount);
//    }
}
