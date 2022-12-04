package structural.proxy.cglib_dynamic_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理对象工厂，主要用于获取代理对象
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation station;

    public ProxyFactory(TrainStation station) {
        this.station = station;
    }

    public TrainStation getProxyObject() {

        // Enhancer对象，类似于JDK代理中的proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类字节码对象
        enhancer.setSuperclass(station.getClass());
        // 设置回调函数，即MethodInterceptor，本类实现了该接口，直接传入本类即可
        enhancer.setCallback(this);

        // 创建代理对象
        return  (TrainStation) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("收取代理费(CGLib代理)");
        return method.invoke(station, objects);
    }
}
