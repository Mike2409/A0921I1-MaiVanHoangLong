package ss14_sort.bai_tap;

public class InsertionSortByStep {
    public void insertionSort(int arr[]) {
        int valueToInsert;
        int holePosition;
        int i;

        for (i = 1; i < arr.length; i++) {

            valueToInsert = arr[i];

            holePosition = i;

            while (holePosition > 0 && arr[holePosition - 1] > valueToInsert) {
                arr[holePosition] = arr[holePosition - 1];
                holePosition--;
                System.out.println("Di chuyen phan tu: " + arr[holePosition]);
            }

            if (holePosition != i) {
                System.out.println(" Chen phan tu: " + valueToInsert
                        + ", tai vi tri: " + holePosition);

                arr[holePosition] = valueToInsert;
            }

            System.out.println("Vong lap thu " + i);
            display(arr);
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");


        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

    public static void main(String[] args) {

        int arr[] = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };

        InsertionSortByStep insertionSortByStep = new InsertionSortByStep();
        System.out.println("Mang du lieu dau vao: ");
        insertionSortByStep.display(arr);
        System.out.println("-----------------------------");
        insertionSortByStep.insertionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        insertionSortByStep.display(arr);
    }
}
