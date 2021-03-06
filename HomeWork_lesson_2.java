public class HomeWork_lesson_2 {
    public static void main(String[] args) {
/* 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
 С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        byte[] masBinary = {0, 0, 1, 1, 0, 1, 1, 1, 0, 0};
        for (int i = 0; i < masBinary.length; i++) {
            if (masBinary[i] == 0) {
                masBinary[i] = 1;
            } else if (masBinary[i] == 1) {
                masBinary[i] = 0;
            }
        }


        /* 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;*/
        int[] intArray = new int[8];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 3;
        }


        /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
/* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов)
     заполнить его диагональные элементы единицами; */
        int[][] cube = new int[5][5];
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                if (i == j) {
                    cube[i][j] = 1;
                    System.out.print(cube[i][j]);
                }
                System.out.println();
            }
        }

        /* 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета); */

        int[] oneArray = {5, 2, 7, 8, 1, 12, 65, 23, 76, 3, 45, 67, 82, 15, 6, 98, -5};


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < oneArray.length; i++) {
            if (oneArray[i] < min) {
                min = oneArray[i];
            }
        }

        for (int i = 0; i < oneArray.length; i++) {
            if (oneArray[i] > max) {
                max = oneArray[i];
            }
        }

        int[] check = {2, 2, 2, 1, 2, 2, 10, 1};
//        System.out.println(checkBalance(check));
    }

/* 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
 если в массиве есть место, в котором сумма левой и правой части массива равны.
 Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
  граница показана символами ||, эти символы в массив не входят.*/

    private static boolean checkBalance(int[] array) {
        int leftSum;
        int rightSum;

        for (int i = 0; i < array.length; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += array[j];
            }
            for (int j = i; j < array.length; j++) {
                rightSum += array[j];
            }

            if (leftSum == rightSum){
                return true;}
        }
            return false;
        }
    }


/* 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
 Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
  При каком n в какую сторону сдвиг можете выбирать сами.
     */



