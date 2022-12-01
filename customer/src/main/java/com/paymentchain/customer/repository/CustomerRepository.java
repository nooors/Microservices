/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.paymentchain.customer.repository;

import com.paymentchain.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nooor
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
