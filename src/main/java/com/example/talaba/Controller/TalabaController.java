package com.example.talaba.Controller;

import com.example.talaba.Entity.Talaba;
import com.example.talaba.Repository.TalabaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TalabaController {

     @Autowired
    TalabaRepository talabaRepository;
     @RequestMapping(value = "/joylash", method = RequestMethod.POST)
    public String joylash(@RequestBody Talaba talaba){
         boolean b = talabaRepository.existsByEmail(talaba.getEmail());
         if(b) return "Bunday email mavjud";
         Talaba talaba1=new Talaba();
         talaba1.setIsm(talaba.getIsm());
         talaba1.setFamiliya(talaba.getFamiliya());
         talaba1.setTelRaqam(talaba.getTelRaqam());
         talaba1.setManzil(talaba.getManzil());
         talaba1.setEmail(talaba.getEmail());
         talabaRepository.save(talaba1);
         return "Data saved succesfully";
     }
}
