package com.athtech.bankvault.bankvaultserver.commons.errors.exceptions;

import com.athtech.bankvault.bankvaultserver.commons.errors.ErrorCode;
import org.springframework.http.HttpStatus;

public class RestServiceException extends BankVaultExcpetion{

    private ErrorCode errorCode;
    private HttpStatus errorStatus;
    private String errorBody;

    public RestServiceException(ErrorCode errorCode, HttpStatus errorStatus, String errorBody)
    {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
        this.errorStatus = errorStatus;
        this.errorBody = errorBody;
    }

    public RestServiceException(ErrorCode errorCode, HttpStatus errorStatus, String errorBody, Throwable cause)
    {
        super(errorCode.getMessage(), cause);
        this.errorCode = errorCode;
        this.errorBody = errorBody;
        this.errorStatus = errorStatus;
    }

    public ErrorCode getErrorCode()
    {
        return errorCode;
    }

    public HttpStatus getErrorStatus()
    {
        return errorStatus;
    }

    public String getErrorBody()
    {
        return errorBody;
    }
}
