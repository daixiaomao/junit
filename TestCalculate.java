package com.mao.util;

import org.junit.Before;  
import org.junit.Test;  

import static org.junit.Assert.*;  
  
public class TestCalculate {  
    private Calculate cal;  
    //Before��ʶ�ʼִ�е���setUp���������½�һ����
    @Before  
    public void setUp(){  
        cal = new Calculate();  
    }   
    // @Test��ʾһ����Ԫ����  
    @Test  
    public void testAdd(){   
        assertEquals("�����ӷ��� 1 + 2", 3, cal.add(1,2));  
        assertEquals("�������ӷ��� -1 + 2", 1, cal.add(-1,2));  
        assertEquals("�����ӷ��� -1 + -2", -3, cal.add(-1,-2)); 
        assertEquals("�ӷ���λ�� 9 + 99", 108, cal.add(9,99));  
    }  
    @Test  
    public void testMinus(){  
    	 assertEquals("���������� 2 - 1", 1, cal.minus(2,1));  
         assertEquals("������������ -1 - 2", -3, cal.minus(-1,2));  
         assertEquals("���������� -1 - -2", 1, cal.minus(-1,-2)); 
         assertEquals("������λ�� 15 - 9", 6, cal.minus(15,9));    
    }  
    @Test  
    public void testMulti(){  
        assertEquals("�����˷��� 5 * 2",10,cal.multi(5, 2));  
        assertEquals("����� 1 * 0",0,cal.multi(1, 0));  
    }  
    @Test
    public void testNormalDivide(){   
        assertEquals("���������� 250 / 2", 125,cal.divide(250, 2) );  
    } 
    // ��ʾ���������Ӧ���׳�ArithmeticException,������׳��ͱ���  
    @Test(expected=ArithmeticException.class)  
    public void testDivide(){  
        int res = cal.divide(12, 0);  
        assertEquals("���������", 250, res);  
    }  
      
    // ����ʱ��ʱ�䵥λΪms  
    @Test(timeout=190)  
    public void testTime() throws InterruptedException{  
        Thread.sleep(209);  
        int rel = cal.divide(250, 25);  
    }   
}  
