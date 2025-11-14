package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Customer;

@Controller
public class CustomerOperationsController {
      @GetMapping("/report")
      public String showReport(Map<String, Object> map) {
    	  //add model attributes (simple values)
    	  map.put("name", "Bhushan Patil");
    	  map.put("age", new Random().nextInt(30));
    	  //add model attributes (arrays,collections)
    	  map.put("favColors", new String[] {"red","green","yellow"});
    	  map.put("friends", List.of("Bhushan","Aakash","Chetan"));
    	  map.put("phones", Set.of(9999999,88888888,77777777));
    	  map.put("idDetails", Map.of("aadhar",89881650,"Pan",9189));
    	  //keep model class Object as the model attribute
    	  Customer cust=new Customer(1001,"Raja","Nandurbar",78900.0);
    	  map.put("custData", cust);
    	  
    	  //keep List of Customers info as the model attribute
    	  Customer cust1=new Customer(1001,"Vishakha","Mumbai",89900.0);
    	  Customer cust2=new Customer(1002,"Onkar","Ratnagiri",45900.0);
    	  Customer cust3=new Customer(1003,"Shyam","Dhule",58900.0);
    	  List<Customer> custList=List.of(cust1,cust2,cust3);
    	  map.put("custList", custList);
    	  //return LVN
    	  return "show_report";
      }
}
