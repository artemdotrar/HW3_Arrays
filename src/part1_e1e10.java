import java.util.Scanner;

public class part1_e1e10 {
    public static void main(String[] args){
//1)Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//затем в столбик (отделяя один элемент от другого началом новой строки). Перед  созданием массива подумайте, какого он будет размера.
        System.out.println("Exercise 1");
        int countEven = 0;
        int[] array1 = new int[10];
        for(int i = 2; i<= 20; i++){
            if (i%2 == 0){
                array1[countEven] = i;
                countEven++;
            }
        }
        for(int a : array1){
            System.out.print(a + " ");
        }
        System.out.println();
        for(int a : array1){
            System.out.println( a);
        }

//2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
//строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
//порядке (99 97 95 93 … 7 5 3 1).
        System.out.println("\nExercise 2");
        int countOdd = 0;
        int[] array2 = new int[50];
        for(int i = 1; i<= 99; i++){
            if (i%2 != 0){
                array2[countOdd] = i;
                countOdd++;
            }
        }
        for(int a : array2){
            System.out.print(a + "\t");
        }
        System.out.println();
        for(int i = array2.length - 1; i >=0; i--){
            System.out.print(array2[i] + "\t");
        }

//3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
//массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
        System.out.println("\n\nExercise 3");
        int[] array3 = new int[15];
        int countEven2 = 0;

        for(int i = 0; i < array3.length; i++){
            array3[i] = (int) (Math.random() * 100);
        }

        for(int a : array3){
            System.out.print(a + " ");
            if(a % 2 == 0){
                countEven2++;
            }
        }
        System.out.println("\nNumber of Evens: " + countEven2);

//4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите
//массив на экран в строку. Замените каждый элемент с нечётным индексом на
//ноль. Снова выведете массив на экран на отдельной строке.
        System.out.println("\n\nExercise 4");
        int[] array4 = new int[20];


        for(int i = 0; i < array4.length; i++){
            array4[i] = (int) (Math.random() * 21);
            System.out.print(array4[i] + "\t");
        }
        System.out.println();
        for(int i = 0; i < array4.length; i++){
           if(i % 2 != 0){
               array4[i] = 0;
            }
            System.out.print(array4[i] + "\t");
        }

//5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
//выведите массивы на экран в двух отдельных строках. Посчитайте среднее
//арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
        System.out.println("\n\nExercise 5");
        int[] array51 = new int[5];
        int[] array52 = new int[array51.length];
        int sum1 = 0, sum2 = 0;
        double average1 = 0, average2 = 0;

        for(int i = 0; i< array51.length; i++){
            array51[i] = (int)(Math.random() * 16);
            sum1 += array51[i];
            array52[i] = (int)(Math.random() * 16);
            sum2 += array52[i];
        }

        average1 = (double) sum1 / array51.length;
        average2 = (double) sum2 / array52.length;

        for(int a : array51){
            System.out.print(a + "\t");
        }
        System.out.println();
        for(int a : array52){
            System.out.print(a + "\t");
        }
        System.out.println();
        if(average1 > average2){
            System.out.println(average1 + " > " + average2);
        }
        else if(average1 < average2){
            System.out.println(average1 + " < " + average2);
        }
        else {
            System.out.println(average1 + " = " + average2);
        }

//6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
//на экран в строку. Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
        System.out.println("\nExercise 6");
        int[] array6 = new int[3];
        boolean isUpper = true;
        for(int i = 0; i<array6.length; i++){
            array6[i] = (int)(Math.random() * 11);
            System.out.print(array6[i] + "\t");
            if(i>0) {
                if (array6[i] < array6[i - 1]) {
                    isUpper = false;
                }
            }
        }
        if(isUpper){
            System.out.println("\nArray is upper");
        }
        else {
            System.out.println("\nArray is not upper");
        }
//7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//какой элемент является в этом массиве максимальным и сообщите индекс его
//последнего вхождения в массив.

        System.out.println("\nExercise 7");
        int[] array7 = new int[12];
        int indexMax = 0;
        for(int i = 0; i < array7.length; i++){
            array7[i] = (int)(Math.random() * 16);
            System.out.print(array7[i] + "\t");
            if(array7[i] >= array7[indexMax]){
                indexMax = i;
            }
        }
        System.out.println("\nMax number: " + array7[indexMax] + ", index: " + indexMax);

//8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
//массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
//массива должен равняться отношению элемента из первого массива с i-ым
//индексом к элементу из второго массива с i-ым индексом. Вывести все три
//массива на экран (каждый на отдельной строке), затем вывести количество
//целых элементов в третьем массиве.
        System.out.println("\nExercise 8");
        int[] array81 = new int[10];
        int[] array82 = new int[array81.length];
        double[] array83 = new double[array81.length];

        for(int i = 0; i < array81.length; i++){
            array81[i] = (int) (1 + Math.random() * 11); //+1 к интервалу, чтоб не попадались 0 (не было деления на 0)
            array82[i] = (int) (1 + Math.random() * 11);
            array83[i] = (double) array81[i] / array82[i];
        }
        for(int a : array81){
            System.out.print(a + "\t\t");
        }
        System.out.println();
        for(int a : array82){
            System.out.print(a + "\t\t");
        }
        System.out.println();
        int countInt = 0;
        for(double a : array83){
            System.out.printf("%.2f \t", a);
            if(a - (int) a == 0){
                countInt++;
            }
        }
        System.out.println("\nNumber of Integer in Array 3: " + countInt);

//9)Пользователь должен указать с клавиатуры положительное чётное число, а программа должна создать массив указанного размера из случайных целых
//чисел из [0;15] и вывести его на экран в строку. После этого программа должна
//определить и сообщить пользователю о том, сумма какой половины массива
//больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число, то выдать соответствующее
//сообщение
        System.out.println("\nExercise 9");
        int n = 0;
        int sum91 = 0, sum92 = 0;
        Scanner in = new Scanner(System.in);
        boolean input = true;

        while (input){
            System.out.print("Size of array: ");
            n = in.nextInt();
            if(n > 0 && n % 2 == 0){
                input = false;
            }
            else {
                System.out.println("Wrong number. It must be positive and even.");
            }
        }
        int[] array9 = new int[n];
        for(int i = 0; i < n; i++){
            array9[i] = (int)(Math.random() * 15);
            System.out.print(array9[i] + "\t");
            if(i < n/2){
                sum91 += array9[i];
            }
            else {
                sum92 += array9[i];
            }
        }

        if(sum91>sum92){
            System.out.println("\nSum 1 (" + sum91 + ") > Sum 2 (" + sum92 + ")");
        }
        else if(sum91<sum92){
            System.out.println("\nSum 1 (" + sum91 + ") < Sum 2 (" + sum92 + ")");
        }
        else {
            System.out.println("\nSum 1 (" + sum91 + ") = Sum 2 (" + sum92 + ")");
        }
//10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
//переменную n. Если пользователь ввёл не подходящее число, то программа
//должна выдать соответствующее сообщение. Создать массив из n случайных
//целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
//только из чётных элементов первого массива, если они там есть, и вывести его
//на экран.
        System.out.println("\nExercise 10");
        input = true;
        n = 0;
        int countEven10 = 0;
        while (input){
            System.out.print("Size of array: ");
            n = in.nextInt();
            if(n > 3){
                input = false;
            }
            else {
                System.out.println("Wrong number. It must be >3.");
            }
        }

        int[] array10 = new int[n];
        for(int i = 0; i < n; i++){
            array10[i] = (int)(Math.random() * (n + 1));
            System.out.print(array10[i] + "\t");
            if(array10[i] % 2 == 0){
                countEven10++;
            }
        }

        if(countEven > 0) {
            int j = 0;
            int[] arrayEven10 = new int[countEven10];
            for(int i = 0; i < n; i++){
                if(array10[i] % 2 == 0){
                    arrayEven10[j] = array10[i];
                    j++;
                }
            }

            System.out.println("\nArray of even numbers:");
            for(int a : arrayEven10){
                System.out.print(a + "\t");
            }
        }
        else {
            System.out.println("Not enought even numbers");
        }

    }
}
