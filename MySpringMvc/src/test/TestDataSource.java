package test;

import org.junit.Test;
import org.logicalcobwebs.proxool.ProxoolDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDataSource {

    @Test
    public void test(){
    	
        //读取applicationContext.xml，初始化上下文
        ApplicationContext context =  new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取applicationContext.xml中的ProxoolDataSource实例
        ProxoolDataSource ProxoolDataSource = context.getBean(ProxoolDataSource.class);
        System.out.println(ProxoolDataSource.getDriver());
        System.out.println(ProxoolDataSource.getDriverUrl());
        System.out.println(ProxoolDataSource.getUser());
        System.out.println(ProxoolDataSource.getPassword());
        System.out.println("数据源成功加载!");
    }
}
