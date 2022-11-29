package creational.factory.config_factory;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class CoffeeFactory {

    private static Logger LOGGER = LoggerFactory.getLogger(CoffeeFactory.class);

    private static Map<String, Coffee> coffeeHolder = new HashMap<>();

    static {
        Properties properties = new Properties();
        InputStream inputStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(inputStream);
            for (Map.Entry<Object, Object> entry : properties.entrySet()) {
                String key = entry.getKey().toString();
                Class<?> cls = Class.forName(entry.getValue().toString());
                coffeeHolder.put(key, (Coffee) cls.newInstance());
            }
        } catch (Exception e) {
            LOGGER.error("load coffee config error!", e);
            throw new RuntimeException(e);
        }
    }

    public static Coffee orderCoffee(String name) {
        return coffeeHolder.get(name);
    }
}
