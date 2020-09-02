package com.burt;

import java.util.HashMap;

/**
 * 递归的demo
 */
public class Recursive {

    // demo-one : 计算阶乘
    public int factorial(int n) {
        // 最小结果
        if (n == 1) {
            return 1;
        }
        // 计算公式
        return n * factorial(n - 1);
    }

    /**
     * 一只青蛙可以一次跳 1 级台阶或一次跳 2 级台阶,例如:
     * 跳上第 1 级台阶只有一种跳法：直接跳 1 级即可。跳上第 2 级台阶
     * 有两种跳法：每次跳 1 级，跳两次；或者一次跳 2 级。
     * 问要跳上第 n 级台阶有多少种跳法？
     */
    HashMap<Integer, Integer> map = new HashMap();

    public int fib(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public int fibWithMemo(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // 使用备忘录，记录已经算过的值
        if (map.get(n) != null) {
            return map.get(n);
        }
        map.put(n, fibWithMemo(n - 1) + fibWithMemo(n - 2));
        return map.get(n);
    }

    public static void main(String[] args) {
        System.out.println(new Recursive().fibWithMemo(45));
        System.out.println(new Recursive().fib(44));


    }


}
