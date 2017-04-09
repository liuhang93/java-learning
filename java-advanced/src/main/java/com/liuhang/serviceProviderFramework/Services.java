package com.liuhang.serviceProviderFramework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by liuhang on 2017/4/6.
 * Non instantiable class for service registration and access
 * 非 可实例化的类，提供服务访问API和服务提供者注册API
 */
public class Services {
    private Services() {
    }

    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();

    // Provider registration API
    public static void registerProviders(String name, Provider provider) {
        providers.put(name, provider);
    }

    // Service access API
    public static Service newInstance(String name) {
        Provider provider = providers.get(name);
        if (provider == null) {
            throw new IllegalArgumentException("No provider registered with name: " + name);
        }
        return provider.newService();
    }

}
