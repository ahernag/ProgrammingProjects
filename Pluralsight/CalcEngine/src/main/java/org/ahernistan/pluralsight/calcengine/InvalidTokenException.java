package org.ahernistan.pluralsight.calcengine;

public class InvalidTokenException extends Exception {
    private static final String ERROR_MESSAGE =
            "AbstractToken must be either a non-empty 'String' or a Character (char) object. Strings must not have any blanks or be a numeric string.";
    String additionalErrorMessage = null;

    public InvalidTokenException(){
        super(ERROR_MESSAGE);
    }

    public InvalidTokenException(String additionalErrorMessage, boolean append){
        super(ERROR_MESSAGE + (append ? additionalErrorMessage : ""));

        if (!append)
            this.additionalErrorMessage = additionalErrorMessage;
    }

    public InvalidTokenException(Throwable cause){
        super(ERROR_MESSAGE, cause);
    }

    public InvalidTokenException(String additionalErrorMessage, boolean append, Throwable cause){
        super(ERROR_MESSAGE + (append ? additionalErrorMessage : ""), cause);

        if (!append)
            this.additionalErrorMessage = additionalErrorMessage;
    }
}

