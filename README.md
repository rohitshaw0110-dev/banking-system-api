# Banking System API

A Spring Boot REST API for managing banking operations like account creation, deposit, and withdrawal with proper exception handling and clean architecture.

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