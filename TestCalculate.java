package com.mao.util;

import org.junit.Before;  
import org.junit.Test;  

import static org.junit.Assert.*;  
  
public class TestCalculate {  
    private Calculate cal;  
    //Before标识最开始执行的是setUp，在这里新建一个类
    @Before  
    public void setUp(){  
        cal = new Calculate();  
    }   
    // @Test表示一个单元测试  
    @Test  
    public void testAdd(){   
        assertEquals("正数加法错 1 + 2", 3, cal.add(1,2));  
        assertEquals("正负数加法错 -1 + 2", 1, cal.add(-1,2));  
        assertEquals("负数加法错 -1 + -2", -3, cal.add(-1,-2)); 
        assertEquals("加法进位错 9 + 99", 108, cal.add(9,99));  
    }  
    @Test  
    public void testMinus(){  
    	 assertEquals("正数减法错 2 - 1", 1, cal.minus(2,1));  
         assertEquals("正负数减法错 -1 - 2", -3, cal.minus(-1,2));  
         assertEquals("负数减法错 -1 - -2", 1, cal.minus(-1,-2)); 
         assertEquals("减法借位错 15 - 9", 6, cal.minus(15,9));    
    }  
    @Test  
    public void testMulti(){  
        assertEquals("正常乘法错 5 * 2",10,cal.multi(5, 2));  
        assertEquals("乘零错 1 * 0",0,cal.multi(1, 0));  
    }  
    @Test
    public void testNormalDivide(){   
        assertEquals("正常除法错 250 / 2", 125,cal.divide(250, 2) );  
    } 
    // 表示这个测试类应该抛出ArithmeticException,如果不抛出就报错  
    @Test(expected=ArithmeticException.class)  
    public void testDivide(){  
        int res = cal.divide(12, 0);  
        assertEquals("除法除零错", 250, res);  
    }  
      
    // 计算时间时间单位为ms  
    @Test(timeout=190)  
    public void testTime() throws InterruptedException{  
        Thread.sleep(209);  
        int rel = cal.divide(250, 25);  
    }   
}  
