package edu.uga.cs1302.txtbuff;

interface Editable {

    /**
     * appends the fragment string at the last index of the array textLine
     *
     * @param fragment the new string added to the array.
     */

    public void append (String fragment)
        throws TextLineIndexOutOfBoundsException {

        /**
         * creates a new array that duplicatees the original array to fill
         * the new array with values from the original array.
         */

        if (text.length() - length == 0) {
            String[] container = new String[text.length + DEFAULT_SIZE];
            for (int i = 0; i < length; i++) {
                container[i] = text[i];
            } // for
            // inserts the fragment strng
            text[length] = fragment;
            length++; //increasing array accordingly.

    } //append

    /**
     * Inserts the parameter fragment into the user's specified index on
     * the String array.
     */
    public void insert (int index, String fragment) {
        if (text.length - size == 0) {
            String[] text2 = new String[text.length + 10];

            /**
             * Establishing that the new editted array will be derived
             * from the original uneditted array.
             */
            for (int i = 0; i < length; i++) {
                text2[i] = text[i];
            }  // for

            /**
             * new String with the fragment string inserted.
             */

            text = new String[text2.length];
            for (int i = 0; i < length; i++) {
                text[i] = text2[i];
            }
        } //if
        String container = text[index];
        text[index] = fragment; //setting the new text as String fragment
        length++;

        for (int i = index + 1; i < length; i++) {
            text[i] = container;
            if (i < length) {
                container = text[i + 1];
            } // if
        } // for

    } //insert

} //Editable
