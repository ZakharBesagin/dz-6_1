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

    }


}

