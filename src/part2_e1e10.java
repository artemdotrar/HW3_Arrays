public class part2_e1e10 {
    public static void main(String[] args){
        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 16);
            System.out.print(arr[i] + "\t");
        }
//1) Найти произведение элементов, кратных 3.
        int mult3 = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] % 3 == 0){
                if (mult3 == -1){
                    mult3 = arr[i];
                }
                else {
                    mult3 *= arr[i];
                }
            }
        }
        if(mult3 != -1){
            System.out.println("\nПроизведение элементов, кратных 3: " + mult3);
        }
        else {
            System.out.println("\nНет элементов кратных 3");
        }

//2) Найти среднее арифметическое элементов с нечетными номерами.
        int sumOdd = 0;
        int countOdd = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 !=0){
                sumOdd += arr[i];
                countOdd++;
            }
        }
        System.out.println("Среднее арифметическое элементов с нечетными номерами: " + (double) sumOdd / countOdd);

//3) Найти средне арифметическое элементов массива, превосходящих некоторое
//число С.
        int c = 7;
        int sumC = 0;
        int countC = 0;
        for(int a : arr){
            if(a > c){
                sumC += a;
                countC ++;
            }
        }
        System.out.println("Cредне арифметическое элементов массива, превосходящих число " + c + ": " + (double) sumC / countC);

//4) Найти наименьший нечетный элемент.
        int minOdd = 1000;
        for(int a : arr){
            if(a % 2 != 0 && a < minOdd){
                minOdd = a;
            }
        }
        System.out.println("Наименьший нечетный элемент: " + minOdd);

//5) «Сожмите» массив, выбросив из него каждый второй элемент.
//«Освободившиеся» места массива заполните нулями.
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < n; i++){
            if(i % 2 != 0){
                arr2[i] = 0;
            }
            else {
                arr2[i] = arr[i];
            }
        }
        System.out.println("«Сожмите» массив, выбросив из него каждый второй элемент. «Освободившиеся» места массива заполните нулями:");
        for(int a : arr2){
            System.out.print(a + "\t");
        }
//6) Проверить, различны ли все элементы массива.
        boolean isUniq = true;
        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i - 1]){
                isUniq = false;
            }
        }
        if(isUniq){
            System.out.println("Все элементы массива различны");
        }
        else {
            System.out.println("Не все элементы массива различны");
        }

//7) Подсчитать, сколько раз встречается элемент с заданным значением.
        int element = 7;
        int countRepit = 0;
        for(int a : arr){
            if(a==7){
                countRepit++;
            }
        }
        System.out.println("Элемент " + element + " встречается " + countRepit + " раз.");

//8) Найти второй по величине (т.е. следующий по величине за максимальным)
//элемент в массиве.
        int max = 0, maxSecond = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                maxSecond = max;
                max = arr[i];
            }
            else if(arr[i] > maxSecond && arr[i] != max){
                maxSecond = arr[i];
            }
        }
        System.out.println("Второй по величине элемент массива: " + maxSecond + " (Первый: " + max + ")");

//9) Найти наименьший элемент среди элементов с четными индексами массива
        int minEvenIndx = arr[0];
        for (int i = 0; i < n; i++){
            if(i%2 ==0 && arr[i] < minEvenIndx){
                minEvenIndx = arr[i];
            }
        }
        System.out.println("Наименьший элемент среди элементов с четными индексами массива: " + minEvenIndx);

//10) Найти максимальный элемент в массиве и поменять его местами с нулевым
//элементом
        int max2 = arr[0];
        int indexMax = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > max2) {
                max2 = arr[i];
                indexMax = i;
            }
        }
        arr[indexMax] = arr[0];
        arr[0] = max2;

        System.out.println(" Найти максимальный элемент в массиве " + "(" + max2 + " индекс: "+ indexMax + ")" + "и поменять его местами с нулевым элементом: ");
        for(int a : arr){
            System.out.print(a + "\t");
        }
    }
}
