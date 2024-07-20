package belajar.spring.belajar_spring_dasar;

import belajar.spring.belajar_spring_dasar.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanNameConfiguration {

    @Primary
    @Bean(value = "FooFirst")
    public Foo foo1(){
        return new Foo();
    }

    @Bean(value = "FooSecond")
    public Foo foo2(){
        return new Foo();
    }
}