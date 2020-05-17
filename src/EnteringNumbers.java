import java.util.Scanner;

public class EnteringNumbers {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wpisz dowolną liczbę dodatnią i wciśnij enter:");
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; i++) {
            int number = sc.nextInt();
            if (number > 0) {
                numbers[i] = number;
            } else {
                if (number < 0) {
                    System.out.println("Liczba ta NIE powinna być dodana do listry");
                }
                for (int j = numbers.length - 1; j >= 0; j--) {
                    System.out.println("odwrotna kolejność wpisanych cyfr:"+numbers[j]);
                }
            }
            int sum = 0;
            for (int k = 0; 3 >= k; k++) {
                if ( sum += numbers[k]) {
                    System.out.println("a+b+c=" + sum);
                }
            }
            int max = 0 ;
            for(int l = 0 ; l < numbers.length ; l++){
                if(numbers[l] > max){
                    max = numbers[l];
                }
            }
            int min = 0 ;
            for(int l = 0 ; l < numbers.length ; l++){
                if(numbers[l] < min){
                    min = numbers[l];
                }
            }
        }
    }
}




