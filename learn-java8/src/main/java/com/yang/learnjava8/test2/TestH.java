package com.yang.learnjava8.test2;

public class TestH {

    public static void main(String[] args) {
        insertSort(new int[]{1,5,7,3,5,2,5,0,9,5});
        int[] arr = {1,2,3,4,5,6,7,8,9};
    }

    /**
     * 插入排序
     * @param arr
     */
    public static void insertSort(int[] arr) {
        
        for (int i = 1; i < arr.length; i++) {
            //插入排序
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.println(arr[a]);
        }
    }

    public static void twoSerch(int left, int right, int[] arr, int num) {
        int mid = (right + left) / 2;
        if (arr[mid] == num) {
            System.out.println("index = = " + mid);
        } else if (arr[mid] > num) {
            twoSerch(left, mid, arr, num);
        } else {
            twoSerch(mid, right, arr, num);
        }

    }

    private static void swap(int[] arr, int j, int i) {
        int ttemp = arr[i];
        arr[i] = arr[j];
        arr[j] = ttemp;
    }
}
