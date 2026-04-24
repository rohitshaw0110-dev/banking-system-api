package com.rohit.banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.banking.enitites.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
