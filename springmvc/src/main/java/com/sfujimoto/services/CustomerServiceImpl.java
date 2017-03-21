package com.sfujimoto.services;
/* sfujimoto: 2017/03/21 17:44 */

import com.sfujimoto.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {
    private Map<Integer, Customer> customers;

    public CustomerServiceImpl() {
        loadCustomers();
    }

    @Override
    public List<Customer> listAllCustomers(){
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customers.get(id);
    }

    @Override
    public Customer saveOrUpdateCustomer(Customer customer) {
        if (customer != null) {
            if (customer.getId() == null) {
                customer.setId(getNextKey());
            }
            customers.put(customer.getId(), customer);
            return customer;

        } else {
            throw new RuntimeException("Customer can' be null...");
        }
    }


    private Integer getNextKey() {
        return Collections.max(customers.keySet()) + 1;
    }

    @Override
    public void deleteCustomer(Integer id) {
        customers.remove(id);
    }

    private void loadCustomers() {
        customers = new HashMap<>();

        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Tim");
        customer1.setLastName("Greaty");
        customer1.setEmail("example@example.com");
        customer1.setPhoneNumber("999-98999");
        customer1.setAddress1("Yoko");
        customer1.setAddress2("Shibuya");
        customer1.setCity("Tokyo");
        customer1.setState("Japan");
        customer1.setZipCode("175-0000");
        customers.put(1, customer1);

        Customer customer2 = new Customer();
        customer2.setId(3);
        customer2.setFirstName("John");
        customer2.setLastName("Tanaka");
        customer2.setEmail("johntanaka@example.com");
        customer2.setPhoneNumber("999-1111");
        customer2.setAddress1("1-12-2");
        customer2.setAddress2("Kita");
        customer2.setCity("Saitama");
        customer2.setState("Japan");
        customer2.setZipCode("987-0000");
        customers.put(2, customer2);

        Customer customer3 = new Customer();
        customer3.setId(3);
        customer3.setFirstName("Yoko");
        customer3.setLastName("Shiokawa");
        customer3.setEmail("yokoshiokawa@example.com");
        customer3.setPhoneNumber("222-98999");
        customer3.setAddress1("3-12");
        customer3.setAddress2("Toki");
        customer3.setCity("Gunma");
        customer3.setState("Japan");
        customer3.setZipCode("175-3333");
        customers.put(3, customer3);

        Customer customer4 = new Customer();
        customer4.setId(4);
        customer4.setFirstName("Takeru");
        customer4.setLastName("Oishi");
        customer4.setEmail("takeruoishi@example.com");
        customer4.setPhoneNumber("333-98999");
        customer4.setAddress1("9-1009");
        customer4.setAddress2("Azabu");
        customer4.setCity("Tokyo");
        customer4.setState("Japan");
        customer4.setZipCode("112-0000");
        customers.put(4, customer4);

    }
}
