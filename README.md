# Spring 基础例子项目  
## 第1章 概述  

### 概述  

* 1-1 课程概述  

* 1-2 IoC概念介绍  

* 1-3 实现一个自己的IoC  

* 1-4 Spring IoC入门  


## 第2章 第二章  

### 主要介绍Spring Bean的注入方式及相关作用域。  

* 2-1 实例化Bean方式介绍  

1.通过构造方法实例化Bean  
2.通过静态方法实例化Bean  
3.通过实例方法实例化Bean  
4. Bean的别名  

* 2-2 注入Bean方式介绍  

通过构造方法注入  
通过set方法注入  
集合类Bean的型注入  
----List  
----Set  
----Map  
----Properties  
nul值注入
注入时创建内部Bean  

* 2-3 singleton、prototype  

Singleton作用域  
prototype作用域  
 
* 2-4 web相关作用域  

request作用域  
session作用域  
application作用域  
websocket作用域  

* 2-5 自定义作用域  

SimpleThreadScope作用域  


##  第3章 第三章  

### 主要介绍Spring Bean的懒加载、初始化及销毁逻辑处理，Bean的属性继承等。  

* 3-1 Bean的懒加载  

* 3-2 Bean初始化及销毁逻辑处理  

使用init-method  
让Bean突現InitializingBean接口  


使用destory-method  
让Bean实现DisposableBean接口  

* 3-3 Bean属性继承  


## 第4章 第四章  

### 主要介绍通过注解进行Spring Bean的管理。  

* 4-1 注解的基本使用介绍  

* 4-2 通过注解注入Bean  

通过方法注入Bean  
----通过构造方法注入Bean  
----通过set方法注入ean  
通过属性注入Bean  

直接注入集合实例  
----集合类Bean的型注入  
----将多个泛型的实例注入到集合  
--------将多个泛型的实例注入到List  
--------控制泛型实例在List中的顺序  
--------将多个泛型的实例注入到Map  

String、Integer等类型直接赋值  
Springloc容器内置接口实例注入  

* 4-3 通过注解设定Bean的作用域  

Singleton作用域  
prototype作用域  
 
web相关作用域  
----request作用域  
----session作用域  
----application作用域  
----websocket作用域  

自定义作用域  
----SimpleThreadScope作用域  

* 4-4 通过注解开启Bean的懒加载  

* 4-5 通过注解编写Bean初始化及销毁  