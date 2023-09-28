package com.practice_package;

import java.util.*;

public class ArraysProblem {

    private static Scanner sc = new Scanner(System.in);
    private static int size = 7;

    public static void main(String[] args) {
        int[] arr = new int[]{15,65,19,79,46,23,3};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void display(int[] arr) {
        for (int i=0; i<size; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void compact(int[] arr) {
        //eliminate zeros in a array
        for (int i=0; i<size;i++) {
            if (arr[i]==0) {
                int j=i;
                while (arr[i]==0) {
                    if (j==size-1) break;
                    arr[i]=arr[++j];
                }
                arr[j]=0;
            }
        }
    }

    public static void swap(int[] arr, int p1, int p2) {
        int t = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = t;
    }

    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        int t;

        for (int i=0; i<size; i++) {
            for (int j=i+1; j<size; j++) {
                if (arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

    public static void bubbleSort(char[] arr) {
        int size = arr.length;
        char t;

        for (int i=0; i<size; i++) {
            for (int j=i+1; j<size; j++) {
                if (arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

    public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l) {
            int mid = l + (r - l)/2;
            if (arr[mid] == x) return mid;
            if (arr[mid] > x) return binarySearch(arr, l, mid-1, x);
            return binarySearch(arr, mid+1, r, x);
        }
        return -1;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> l1 = inorderTraversal(p);
        List<Integer> l2 = inorderTraversal(q);
        return l1.equals(l2);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.addAll(inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(inorderTraversal(root.right));
        return list;
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }