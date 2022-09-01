package edu.uga.cs1302.txtbuff;

/**
 * The following class represents various methods of an String array
 * that can be manipulated into different variations of the textline
 * according to the index of the array and the size of the array.
 *
 */

public class TextLine() {
    public static final int DEFAULT_SIZE = 80;

    private int length;
    private int capacity;
    private String[] text;

    /**
     * Empty constructor containing the initial value of the character array.
     */

    public TextLine() {
        length = 0;
        text = new String[DEFAULT_SIZE];
    } // TextLine

    /**
     *  Following constructor constructs a TextLine object initialized to contain the same
     * characters as in the argument line.
     */

    public TextLine (String line) {
        text = new String[line.length()];
        for (int i = 0; i < line.length(); i++) {
            text[i] = line.get(i);
        } // for
    }


    /**
     * returns the length of the array
     */

    public int length() {
        return length;
    } // length

    /**
     * returns the capacity of the TextLine.
     */

    public int capacity() {
        return capacity;
    }


    /**
     * Returns the index position of the first occurrence of the fragment substring.
     */

    public int indexOf (String fragment) {
        int location = -1;
        for (int i = 0; i < length; i++) {
            if (fragment.equals(text[i])) {
                location = i;
                i = length;
            } //if
        } // for
        return location;
    } //indexOf


    /**
     * returns the index position of the first occurence of the fragment substring in
     * string array. This method returns the index at the fromIndex or the default position
     * is set to index of -1.
     *
     * @param fragment string of the desired index.
     * @param fromIndex designated starting index.
     */

    public indexOf (String fragment, int fromIndex) throws TextLineIndexOutOfBoundsException {
        int location = -1;
        for (int i = 0; i < length; i++) {
            if (fragement.equals(text[fromIndex])) {
                location = fromIndex;
                i = length;
            } else {
                return location;
            } // if
        } // for
    } // indexOf

    /**
     * This method only returns true if the textline has the
     * same number of characters at the method parameter.
     */

    public boolean equals (Object obj) {
        boolean isEquals = false;
        if (text == obj) {
            return text;
        } else {
            return false;
        } // if
        return text;
    } // equals


    /**
     * The following method returns the contents of the TextLine as a type String.
     */

    public String toString() {
        return Arrays.toString(text);
    } // toString




} // TextLine
