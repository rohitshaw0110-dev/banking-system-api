package com.rohit.banking.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohit.banking.dtos.AccountDto;
import com.rohit.banking.services.AccountService;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

	private AccountService accountService;

	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}

	// Add Account RESTful API
	@PostMapping
	public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {
		return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
	}

	// Get Account By Id RESTful API
	@GetMapping("/{id}")
	public ResponseEntity<AccountDto> getAccount(@PathVariable Long id) {
		AccountDto accountDto = accountService.getAccountById(id);
		return new ResponseEntity<>(accountDto, HttpStatus.OK);
	}

	// Get All Accounts RESTful API
	@GetMapping
	public ResponseEntity<List<AccountDto>> getAccounts() {
		List<AccountDto> allAccounts = accountService.getAllAccounts();
		return ResponseEntity.ok(allAccounts);
	}

	// Delete Account By Id RESTful API
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteAccount(@PathVariable Long id) {
		accountService.deleteAccountById(id);
		return ResponseEntity.noContent().build();
	}

	// Deposit Amount By Id RESTful API
	@PutMapping("/{id}/deposit")
	public ResponseEntity<AccountDto> deposit(@PathVariable Long id, @RequestBody Map<String, Double> requestBody) {
		double amount = requestBody.get("amount");
		AccountDto savedAccount = accountService.depositById(id, amount);
		return ResponseEntity.ok(savedAccount);
	}

	// Withdraw Amount By Id RESTful API
	@PutMapping("/{id}/withdraw")
	public ResponseEntity<AccountDto> withdraw(@PathVariable Long id, @RequestBody Map<String, Double> requestbody) {
		double amount = requestbody.get("amount");
		AccountDto savedAccount = accountService.withdrawById(id, amount);
		return ResponseEntity.ok(savedAccount);
	}
}
