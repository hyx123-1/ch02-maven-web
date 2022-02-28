package com.edu.cn;

import org.junit.Assert;
import org.junit.Test;

public class TestHellomaven {
    @Test
    public void test()
    {
        System.out.println("测试add方法");
        hellomaven hellomaven=new hellomaven();
        int res=hellomaven.add(1,3);
        Assert.assertEquals(4,res);
    }

    @Test
    public void test2()
    {
        System.out.println("测试add方法2");
        hellomaven hellomaven=new hellomaven();
        int res=hellomaven.add(4,13);
        Assert.assertEquals(17,res);
    }
}
