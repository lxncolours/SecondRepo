package Day_07;

/*
8.按要求在main方法中完成以下功能：
        a.定义一个长度为5的int型数组arr，数组元素为1-99（范围包含1和99）之间的随机数
        b.提示用户输入2-5之间的一个数字num（num范围包括2和5,不需要代码判断）
        c.遍历数组arr,筛选出数组中元素是num倍数的数组元素并输出
        示例如下：
        随机生成的数组元素为:
        52 20 58 9 10
        请输入2-5之间的一个数字:
        5
        符合条件的元素为:
        20 10
*/

import java.util.Random;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("随机生成的数组元素为:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(99) + 1;
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("请输入2-5之间的一个数字");
        int num = sc.nextInt();
        System.out.println("符合条件的元素为:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % num == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
