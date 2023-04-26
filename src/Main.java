import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

// Написати метод який приймає массив цілих чисел і вертає суму всіх його парних елементів(не тих які мають парні індекси а ті які самі є парними). [8,2,3,4,5,6,7] -> 20

        int[] myArray = new int[]{8, 2, 3, 4, 5, 6, 7};

        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                sum += myArray[i];
            }
        }
        System.out.println(sum);

        String myString = "Hello World!!!";

        char[] result = myString.toCharArray();

        Character maxOccurSymb = null;

        int maxOccurNumb = 0;

        for (char word : result) {
            Map<Character, Integer> helpMap = new HashMap<>();
            for (Character character : result) {
                if (helpMap.containsKey(character)) {
                    Integer value = helpMap.get(character) + 1;
                    helpMap.put(character, value);
                } else {
                    helpMap.put(character, 1);
                }
            }

            for (Character char123 : helpMap.keySet()) {
                if (helpMap.get(char123) > maxOccurNumb) {
                    maxOccurNumb = helpMap.get(char123);
                    maxOccurSymb = char123;
                }
            }
        }
        System.out.println("maxOccurxSymb: " + maxOccurSymb + ";  maxOccur = " + maxOccurNumb);
    }

    }


