public class Test {
    public static void bubbleSort(int[] array) {
        for (int bound = 0; bound < array.length; bound++) {
            for (int cur = array.length - 1; cur > bound; cur--) {
                if (array[cur - 1] > array[cur]) {
                    int tmp = array[cur - 1];
                    array[cur - 1] = array[cur];
                    array[cur] = tmp;
                }
            }
        }
    }

    public static void heapSort(int[] array) {
        creatHeap(array);
    }
    private static void creatHeap(int[] arr) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            shiftDown(arr, arr.length, i);
        }
    }
    private static void shiftDown(int[] array, int size, int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while (child < size) {
            if (child + 1 < size && array[child + 1] > array[child]) {
                child = child + 1;
            }
            if (array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
            }else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }


}
