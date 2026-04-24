# Banking System API

## 📌 Project Overview

Designed and developed a Banking REST API using Spring Boot with a layered architecture (Controller, Service, Repository).

Implemented core banking features like account creation, deposit, withdrawal, and deletion. Applied DTO pattern for clean data transfer and global exception handling for robust error management.

---

## 🚀 Features

- Create Bank Account
- Get Account Details
- Deposit Money
- Withdraw Money
- Delete Account
- Global Exception Handling

---

## 🛠 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

## 📂 Project Structure

- Controller → Handles API requests
- Service → Business logic
- Repository → Database interaction
- DTO → Data transfer objects
- Mapper → Entity ↔ DTO conversion
- Exception → Custom exception handling

---

## ⚙️ Configuration

Create your own `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/banking_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

---

## ▶️ Run the Project

1. Clone repository  
2. Configure database  
3. Run `BankingServiceApplication.java` 

--- 

## 📌 API Endpoints

| Method | Endpoint | Description |
|--------|--------|-------------|
| POST | /api/accounts | Create account |
| GET | /api/accounts/{id} | Get account |
| GET | /api/accounts | Get all accounts |
| PUT | /api/accounts/{id}/deposit | Deposit |
| PUT | /api/accounts/{id}/withdraw | Withdraw |
| DELETE | /api/accounts/{id} | Delete |

---

## 📄 License

This project is licensed under the MIT License.

---

## 📸 API Screenshots

### 🟢 Create Account
![Create Account 1](screenshots/create-account-1.png)
![Create Account 2](screenshots/create-account-2.png)
![Create Account 3](screenshots/create-account-3.png)
![Database After Account Creation](screenshots/db-after-create-account.png)

---

### 🟢 Get Account
![Get Account 1](screenshots/get-account-1.png)
![Get Account 2](screenshots/get-account-2.png)
![Get Account 3](screenshots/get-account-3.png)
![Get All Accounts](screenshots/get-all-accounts.png)

---

### 🟢 Deposit
![Deposit 1](screenshots/deposit-1.png)
![Deposit 2](screenshots/deposit-2.png)
![Deposit 3](screenshots/deposit-3.png)
![Database After Deposit](screenshots/db-after-deposit.png)

---

### 🟢 Withdraw
![Withdraw 1](screenshots/withdraw-1.png)
![Withdraw 2](screenshots/withdraw-2.png)
![Withdraw 3](screenshots/withdraw-3.png)
![Database After Withdraw](screenshots/db-after-withdraw.png)

---

### 🟢 Delete Account
![Delete Account](screenshots/delete-account.png)
![Database After Delete](screenshots/db-after-delete.png)

---

### 🔴 Exception Handling
![Insufficient Balance](screenshots/insufficient-balance.png)
![Account Exception](screenshots/account-exception.png)

---
