package pl.sdacademy.thinkingisfun;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringsAreFun {
    public boolean isPalindrome(String toBeTested) {
        for (int i = (toBeTested.length() - 1) / 2; i >= 0; i--) {
            if (toBeTested.charAt((i - toBeTested.length() + 1) * -1) != toBeTested.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public Integer countOccurences(String toBeTested, String toBeFound) {
        int count = 0;
        Pattern whatToFind = Pattern.compile(toBeFound + "*");
        Matcher matcher = whatToFind.matcher(toBeTested);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public String rot13(String toBeCoded) {
        char[] toBeCodedAsArray = toBeCoded.toCharArray();
        for (int i = 0; i < toBeCodedAsArray.length; i++) {
            if (toBeCodedAsArray[i] > 96 && toBeCodedAsArray[i] < 110) {
                toBeCodedAsArray[i] = (char) (toBeCodedAsArray[i] + 13);
            } else if (toBeCodedAsArray[i] > 109 && toBeCodedAsArray[i] < 123) {
                toBeCodedAsArray[i] = (char) (toBeCodedAsArray[i] - 13);
            } else if (toBeCodedAsArray[i] > 64 && toBeCodedAsArray[i] < 78) {
                toBeCodedAsArray[i] = (char) (toBeCodedAsArray[i] + 13);
            } else if (toBeCodedAsArray[i] > 77 && toBeCodedAsArray[i] < 91) {
                toBeCodedAsArray[i] = (char) (toBeCodedAsArray[i] - 13);
            }
        }
        return new String(toBeCodedAsArray);
    }
}
