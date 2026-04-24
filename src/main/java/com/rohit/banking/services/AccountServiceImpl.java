package com.rohit.banking.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rohit.banking.dtos.AccountDto;
import com.rohit.banking.enitites.Account;
import com.rohit.banking.exceptions.AccountException;
import com.rohit.banking.exceptions.InsufficientBalanceException;
import com.rohit.banking.mappers.AccountMapper;
import com.rohit.banking.repositories.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	private AccountRepository accountRepository;

	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	// Create Account Implementation
	@Override
	public AccountDto createAccount(AccountDto accountDto) {

		Account account = AccountMapper.mapToAccount(accountDto);
		Account savedAccount = accountRepository.save(account);

		return AccountMapper.mapToAccountDto(savedAccount);
	}

	// Get Account By Id Implementation
	@Override
	public AccountDto getAccountById(Long id) {
		Account account = accountRepository.findById(id)
				.orElseThrow(() -> new AccountException("Account Does Not Exists"));
		return AccountMapper.mapToAccountDto(account);
	}

	// Get All Account Implementation
	@Override
	public List<AccountDto> getAllAccounts() {
		List<Account> accounts = accountRepository.findAll();
		return accounts.stream().map((account) -> AccountMapper.mapToAccountDto(account)).collect(Collectors.toList());
	}

	// Delete Account Implementation
	@Override
	public void deleteAccountById(Long id) {
		if (!accountRepository.existsById(id)) {
			throw new AccountException("Account Does Not Exists");
		}
		accountRepository.deleteById(id);
	}

	// Deposit Implementation
	@Override
	public AccountDto depositById(Long id, double amount) {
		Account account = accountRepository.findById(id)
				.orElseThrow(() -> new AccountException("Account Does Not Exists"));
		double updatedBalance = account.getBalance() + amount;
		account.setBalance(updatedBalance);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}

	// Withdraw Implementation
	@Override
	public AccountDto withdrawById(Long id, double amount) {
		Account account = accountRepository.findById(id)
				.orElseThrow(() -> new AccountException("Account Does Not Exists"));

		if (amount > account.getBalance()) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}

		double updatedBalance = account.getBalance() - amount;
		account.setBalance(updatedBalance);
		Account savedAccount = accountRepository.save(account);
		return AccountMapper.mapToAccountDto(savedAccount);
	}
}
