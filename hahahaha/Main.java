import java.util.Stack;

public class ReverseSentence {
    public static String reverseSentence(String sentence) {
        Stack<String> stack = new Stack<>();
        String[] words = sentence.split(" ");

        for (String word : words) {
            stack.push(word); // Push words onto stack
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop()).append(" "); // Pop words in reverse order
        }

        return reversed.toString().trim(); // Remove extra space at the end
    }

    public static void main(String[] args) {
        String sentence = "Hello world this is a test";
        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + reverseSentence(sentence));
    }
}
