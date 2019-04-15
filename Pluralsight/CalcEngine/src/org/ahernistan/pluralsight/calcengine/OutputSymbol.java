package org.ahernistan.pluralsight.calcengine;

public class OutputSymbol<T> extends AbstractToken<T>  {

    OutputSymbol(T symbol) throws InvalidTokenException {
        super(symbol);
    }

}
