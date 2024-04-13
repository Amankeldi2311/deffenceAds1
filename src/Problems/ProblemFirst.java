package Problems;
public class ProblemFirst {
    /**
     * @param word - word to check if it is polyndrom
     * I did everything right, there were minor errors because of this, the code did not work
     *
     *
     */
    public static void findPolyndromWord(String word) {
        if (word.length() == 0 || word.length() == 1) {
            System.out.println("Polyndrom");
        } else if (word.charAt(0) == word.charAt(word.length() - 1)) {
            findPolyndromWord(word.substring(1, word.length() - 1));
        } else {
            System.out.println("Not Polyndrom");
        }
    }
}
