package Lesson_5_Arrays_Loops.Task.task_5_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_5_1 {
    //    Створіть масив із десяти цілих чисел. Дисплей
//    найбільша з цих цифр;
//    сума додатних чисел у масиві;
//    кількість від’ємних чисел у масиві.
//    Які цінності є більше: негативні чи позитивні?

    /*
    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5, 6, -7, 8, 9, 10};
        int number = array[0];
        int amount = 0;
        int poselement = 0;
        int negativenumbers = 0;
        int negelemnt = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]>number){
                number = array[i];
            }
            if(array[i] > 0){
                amount +=array[i];
                poselement++;
            }
            if(array[i] < 0) {
                negativenumbers += array[i];
                negelemnt++;
            }

        }
        if (poselement > negativenumbers){
            System.out.println("poselement");
        }
        else {
            System.out.println("negelemnt");
        }
        System.out.println(number);
        System.out.println(amount);
        System.out.println(negativenumbers);
        System.out.println();
    }
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        int valuefirst = 0;
        int valuesecond = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter the index value [ " + i + " ]");
            array[i] = Integer.parseInt(br.readLine());
            System.out.println("now the value of the index [" + i + "]" + " is " + array[i]);
        }
        System.out.println("an array of entered values" + array);
        for (int i = 0; i < array.length; i++) {
            valuefirst = array[i];
            valuesecond = array[i + 1];
            System.out.println(" largest value " + largestValue(valuefirst, valuesecond) +
                    " amount of positive numbers " + amountPositiveValue(valuefirst) +
                    " sum of negative numbers " + amountNegativeValue(valuefirst));
//                    " differece between positive and nagative values " + differeceValue());
        }
    }

    /**
     * the function returns the largest value
     *
     * @param valuefirst
     * @param valuesecond
     * @return
     */
    public static int largestValue(int valuefirst, int valuesecond) {
        int larvalue = 0;
        if (valuefirst > valuesecond) {
            larvalue = valuefirst;
        }
        return larvalue;
    }

    /**
     * is the amount of positive numbers
     *
     * @param valuefirst
     * @return
     */
    public static int amountPositiveValue(int valuefirst) {
        int amposval = 0;
        int counter = 0;
        if (valuefirst > 0) {
            amposval += valuefirst;
            counter++;
        }
        return amposval;
    }

    /**
     * the sum of negative numbers
     *
     * @param valuefirst
     * @return
     */
    public static int amountNegativeValue(int valuefirst) {
        int amnegval = 0;
        int counter = 0;
        if (valuefirst < 0) {
            amnegval += valuefirst;
            counter++;
        }
        return amnegval;
    }
//    /**
//     * indicates the difference between positive and negative values
//     */
//    public static String differeceValue() {
//        if (amountPositiveValue(int v) > amountNegativeValue()) {
//            return "poselement";
//        }
//        else{
//            return "negelemnt";
//        }
}




