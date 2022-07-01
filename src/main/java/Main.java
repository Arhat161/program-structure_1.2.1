import java.util.Scanner;

class Main {

    public static int sum(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¬ведите первое число:");
        int value1 = scanner.nextInt(); // input first value

        System.out.println("¬ведите второе число:");
        int value2 = scanner.nextInt(); // input second value

        System.out.println("¬ведите третье число:");
        int value3 = scanner.nextInt(); // input third value

        int result = sum(value1, value2, value3);
        System.out.println("—умма чисел = " + result);

    }
}