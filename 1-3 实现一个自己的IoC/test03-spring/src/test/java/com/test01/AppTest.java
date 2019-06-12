package com.test01;

import com.test01.car.AudiCar;
import com.test01.car.BuickCar;
import com.test01.humen.Humen;
import com.test01.humen.LiSi;
import com.test01.humen.ZhangSan;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
    private IoCContainer ioCContainer = new IoCContainer();
    @Before
    public void before(){
        ioCContainer.setBean(AudiCar.class, "audi");
        ioCContainer.setBean(BuickCar.class, "buick");
        ioCContainer.setBean(ZhangSan.class, "zhangsan", "audi");
        ioCContainer.setBean(LiSi.class, "lisi", "buick");
    }
    @Test
    public void test(){
        Humen zhangsan = (Humen) ioCContainer.getBean("zhangsan");
        zhangsan.goHome();
        System.out.println("---------------");
        Humen lisi = (Humen) ioCContainer.getBean("lisi");
        lisi.goHome();
    }
}
