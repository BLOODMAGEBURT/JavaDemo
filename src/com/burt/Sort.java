package com.burt;

import java.util.Arrays;

/**
 * Sort
 *
 * @author xujianbo
 * @date 2021/3/10 1:30 下午
 * @since 1.0.0
 */
public class Sort {

    public void sort(int[] arr) {

        int tem;
        int length = arr.length;

        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
//                    swap(arr, arr[j], arr[j + 1]);
                    tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;

                }
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 14, 24, 5, 17, 2};
        new Sort().sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
