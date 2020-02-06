package com.athtech.bankvault.bankvaultserver.commons.errors;

import java.io.Serializable;

public interface ErrorCode extends Serializable {

    String getCode();

    String getMessage();
}
