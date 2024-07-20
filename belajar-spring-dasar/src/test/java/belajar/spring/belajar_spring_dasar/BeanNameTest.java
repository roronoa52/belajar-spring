package belajar.spring.belajar_spring_dasar;

import belajar.spring.belajar_spring_dasar.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    public void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
    }

    @Test
    void TestGetBeanPrimary(){

        Foo foo = applicationContext.getBean(Foo.class);
        Foo foo1 = applicationContext.getBean("FooFirst", Foo.class);
        Foo foo2 = applicationContext.getBean("FooSecond", Foo.class);

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo, foo2);
        Assertions.assertNotSame(foo1, foo2);


    }

}
