/**
 * Function:
 *
 *  快速排序
 *  通过一趟排序将待排序记录分割成独立的两部分，
 *  其中一部分记录的关键字均比另一部分关键字小，则分别对这两部分继续进行排序，直到整个序列有序。
 *  时间复杂度O(log N)
 *
 * @author Huangqing
 * @date 2019/1/3 11:30
 * @since JKD 1.8
 */
public class QuickSort {

    /**
     *
     * @param numbers 数组
     * @param low     左边指针
     * @param high    右边指针
     */
    public void sort(int[] numbers, int low, int high) {
        if (low < high) {
            int middle = getMiddle(numbers, low, high);
            sort(numbers, low, middle - 1);
            sort(numbers, middle + 1, high);
        }
    }

    /**
     * 获得中轴位置
     * @param numbers
     * @param low
     * @param high
     * @return
     */
    private int getMiddle(int[] numbers, int low, int high) {
        // 把第一个当做基准值
        int temp = numbers[low];
        while (low < high) {
            // 从右往左，右边元素大于基准值，右指针往左走一位
            while (low < high && numbers[high] > temp) {
                high--;
            }
            // 如果右边元素小于基准值，把右边元素赋值给左边元素
            if (low < high) {
                numbers[low] = numbers[high];
            }
            // 从左往右，左边元素小于基准值，左指针往右走一位
            while (low < high && numbers[low] < temp) {
                low++;
            }
            // 如果左边元素小于基准值，把左边元素赋值给右边元素
            if (low < high) {
                numbers[high] = numbers[low];
            }
        }
        // 当走到中间轴时，将基准值赋给中轴值
        numbers[low] = temp;
        return low;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] numbers = new int[]{4, 1, 8, 6, 2};
        quickSort.sort(numbers, 0, numbers.length - 1);
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
