/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.paymentchain.transaction.repository;

import com.paymentchain.transaction.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author nooor
 */
public interface CustomerRepository extends JpaRepository<Transaction, Long> {
    
    @Query("SELECT c FROM Customer c WHERE c.code = ?1")
    public Transaction findByCode(String code);
    
    @Query("SELECT c FROM Customer c WHERE c.iban = ?1")
    public Transaction findByAccount(String iban);
    
}
