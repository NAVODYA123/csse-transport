package com.csse.transport.controller;

import com.csse.transport.model.BusStop;
import com.csse.transport.model.Fee;
import com.csse.transport.repository.BusStopRepository;
import com.csse.transport.repository.FeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Controller  // This means that this class is a Controller
@RequestMapping(path="/fee-algo") // This means URL's start with /demo (after Application path)
public class FeeController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired   // This means to get the bean called userRepository
    private FeeRepository feeRepository;



//    @GetMapping(path="/")

    //get bus fair algorithm details

    @GetMapping(path="/get-fee-algo")
    public @ResponseBody Fee getDetail_one(@RequestParam int id){

        return feeRepository.findById(id);
    }

    @GetMapping(path="/get-all-fee-algo")
    public @ResponseBody
    Iterable<Fee> getDetail_all(){

        return feeRepository.findAll();
    }

//    update fee algo
@PostMapping("/update-fee-algo")
//@CrossOrigin(origins = "http://localhost:3000")
public ResponseEntity updateFeeAlgo(@RequestBody Map<String,String> body){
    ResponseFeeUpdate rfu = new ResponseFeeUpdate();

    System.out.println(body);
    System.out.println(body.get("initialprice1"));
   try {
       Fee f1  = feeRepository.findById(1);
       Fee f2 = feeRepository.findById(2);
       Fee f3 = feeRepository.findById(3);

       f1.setInitialprice(Double.parseDouble(body.get("initialprice1")));
       f1.setClassFactor(Double.parseDouble(body.get("classFactor1")));
//       f1.setUserId(body.get("userid"));
       f1.setBusClass(body.get("busClass1"));
       f1.setPriceFactor(Double.parseDouble(body.get("priceFactor1")));

       f2.setInitialprice(Double.parseDouble(body.get("initialprice2")));
       f2.setClassFactor(Double.parseDouble(body.get("classFactor2")));
//       f2.setUserId(body.get("userid"));
       f2.setBusClass(body.get("busClass2"));
       f2.setPriceFactor(Double.parseDouble(body.get("priceFactor2")));

       f3.setInitialprice(Double.parseDouble(body.get("initialprice3")));
       f3.setClassFactor(Double.parseDouble(body.get("classFactor3")));
//       f3.setUserId(body.get("userid"));
       f3.setBusClass(body.get("busClass3"));
       f3.setPriceFactor(Double.parseDouble(body.get("priceFactor3")));

       Fee saved1 = feeRepository.save(f1);
       Fee saved2 = feeRepository.save(f2);
       Fee saved3 = feeRepository.save(f3);



       rfu.setMessage("Fee algorithm components updated successfully ");

   }catch (Exception ex){
       rfu.setMessage(ex.getMessage());
       System.out.println(ex);
   }

    return ResponseEntity
            .ok()
            .body(rfu);

}

public class ResponseFeeUpdate{
        private String message;
        private Fee []fee;

    public Fee[] getFee() {
        return fee;
    }

    public void setFee(Fee[] fee) {
        this.fee = fee;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

}
