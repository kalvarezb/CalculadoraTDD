package com.kodea.tdd.rest;

import java.util.concurrent.atomic.AtomicLong;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
import com.kodea.tdd.calc.ICalc;
 
@RestController
@RequestMapping("/api")
public class Controller {
 
   
    @Autowired
    private ICalc cal;
   
   
    private final AtomicLong counter = new AtomicLong();
   
   
    @RequestMapping(value="/add/{val1}/{val2}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public  Response add(@PathVariable double val1, @PathVariable double val2) {
           
        System.out.println("Adding...."+val1+" and "+val2);
        return  new Response(counter.incrementAndGet(), this.cal.add(val1, val2));
       
    }
   
    @RequestMapping(value="/subtract/{val1}/{val2}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public  Response subtract(@PathVariable double val1, @PathVariable double val2) {
           
        System.out.println("Subtracting...."+val1+" and "+val2);
        return  new Response(counter.incrementAndGet(), this.cal.subtract(val1, val2));
       
    }
   
    @RequestMapping(value="/multiply/{val1}/{val2}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public  Response multiply(@PathVariable double val1, @PathVariable double val2) {
           
        System.out.println("Multiplying...."+val1+" and "+val2);
        return  new Response(counter.incrementAndGet(), this.cal.multiply(val1, val2));
       
    }
   
    @RequestMapping(value="/divide/{val1}/{val2}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public  Response divide(@PathVariable double val1, @PathVariable double val2) {
           
        System.out.println("dividing...."+val1+" and "+val2);
        return  new Response(counter.incrementAndGet(), this.cal.divide(val1, val2));
       
    }
   
}
