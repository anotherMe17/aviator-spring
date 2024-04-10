package cn.another17.aviator.spring.support.announce;

import cn.another17.aviator.spring.support.config.SpringAviatorConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author lirenhao
 * date: 2024/4/9 17:27
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(value = SpringAviatorConfig.class)
public @interface EnableSpringAviator {
}
