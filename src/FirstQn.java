public class FirstQn {


    public static boolean verifyVowel(String input) {
        // .* before and after is to make sure vowels in the string are all checks
        return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {
        System.out.println("Hello Everyone!");
        System.out.println("First Question: Input String: " + verifyVowel("String"));
        System.out.println("First Question: Input Hello: " + verifyVowel("Hello"));
        System.out.println("First Question: Input blck: " + verifyVowel("blck"));

    }


}
