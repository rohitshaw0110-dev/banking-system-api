package com.rohit.banking.exceptions;

import java.time.LocalDateTime;

public record ExceptionDetails(LocalDateTime timestamp, String message, String details, String errorcode) {

}
