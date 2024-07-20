package belajar.spring.belajar_spring_dasar;

import belajar.spring.belajar_spring_dasar.data.Bar;
import belajar.spring.belajar_spring_dasar.data.Foo;
import belajar.spring.belajar_spring_dasar.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {

    @Primary
    @Bean
    public Foo fooFirst(){
        return new Foo();
    }

    @Bean
    public Foo fooSecond(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar foobar(Foo foo, Bar bar){
        return new FooBar(foo, bar);
    }

}
