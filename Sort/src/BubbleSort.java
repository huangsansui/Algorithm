
/**
 * Function:
 * 冒泡排序
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * 时间复杂度O(n^2)
 * 稳定的排序
 *
 * @author Huangqing
 * @date 2019/1/3 10:43
 * @since JKD 1.8
 */
public class BubbleSort {

    public void sort(int[] numbers) {
        // 从右向左，遍历一次之后最大值在最右
        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                // 右边元素 > 左边元素则交换
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
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
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = new int[]{4, 1, 8, 6, 2};
        bubbleSort.sort(numbers);
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
