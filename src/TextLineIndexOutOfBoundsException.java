package edu.uga.cs1302.txtbuff;

import java.lang.IndexOutOfBoundsException;

/**
 * The following class throws various exceptions applied throughout
 * {@code TextLine}, {@code Editable}, and {@code EditableTextLine}.
 */

public class TextLineIndexOutOfBoundsException() {

    /**
     * calls the default constructor for this class.
     */

    public void TextLineLindexOutOfBoundsException() {
        super.IndexOutOfBoundsException;
    }

    /**
     *  Constructs a TextLineIndexOutOfBoundsException object with a message
     *  presented to the user. The parameters of the if statements are bounded
     *  by the parameter of the method.
     */

    public void TextLineIndexOutOfBoundsException (String errMsg) {
        if (errMsg < 0 || errMsg >= length()) {
            throw new IndexOutOfBoundsException("The following message is out of bounds");
        } else {
            return text[];
        } // if
    } // TextLineIndexOutOfBoundsException

    /**
     *  Constructs a TextLineIndexOutOfBoundsException object with a message
     *  presented to the user. The parameters of the if statements are bounded
     *  by the parameter of the method.
     */

    public void TextLineIndexOutOfBoundsException (int index) {
        if (index < 0 || index >= length()) {
            throw new IndexOutOfBoundsException("TextLine index out of range"
                + index);
        } else {
            return text[index];
        } // if

    } //TextLineIndexOutOfBoundsException

} // TextLineIndexOutOfBoundsException
