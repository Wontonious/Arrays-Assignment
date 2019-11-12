import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Problem 1
        System.out.println("First Problem!");

        int value = 0;
        int[] twenty = new int[20];
        for (int i = 0; i < twenty.length; i++) {
            int randomNumberOne = (int)(Math.random()*6)+1;
            twenty[i] = randomNumberOne;
            if(twenty[i]==1){
                value++;
            }
        }
        System.out.println(Arrays.toString(twenty));
        System.out.println("The amount of times '1' was assigned was:");
        System.out.println(value);

        //Problem 2
        System.out.println("Second Problem!");
        int total = 0;
        int[] arrTwo = new int[10];
        for(int a = 0; a<arrTwo.length;a++){
            int randomNumberTwo = (int)(Math.random()*100)+1;
            arrTwo[a] = randomNumberTwo;
            total += randomNumberTwo;
        }
        System.out.println(Arrays.toString(arrTwo));
        System.out.println("The average of the values is:");
        System.out.println(total/10);

        //Problem 3 - swap 2 index
        System.out.println("Problem 3!");
        int swap = 0;
        swap += arrTwo[0];
        arrTwo[0] = arrTwo[9];
        arrTwo[9] = swap;
        System.out.println(Arrays.toString(arrTwo));

        //Problem 4 - reverse the whole array order
        System.out.println("Problem 4!");
        int zero, first, second, third, fourth, fifth, sixth, seventh, eighth, ninth;

        zero = arrTwo[0];
        first = arrTwo[1];
        second = arrTwo[2];
        third = arrTwo[3];
        fourth = arrTwo[4];
        fifth = arrTwo[5];
        sixth = arrTwo[6];
        seventh = arrTwo[7];
        eighth = arrTwo[8];
        ninth = arrTwo[9];


        arrTwo[9] =zero;
        arrTwo[8] =first;
        arrTwo[7] =second;
        arrTwo[6] =third;
        arrTwo[5] =fourth;
        arrTwo[4] =fifth;
        arrTwo[3] =sixth;
        arrTwo[2] =seventh;
        arrTwo[1] = eighth;
        arrTwo[0] = ninth;
        System.out.println(Arrays.toString(arrTwo));
    }
}
