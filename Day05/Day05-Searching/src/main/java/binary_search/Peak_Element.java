package binary_search;

public class Peak_Element {
    public static void main(String[] args) {
        int array[] = {2, 3, 4, 5, 6,1};
        System.out.println(" The peak Element of the array is " + findPeak(array));
    }

    public static int findPeak(int array[]) {
        int left = 0;
        int right = array.length - 1;
        try {
            while (left <= right) {
                int mid = ((left + right) / 2);
                if (array[mid] > array[mid - 1] && array[mid] > array[mid + 1]) {
                    return array[mid];
                } else if (array[mid] < array[mid - 1]) {
                    right = mid - 1;
                } else if (array[mid] < array[mid + 1]) {
                    left = mid + 1;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        return array[right];
    }
}
