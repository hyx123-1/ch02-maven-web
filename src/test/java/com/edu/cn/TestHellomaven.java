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
}
