package com.rohit.banking.mappers;

import com.rohit.banking.dtos.AccountDto;
import com.rohit.banking.enitites.Account;

public class AccountMapper {
	public static Account mapToAccount(AccountDto accountDto) {
		Account account = new Account(accountDto.id(), accountDto.accountHolderName(), accountDto.balance());

		return account;
	}

	public static AccountDto mapToAccountDto(Account account) {
		AccountDto accountDto = new AccountDto(account.getId(), account.getAccountHolderName(), account.getBalance());

		return accountDto;
	}

}
