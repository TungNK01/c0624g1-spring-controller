package com.codegym.c0624g1customermanagement;

import com.codegym.c0624g1customermanagement.model.Customer;
import com.codegym.c0624g1customermanagement.service.CustomerServiceImpl;
import com.codegym.c0624g1customermanagement.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private ICustomerService customerServiceImpl;

    /*private CustomerServiceImpl customerServiceImpl;

    public CustomerController(CustomerServiceImpl customerServiceImpl){
        this.customerServiceImpl = customerServiceImpl;
    }*/

    /*private CustomerServiceImpl customerServiceImpl;

    @Autowired
    public void setCustomerServiceImpl(CustomerServiceImpl customerServiceImpl) {
        this.customerServiceImpl = customerServiceImpl;
    }*/

    //private ICustomerService customerService = new CustomerServiceImpl();
    /*@RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showList(HttpServletRequest request) {
        List<Customer> customers = customerServiceImpl.findAll();
        request.setAttribute("customers", customers);
        return "customers/list";
    }*/

    /*@GetMapping("")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("customers/list");
        List<Customer> customers = customerServiceImpl.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }*/

    /*@GetMapping("/{id}")
    public ModelAndView showInformation(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("customers/info");
        Customer customer = customerServiceImpl.findById(Integer.parseInt(String.valueOf(id)));
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }*/

    /*@GetMapping("/create")
    public ModelAndView createCustomerForm(){
        ModelAndView modelAndView = new ModelAndView("customers/create");
        return modelAndView;
    }*/

    /*@PostMapping("/save")
    public ModelAndView saveCustomer(@RequestParam String name,
                                     @RequestParam String email,
                                     @RequestParam String address){

        int id = (int) (Math.random() * 10000);
        Customer customer = new Customer(id,name,email,address);
        customerServiceImpl.save(customer);
        return new ModelAndView("customers/list");
    }*/

    /*@PostMapping("/save")
    public ModelAndView saveCustomer(@ModelAttribute("Customer") Customer customer){
        int id = (int) (Math.random() * 10000);
        customer.setId(id);
        customerServiceImpl.save(customer);
        return new ModelAndView("");
    }*/

    /*@GetMapping("/{name:[a-z-]+}-{version:\\d\\.\\d\\.\\d}")
    public void handle(@PathVariable String name, @PathVariable String version)
    {
        int i = 10;
    }*/

}
