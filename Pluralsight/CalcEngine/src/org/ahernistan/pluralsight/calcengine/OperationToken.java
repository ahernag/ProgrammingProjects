package org.ahernistan.pluralsight.calcengine;

public class OperationToken extends AbstractToken<String> {

    public OperationToken(String token) throws InvalidTokenException {
        super(token);
    }
}
