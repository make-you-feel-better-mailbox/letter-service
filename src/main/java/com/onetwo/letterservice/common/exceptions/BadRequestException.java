package com.onetwo.letterservice.common.exceptions;

import lombok.Getter;

@Getter
public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
        super(message);
    }
}
