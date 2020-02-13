package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        int yzCount = 0;
        char[] stringToCharArray = input.toCharArray();
        int strLength = stringToCharArray.length;
        for (int i = 1; i < (strLength - 2); i++) {
           if ((stringToCharArray[i] == 'y' || stringToCharArray[i] == 'z') && stringToCharArray[i + 1] == ' ') {
                yzCount++;}
           }
            if (stringToCharArray[strLength - 1] == 'y' || stringToCharArray[strLength -1] == 'z'); {
                yzCount++;
            }

      return yzCount;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){
        String newString = base.replace(remove, "");



        return newString;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        int isCount = 0;
        int notCount = 0;
        char[] stringWord = input.toCharArray();

        for (int i = 0; i < (stringWord.length - 1); i++) {
            if (stringWord[i] == 'i' && stringWord[i + 1] == 's') {
                isCount++;
            }
        }
        for (int i = 0; i < (stringWord.length - 2); i++) {
            if (stringWord[i] == 'n' && stringWord[i + 1] == 'o' && stringWord[i + 2] == 't') {
                notCount++;
            }
        }


        return isCount == notCount;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        char[] gString = input.toCharArray();
        boolean happy = false;

        for (int i = 1; i < gString.length - 1; i++) {
            if (gString[i] == 'g') {
                if (gString[i - 1] == 'g' || gString[i + 1] == 'g') {
                    happy = true;
                } else {
                    happy = false;
                }
            }
            //for (int i = 1; i < gString.length - 1; i++) {
            //  if (gString[i] == 'g' && ( gString[i - 1] == 'g' || gString[i + 1] == 'g')) {
            //    happy = true;
            //} else {happy = false;}
            //}
        }
            return happy;

    }

    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int tripleCounter = 0;
        char[] tripleString = input.toCharArray();
        for (int i = 0; i < tripleString.length - 2; i++) {
            if (tripleString[i] == tripleString[i + 1] && tripleString[i] == tripleString[i + 2]) {
                tripleCounter++;}
            }


        return tripleCounter;
    }
}
