public class WordSearch {

    public static void main(String[] args) {
        
        String s = "The quick brown fox";
        String word = "quick";

       
        boolean isPresent = isWordPresent(s, word);

        
        System.out.println("Expected Output: " + isPresent);
    }

  
    public static boolean isWordPresent(String s, String word) {
       
        String[] words = s.split(" ");

        
        for (String w : words) {
            if (w.equals(word)) {
                return true;
            }
        }
        return false;
    }
}
