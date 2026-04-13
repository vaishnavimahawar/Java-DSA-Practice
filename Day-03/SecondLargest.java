public class SecondLargest {

    public static int secondLargest(int[] arr) {
        
        if (arr.length < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};

        int result = secondLargest(arr);

        if (result == -1) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second Largest: " + result);
        }
    }
}
