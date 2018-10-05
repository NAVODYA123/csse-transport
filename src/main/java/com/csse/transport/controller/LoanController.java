package com.csse.transport.controller;

import com.csse.transport.model.Passenger;
import com.csse.transport.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/Busloan")
public class LoanController {
    @Autowired
    private PassengerRepository passengerRepository;

    @PostMapping(path="/applyloan")
    public @ResponseBody
    String addLoan (@RequestBody Map<String, String> body){
        String pid = body.get("pid");
    Passenger  op =passengerRepository.findByPid(pid);
        double amount = op.getAmountAvailable();
        int loanamount=op.getLoanamount();
        //int s=loanamount+1;
        if(amount<10 && loanamount==0) {
//            Passenger p=new Passenger();

            double q=amount+200;
            op.setAmountAvailable(q);
            op.setLoanamount(1);
//            p.setPid(op.getPid());
//            p.setName(op.getName());
//            p.setEmail(passengerRepository.findByPid(pid).getEmail());
//            p.setSex(passengerRepository.findByPid(pid).getSex());


            passengerRepository.save(op);





        return "your account is succefully credited your new balance is"+q ;

        }
        else{
            return "sorry you cant get loan service your balance is more than 10 or you already got loan";
        }




    }

   // @RequestMapping(value = "addloan/{id}",method = RequestMethod.PUT)
    //ResponseStatus(HttpStatus.OK)
    //public void updateloan(@PathVariable String id,@RequestBody Map<String, String> body){
      //  String pid = id;
        //double amount = passengerRepository.findByPid(pid).getAmountAvailable();
       // int loanamount=passengerRepository.findByPid(pid).getLoanamount();

      //  if(amount>10 && loanamount==0) {
         //   Passenger p=new Passenger();

         //   int loanamount=p.setLoanamount(1);
         //   double avilable=amount+200;

          //  double lastamount=p.setAmountAvailable(avilable);
           // return "your account is succefully credited";

     //   }
      //  else{
       //     return "sorry you cant get loan service your balance is more than 10 or you already got loan";
       // }





   // }


}
