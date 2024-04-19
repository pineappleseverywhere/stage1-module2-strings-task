package com.epam.mjc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StringSplitter {

    /**
     * Splits given string applying all delimiters to it. Keeps order of result substrings as in source string.
     *
     * @param source source string
     * @param delimiters collection of delimiter strings
     * @return List of substrings
     */
    public List<String> splitByDelimiters(String source, Collection<String> delimiters) {
        List<String> substrings = new ArrayList<>();
        int startIndex = 0;
        for (int i = 0; i < source.length(); i++) {
            if (delimiters.contains(String.valueOf(source.charAt(i)))) {
                // Add substring before delimiter if it's not empty
                if (startIndex < i) {
                    substrings.add(source.substring(startIndex, i));
                }
                startIndex = i + 1; // Update start index to skip the delimiter
            }
        }
        // Add the last substring if it exists
        if (startIndex < source.length()) {
            substrings.add(source.substring(startIndex));
        }
        return substrings;
    }
}
