package io.github.anotherme17.aviator.spring.support.function;

import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.function.FunctionUtils;
import com.googlecode.aviator.runtime.type.AviatorObject;
import com.googlecode.aviator.utils.Reflector;

import java.util.Map;

/**
 * @author lirenhao
 * date: 2024/4/3 14:30
 */
public class SpringBeanFunction extends AbstractFunction {

    private final Object bean;
    private final Class<?> clazz;
    private final String functionName;

    public SpringBeanFunction(Object bean, String functionName) {
        this.bean = bean;
        this.clazz = bean.getClass();
        this.functionName = functionName;
    }

    @Override
    public String getName() {
        return "spring_function";
    }

    @Override
    public AviatorObject call(Map<String, Object> map) {
        return doFunction(null);
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject) {
        return doFunction(FunctionUtils.getStringValue(aviatorObject, map));
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map),
                FunctionUtils.getStringValue(aviatorObject6, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6, AviatorObject aviatorObject7) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map),
                FunctionUtils.getStringValue(aviatorObject6, map),
                FunctionUtils.getStringValue(aviatorObject7, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6, AviatorObject aviatorObject7, AviatorObject aviatorObject8) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map),
                FunctionUtils.getStringValue(aviatorObject6, map),
                FunctionUtils.getStringValue(aviatorObject7, map),
                FunctionUtils.getStringValue(aviatorObject8, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6, AviatorObject aviatorObject7, AviatorObject aviatorObject8, AviatorObject aviatorObject9) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map),
                FunctionUtils.getStringValue(aviatorObject6, map),
                FunctionUtils.getStringValue(aviatorObject7, map),
                FunctionUtils.getStringValue(aviatorObject8, map),
                FunctionUtils.getStringValue(aviatorObject9, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6, AviatorObject aviatorObject7, AviatorObject aviatorObject8, AviatorObject aviatorObject9, AviatorObject aviatorObject10) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map),
                FunctionUtils.getStringValue(aviatorObject6, map),
                FunctionUtils.getStringValue(aviatorObject7, map),
                FunctionUtils.getStringValue(aviatorObject8, map),
                FunctionUtils.getStringValue(aviatorObject9, map),
                FunctionUtils.getStringValue(aviatorObject10, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6, AviatorObject aviatorObject7, AviatorObject aviatorObject8, AviatorObject aviatorObject9, AviatorObject aviatorObject10, AviatorObject aviatorObject11) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map),
                FunctionUtils.getStringValue(aviatorObject6, map),
                FunctionUtils.getStringValue(aviatorObject7, map),
                FunctionUtils.getStringValue(aviatorObject8, map),
                FunctionUtils.getStringValue(aviatorObject9, map),
                FunctionUtils.getStringValue(aviatorObject10, map),
                FunctionUtils.getStringValue(aviatorObject11, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6, AviatorObject aviatorObject7, AviatorObject aviatorObject8, AviatorObject aviatorObject9, AviatorObject aviatorObject10, AviatorObject aviatorObject11, AviatorObject aviatorObject12) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map),
                FunctionUtils.getStringValue(aviatorObject6, map),
                FunctionUtils.getStringValue(aviatorObject7, map),
                FunctionUtils.getStringValue(aviatorObject8, map),
                FunctionUtils.getStringValue(aviatorObject9, map),
                FunctionUtils.getStringValue(aviatorObject10, map),
                FunctionUtils.getStringValue(aviatorObject11, map),
                FunctionUtils.getStringValue(aviatorObject12, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6, AviatorObject aviatorObject7, AviatorObject aviatorObject8, AviatorObject aviatorObject9, AviatorObject aviatorObject10, AviatorObject aviatorObject11, AviatorObject aviatorObject12, AviatorObject aviatorObject13) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map),
                FunctionUtils.getStringValue(aviatorObject6, map),
                FunctionUtils.getStringValue(aviatorObject7, map),
                FunctionUtils.getStringValue(aviatorObject8, map),
                FunctionUtils.getStringValue(aviatorObject9, map),
                FunctionUtils.getStringValue(aviatorObject10, map),
                FunctionUtils.getStringValue(aviatorObject11, map),
                FunctionUtils.getStringValue(aviatorObject12, map),
                FunctionUtils.getStringValue(aviatorObject13, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6, AviatorObject aviatorObject7, AviatorObject aviatorObject8, AviatorObject aviatorObject9, AviatorObject aviatorObject10, AviatorObject aviatorObject11, AviatorObject aviatorObject12, AviatorObject aviatorObject13, AviatorObject aviatorObject14) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map),
                FunctionUtils.getStringValue(aviatorObject6, map),
                FunctionUtils.getStringValue(aviatorObject7, map),
                FunctionUtils.getStringValue(aviatorObject8, map),
                FunctionUtils.getStringValue(aviatorObject9, map),
                FunctionUtils.getStringValue(aviatorObject10, map),
                FunctionUtils.getStringValue(aviatorObject11, map),
                FunctionUtils.getStringValue(aviatorObject12, map),
                FunctionUtils.getStringValue(aviatorObject13, map),
                FunctionUtils.getStringValue(aviatorObject14, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6, AviatorObject aviatorObject7, AviatorObject aviatorObject8, AviatorObject aviatorObject9, AviatorObject aviatorObject10, AviatorObject aviatorObject11, AviatorObject aviatorObject12, AviatorObject aviatorObject13, AviatorObject aviatorObject14, AviatorObject aviatorObject15) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map),
                FunctionUtils.getStringValue(aviatorObject6, map),
                FunctionUtils.getStringValue(aviatorObject7, map),
                FunctionUtils.getStringValue(aviatorObject8, map),
                FunctionUtils.getStringValue(aviatorObject9, map),
                FunctionUtils.getStringValue(aviatorObject10, map),
                FunctionUtils.getStringValue(aviatorObject11, map),
                FunctionUtils.getStringValue(aviatorObject12, map),
                FunctionUtils.getStringValue(aviatorObject13, map),
                FunctionUtils.getStringValue(aviatorObject14, map),
                FunctionUtils.getStringValue(aviatorObject15, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6, AviatorObject aviatorObject7, AviatorObject aviatorObject8, AviatorObject aviatorObject9, AviatorObject aviatorObject10, AviatorObject aviatorObject11, AviatorObject aviatorObject12, AviatorObject aviatorObject13, AviatorObject aviatorObject14, AviatorObject aviatorObject15, AviatorObject aviatorObject16) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map),
                FunctionUtils.getStringValue(aviatorObject6, map),
                FunctionUtils.getStringValue(aviatorObject7, map),
                FunctionUtils.getStringValue(aviatorObject8, map),
                FunctionUtils.getStringValue(aviatorObject9, map),
                FunctionUtils.getStringValue(aviatorObject10, map),
                FunctionUtils.getStringValue(aviatorObject11, map),
                FunctionUtils.getStringValue(aviatorObject12, map),
                FunctionUtils.getStringValue(aviatorObject13, map),
                FunctionUtils.getStringValue(aviatorObject14, map),
                FunctionUtils.getStringValue(aviatorObject15, map),
                FunctionUtils.getStringValue(aviatorObject16, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6, AviatorObject aviatorObject7, AviatorObject aviatorObject8, AviatorObject aviatorObject9, AviatorObject aviatorObject10, AviatorObject aviatorObject11, AviatorObject aviatorObject12, AviatorObject aviatorObject13, AviatorObject aviatorObject14, AviatorObject aviatorObject15, AviatorObject aviatorObject16, AviatorObject aviatorObject17) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map),
                FunctionUtils.getStringValue(aviatorObject6, map),
                FunctionUtils.getStringValue(aviatorObject7, map),
                FunctionUtils.getStringValue(aviatorObject8, map),
                FunctionUtils.getStringValue(aviatorObject9, map),
                FunctionUtils.getStringValue(aviatorObject10, map),
                FunctionUtils.getStringValue(aviatorObject11, map),
                FunctionUtils.getStringValue(aviatorObject12, map),
                FunctionUtils.getStringValue(aviatorObject13, map),
                FunctionUtils.getStringValue(aviatorObject14, map),
                FunctionUtils.getStringValue(aviatorObject15, map),
                FunctionUtils.getStringValue(aviatorObject16, map),
                FunctionUtils.getStringValue(aviatorObject17, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6, AviatorObject aviatorObject7, AviatorObject aviatorObject8, AviatorObject aviatorObject9, AviatorObject aviatorObject10, AviatorObject aviatorObject11, AviatorObject aviatorObject12, AviatorObject aviatorObject13, AviatorObject aviatorObject14, AviatorObject aviatorObject15, AviatorObject aviatorObject16, AviatorObject aviatorObject17, AviatorObject aviatorObject18) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map),
                FunctionUtils.getStringValue(aviatorObject6, map),
                FunctionUtils.getStringValue(aviatorObject7, map),
                FunctionUtils.getStringValue(aviatorObject8, map),
                FunctionUtils.getStringValue(aviatorObject9, map),
                FunctionUtils.getStringValue(aviatorObject10, map),
                FunctionUtils.getStringValue(aviatorObject11, map),
                FunctionUtils.getStringValue(aviatorObject12, map),
                FunctionUtils.getStringValue(aviatorObject13, map),
                FunctionUtils.getStringValue(aviatorObject14, map),
                FunctionUtils.getStringValue(aviatorObject15, map),
                FunctionUtils.getStringValue(aviatorObject16, map),
                FunctionUtils.getStringValue(aviatorObject17, map),
                FunctionUtils.getStringValue(aviatorObject18, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6, AviatorObject aviatorObject7, AviatorObject aviatorObject8, AviatorObject aviatorObject9, AviatorObject aviatorObject10, AviatorObject aviatorObject11, AviatorObject aviatorObject12, AviatorObject aviatorObject13, AviatorObject aviatorObject14, AviatorObject aviatorObject15, AviatorObject aviatorObject16, AviatorObject aviatorObject17, AviatorObject aviatorObject18, AviatorObject aviatorObject19) {
        return doFunction(
                FunctionUtils.getStringValue(aviatorObject, map),
                FunctionUtils.getStringValue(aviatorObject1, map),
                FunctionUtils.getStringValue(aviatorObject2, map),
                FunctionUtils.getStringValue(aviatorObject3, map),
                FunctionUtils.getStringValue(aviatorObject4, map),
                FunctionUtils.getStringValue(aviatorObject5, map),
                FunctionUtils.getStringValue(aviatorObject6, map),
                FunctionUtils.getStringValue(aviatorObject7, map),
                FunctionUtils.getStringValue(aviatorObject8, map),
                FunctionUtils.getStringValue(aviatorObject9, map),
                FunctionUtils.getStringValue(aviatorObject10, map),
                FunctionUtils.getStringValue(aviatorObject11, map),
                FunctionUtils.getStringValue(aviatorObject12, map),
                FunctionUtils.getStringValue(aviatorObject13, map),
                FunctionUtils.getStringValue(aviatorObject14, map),
                FunctionUtils.getStringValue(aviatorObject15, map),
                FunctionUtils.getStringValue(aviatorObject16, map),
                FunctionUtils.getStringValue(aviatorObject17, map),
                FunctionUtils.getStringValue(aviatorObject18, map),
                FunctionUtils.getStringValue(aviatorObject19, map)
        );
    }

    @Override
    public AviatorObject call(Map<String, Object> map, AviatorObject aviatorObject, AviatorObject aviatorObject1, AviatorObject aviatorObject2, AviatorObject aviatorObject3, AviatorObject aviatorObject4, AviatorObject aviatorObject5, AviatorObject aviatorObject6, AviatorObject aviatorObject7, AviatorObject aviatorObject8, AviatorObject aviatorObject9, AviatorObject aviatorObject10, AviatorObject aviatorObject11, AviatorObject aviatorObject12, AviatorObject aviatorObject13, AviatorObject aviatorObject14, AviatorObject aviatorObject15, AviatorObject aviatorObject16, AviatorObject aviatorObject17, AviatorObject aviatorObject18, AviatorObject aviatorObject19, AviatorObject... aviatorObjects) {
        return null;
    }

    private AviatorObject doFunction(Object... args) {
        return FunctionUtils.wrapReturn(Reflector.invokeInstanceMethod(clazz, functionName, bean, Reflector.getInstanceMethods(clazz, functionName), args));
    }
}
