package com.practice_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode {
    public static void main(String[] args) {
        System.out.println(checkSortedRotated1752(new int[]{3,4,5,1,2}));
        System.out.println(checkSortedRotated1752(new int[]{2,1,3,4}));
        System.out.println(checkSortedRotated1752(new int[]{1,2,3}));
    }

    public static boolean checkSortedRotated1752(int[] nums) {
        int n = nums.length,a=n;
        int[] arr = Arrays.copyOf(nums,n);;
        Arrays.sort(arr);
        while (a-- != 0) {
            int t = nums[n - 1];
            for (int i = n - 1; i > 0; nums[i] = nums[i - 1], i--);
            nums[0] = t;
            if (Arrays.equals(arr,nums)) return true;
        }
        return false;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeKListsHelper(lists, 0, lists.length - 1);
    }

    private ListNode mergeKListsHelper(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        if (start + 1 == end) {
            return merge(lists[start], lists[end]);
        }
        int mid = start + (end - start) / 2;
        ListNode left = mergeKListsHelper(lists, start, mid);
        ListNode right = mergeKListsHelper(lists, mid + 1, end);
        return merge(left, right);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        curr.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }

    public static int ribbonCutting(int n, int a, int b, int c) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MIN_VALUE;
            if (i - a >= 0) {
                dp[i] = Math.max(dp[i], dp[i - a] + 1);
            }
            if (i - b >= 0) {
                dp[i] = Math.max(dp[i], dp[i - b] + 1);
            }
            if (i - c >= 0) {
                dp[i] = Math.max(dp[i], dp[i - c] + 1);
            }
//            System.out.println(dp[i]);
        }
        System.out.println("Number of ribbon pieces after cutting: " + dp[n]);
        return dp[n];
    }

    public static int trap(int[] height) {
        int l = 0, r = height.length-1, lmax = 0, rmax = 0, water = 0;
        while (l<r) {
            lmax = max(lmax,height[l]);
            rmax = max(rmax,height[r]);
            if(lmax<rmax) water+=lmax-height[l++];
            else water+=rmax-height[r--];
        }
        return water;
    }

    public static int max(int a, int b) {
        return (a>b)?a:b;
    }

    public static int min(int a, int b) {
        return (a<b)?a:b;
    }

    public static String longestPalindrome(String s) {
        int max=0;
        String pal="";
        if(s.isEmpty()) return "";
        if(s.length()==1 || isPalindrome(s)) return s;
        int n = s.length();
        for (int i = 0; i < n-1; i++) {
            for (int j = n; j > i; j--) {
                String str = s.substring(i,j);
                if (str.chars().distinct().count()==1 || isPalindrome(str) && (j-i)>max) {
                    pal=str;
                    max=str.length();
                }
            }
        }
        return pal;
    }

    public static boolean isPalindrome(String s) {
        if (s.chars().distinct().count()==1) return true;
        char[] chars = s.toCharArray();
        int n = chars.length;
        for (int i=0; i<n/2; i++)
            if (chars[i]!=chars[n-i-1]) return false;
        return true;
    }

    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        for(String s: strs) {
            if(s.length()<str.length()) str=s;
        }
        String res = "";
        for(int i=0; i<str.length(); i++) {
            for(int j=0; j<strs.length; j++) {
                if(str.charAt(i) == strs[j].charAt(i)) res += str.charAt(i)+"";
                else return res;
            }
        }
        return "";
    }

    private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    static private class GenerateParanthesis {
        public static List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList<>();
            backtrack(result, "", 0, 0, n);
            return result;
        }

        private static void backtrack(List<String> result, String current, int open, int close, int max) {
            if (current.length() == max * 2) {
                result.add(current);
                return;
            }

            if (open < max) {
                backtrack(result, current + "(", open + 1, close, max);
            }
            if (close < open) {
                backtrack(result, current + ")", open, close + 1, max);
            }
        }

        public static void main(String[] args) {
            int n = 3;
            List<String> combinations = generateParenthesis(n);
            System.out.println(combinations);
        }
    }
}
