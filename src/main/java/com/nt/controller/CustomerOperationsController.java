package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
    	  
    	  //return LVN
    	  return "show_report";
      }
}
