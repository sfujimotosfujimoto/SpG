package com.sfujimoto.services;
/* sfujimoto: 2017/03/21 17:43 */

import com.sfujimoto.domain.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> listAllCustomers();

    Customer getCustomerById(Integer id);

    Customer saveOrUpdateCustomer(Customer customer);


    void deleteCustomer(Integer id);
}
