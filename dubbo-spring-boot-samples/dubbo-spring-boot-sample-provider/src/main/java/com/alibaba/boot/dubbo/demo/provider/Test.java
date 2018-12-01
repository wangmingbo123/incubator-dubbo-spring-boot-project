package com.alibaba.boot.dubbo.demo.provider;

import static com.alibaba.boot.dubbo.util.DubboUtils.MULTIPLE_CONFIG_PROPERTY_NAME;

public class Test {
    public static void main(String[] args) {
        // dubbo.config.multiple=true
        //ConditionalOnProperty
        System.out.println(MULTIPLE_CONFIG_PROPERTY_NAME
        );

    }


    // 1、拿到propertySource
    // 2、获取dubbo相关的配置
    // 3、注册dubbo相关配置对象
    // 4、DubboConfigBindingBeanPostProcessor在实例化的时候，进行绑定
}
