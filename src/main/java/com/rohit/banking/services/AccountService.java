package com.rohit.banking.services;

import java.util.List;

import com.rohit.banking.dtos.AccountDto;

public interface AccountService {

	public AccountDto createAccount(AccountDto accountDto);

	public AccountDto getAccountById(Long id);

	public List<AccountDto> getAllAccounts();

	public void deleteAccountById(Long id);

	public AccountDto depositById(Long id, double amount);

	public AccountDto withdrawById(Long id, double amount);
}
