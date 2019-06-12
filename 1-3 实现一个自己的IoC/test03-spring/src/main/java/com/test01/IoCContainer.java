package com.test01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 1.实例化bean
 * 2.保存bean
 * 3.提供bean
 * 4.每个bean要产生一个唯一的id与之相对应
 */
public class IoCContainer {
    private Map<String, Object> beans = new ConcurrentHashMap<String, Object>();

    /**
     * 获取一个Bean
     * @param beanId beanId
     * @return 返回bean
     */
    public Object getBean(String beanId){
        return beans.get(beanId);
    }

    /**
     * 委托ioc容器创建一个bean
     * @param clazz 要创建的bean的class
     * @param beanId beanId
     * @param parantBeanIds 要创建的bean的class的构造方法所需要的参数的beanIds们(即依赖beanIds)
     */
    public void setBean(Class<?> clazz, String beanId, String... parantBeanIds){
        //1.组装构造方法所需要的参数
        Object[] parantValues = new Object[parantBeanIds.length];
        for(int i = 0; i < parantBeanIds.length; i++){
            parantValues[i] = beans.get(parantBeanIds[i]);
        }
        //2.调用构造方法实例化bean
        Object bean = null;
        for (Constructor<?> constructor : clazz.getConstructors()) {
            try {
                bean = constructor.newInstance(parantValues);
            } catch (InstantiationException e) {

            } catch (IllegalAccessException e) {

            } catch (InvocationTargetException e) {

            }
        }
        if(bean == null){
            throw new RuntimeException("找不到合适的办法实例化bean.");
        }
        //3.把实例化的bean放入beans
        beans.put(beanId, bean);
    }
}
