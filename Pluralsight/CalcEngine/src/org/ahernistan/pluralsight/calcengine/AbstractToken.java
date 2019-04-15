package org.ahernistan.pluralsight.calcengine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class AbstractToken<T>{
    T token = null;
    private final String WHITESPACE_REGEX = "\\s";

    AbstractToken(T inputToken) throws InvalidTokenException {
        formatTest(inputToken);
        this.token = inputToken;
    }

    private void formatTest(T inputToken) throws InvalidTokenException {

        if (!((inputToken instanceof String) || (inputToken instanceof Character)))
            throw new InvalidTokenException();

        String test = String.valueOf(inputToken);

        if (test.isBlank() || test.isEmpty())
            throw new InvalidTokenException();
        else {
            Pattern containsWhitespace = Pattern.compile(WHITESPACE_REGEX);
            Matcher matcher = containsWhitespace.matcher(test);
            if (matcher.find())
                throw new InvalidTokenException();
            else {
                boolean isNotANumber = false;
                 try{
                     isNotANumber = Double.isNaN(Double.valueOf(test));
                 } catch (Exception e) {
                     isNotANumber = true;
                 }
                 if (! isNotANumber)
                    throw new InvalidTokenException();
            }
        }
    }

}
