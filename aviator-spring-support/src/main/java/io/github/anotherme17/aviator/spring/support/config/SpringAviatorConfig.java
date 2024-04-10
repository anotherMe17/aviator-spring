package io.github.anotherme17.aviator.spring.support.config;

import com.googlecode.aviator.AviatorEvaluator;
import io.github.anotherme17.aviator.spring.support.loader.SpringContextServiceFunctionLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lirenhao
 * date: 2024/4/9 17:29
 */
@Configuration
public class SpringAviatorConfig {

    @Bean
    public SpringContextServiceFunctionLoader aviatorRuleFactory(ApplicationContext context) {
        SpringContextServiceFunctionLoader functionLoader = new SpringContextServiceFunctionLoader(context);
        AviatorEvaluator.addFunctionLoader(functionLoader);
        return functionLoader;
    }
}
