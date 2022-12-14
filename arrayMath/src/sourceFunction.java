    public class sourceFunction {
        public static void main(String[] args) {
            int[] arr = {18, 12, -7, 3, 14, 28};
            int target = 3456;
            System.out.println(linearSearch(arr, target, 1, 4));
            System.out.println(max(arr));
            System.out.println(min(arr));
        }

        static int linearSearch(int[] arr, int target, int start, int end) {
            if (arr.length == 0) {
                return -1;
            }

            // run a for loop
            for (int index = start; index <= end; index++) {
                // check for element at every index if it is = target
                int element = arr[index];
                if (element == target) {
                    return index;
                }
            }
            // this line will execute if none of the return statements above have executed
            // hence the target not found
            return -1;
        }

        static int max(int[] arr) {
            int max = Integer.MIN_VALUE;
            for (int element : arr) {
                if (element > max) {
                    max = element;
                }
            }
            return max;
        }

        static int min(int[] arr) {
            int ans = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < ans) {
                    ans = arr[i];
                }
            }
            return ans;
        }
    }

