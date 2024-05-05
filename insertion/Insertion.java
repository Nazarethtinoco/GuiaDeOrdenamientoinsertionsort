public class Insertion {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 8, 15, 6 };
        System.out.println("Arreglo original:");
        printArray(arr);
        sort(arr);
        System.out.println("Arreglo ordenado:");
        printArray(arr);
    }

    // Método para ordenar el arreglo utilizando Insertion Sort
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Mover los elementos mayores que key a una posición adelante de su posición actual
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            printArrayWithExplanation(arr, i); // Mostrar el estado del arreglo en cada iteración
        }
    }

    // Método para imprimir el arreglo
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Método para imprimir el arreglo con una explicación adicional
    public static void printArrayWithExplanation(int[] arr, int currentIndex) {
        System.out.print("Iteración " + currentIndex + ": ");
        for (int i = 0; i < arr.length; ++i) {
            if (i == currentIndex) {
                System.out.print("[" + arr[i] + "] "); // Resaltar el elemento actual
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}

