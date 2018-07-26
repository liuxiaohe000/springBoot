package com.lxh;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by HASEE on 2018/7/25.
 */
public class Test {

    public static void main(String[] args){
        AtomicLong atomicLong = new AtomicLong();
        long id = atomicLong.incrementAndGet();
        long id2 = atomicLong.incrementAndGet();
        System.out.print(id+","+id2);
    }
}
