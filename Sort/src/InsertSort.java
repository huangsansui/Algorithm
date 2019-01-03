/**
 * Function:
 *
 * 插入排序
 * 从第一个元素开始，该元素可以认为已经被排序
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 * 将新元素插入到该位置中
 * @author Huangqing
 * @date 2019/1/3 11:02
 * @since JKD 1.8
 */
public class InsertSort {

    public void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            // 前面的数组都是已排序的
            for (int j = i; j > 0 && numbers[j] < numbers[j - 1]; j--) {
                swap(numbers, j, j - 1);
            }
        }
    }

    private void swap(int[] numbers, int a, int b) {
        // 不需要中间变量交换元素
        numbers[a] = numbers[a] + numbers[b];
        numbers[b] = numbers[a] - numbers[b];
        numbers[a] = numbers[a] - numbers[b];
    }

    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        int[] numbers = new int[]{4, 1, 8, 6, 2};
        insertSort.sort(numbers);
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
