package cn.another17.aviator.spring.test;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;
import cn.another17.aviator.spring.test.service.Service1;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class AviatorSpringTestApplicationTests {

    @Resource
    private Service1 service1;

    @Test
    void testSpringService() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            service1.print(String.valueOf(i));
        }
        System.out.println("耗时: " + (System.currentTimeMillis() - startTime) + "ms");
    }

    @Test
    void testAviatorSpringService() {
        Expression compliedExpression = AviatorEvaluator.compile("service1.print(i)");
        Map<String, Object> env = new HashMap<>();
        env.put("i", String.valueOf(1));
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            compliedExpression.execute(env);
        }
        System.out.println("耗时: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}
