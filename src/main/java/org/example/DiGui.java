package org.example;

/**
 * 递归
 * @author nuanfeng
 * @date 2020/4/21 12:38
 */

public class DiGui {
    //求n!
    public static int mn(int n){
        if(n == 1){
            return 1;
        }
        return n*mn(n-1);
    }
    public static int fb(int n){
        if(n <= 2){
            return 1;
        }
        return fb(n-1)+fb(n-2);
    }


    public static void main(String[] args) {
        int sum = 0;

        System.out.println(mn(1));
        System.out.println(mn(2));
        System.out.println(mn(3));
        System.out.println(fb(2));
        long l = System.currentTimeMillis();
        for(int i=0;i<40;i++)
        {

            sum += fb(i);
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis()-l);
    }
}
