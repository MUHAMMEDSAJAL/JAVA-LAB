import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        int temp, size;
        int[] arr = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        size = sc.nextInt();
        System.out.println("Enter elements of Array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("2nd Smallest element of the array is:: " + arr[1]);
    }
}