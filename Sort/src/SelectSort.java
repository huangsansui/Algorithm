/**
 * Function:
 * 选择排序
 * 在未排序序列中找到最小元素，存放到排序序列的起始位置
 * 再从剩余未排序元素中继续寻找最小元素，然后放到排序序列末尾。
 * 以此类推，直到所有元素均排序完毕。
 * 时间复杂度O(n^2)
 *
 * @author Huangqing
 * @date 2019/1/3 10:56
 * @since JKD 1.8
 */
public class SelectSort {

    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    swap(numbers, i, j);
                }
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
        SelectSort selectSort = new SelectSort();
        int[] numbers = new int[]{4, 1, 8, 6, 2};
        selectSort.sort(numbers);
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
