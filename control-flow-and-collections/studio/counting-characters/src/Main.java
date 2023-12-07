import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> alphabet = new HashMap<>();
        for(char letter : charactersInString)
        {
            if(alphabet.containsKey(letter))
            {
                int value;
                value = alphabet.get(letter);
                value += 1;

                alphabet.put(letter,value);
            }
            else
            {
                alphabet.put(letter, 1);
            }
        }
        System.out.println(alphabet);
    }



}