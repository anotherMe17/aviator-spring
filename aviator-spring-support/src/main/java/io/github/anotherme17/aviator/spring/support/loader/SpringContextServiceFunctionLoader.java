package io.github.anotherme17.aviator.spring.support.loader;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.googlecode.aviator.runtime.type.AviatorFunction;
import com.googlecode.aviator.spring.SpringContextFunctionLoader;
import io.github.anotherme17.aviator.spring.support.function.SpringBeanFunction;
import org.springframework.context.ApplicationContext;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * @author lirenhao
 * date: 2024/4/3 14:27
 */
public class SpringContextServiceFunctionLoader extends SpringContextFunctionLoader {

    private final Cache<String, Optional<AviatorFunction>> functionCache;

    public SpringContextServiceFunctionLoader(ApplicationContext applicationContext) {
        super(applicationContext);
        this.functionCache = CacheBuilder.newBuilder()
                .maximumSize(200)
                .expireAfterWrite(10, TimeUnit.SECONDS)
                .build();
    }

    @Override
    public AviatorFunction onFunctionNotFound(String name) {
        try {
            Optional<AviatorFunction> function = functionCache.get(name, () -> {
                try {
                    String[] split = name.split("\\.");
                    if (split.length != 2) {
                        return Optional.empty();
                    }

                    Object bean = getApplicationContext().getBean(split[0]);
                    return Optional.of(new SpringBeanFunction(bean, split[1]));
                } catch (Exception e) {
                    return Optional.empty();
                }
            });
            return function.orElse(null);
        } catch (Exception e) {
            return null;
        }
    }
}
