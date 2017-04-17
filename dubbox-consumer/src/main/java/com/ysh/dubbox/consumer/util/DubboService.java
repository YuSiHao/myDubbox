package com.ysh.dubbox.consumer.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.utils.ReferenceConfigCache;

/**
 * 动态设置Dubbo服务接口 可以动态指定dubbo 地址 超时时间等参数
 * 
 * @param <T>
 */
@Component
public class DubboService<T> {

	/**
	 * 默认超时时间
	 */
	private final static Integer DEFAULT_TIMEOUT = 100000;
	/**
	 * dubbo 应用配置
	 */
	@Autowired
	private ApplicationConfig applicationConfig;
	/**
	 * dubbo 注册中心配置
	 */
	@Autowired
	private RegistryConfig registryConfig;

	/**
	 * 映射配置
	 */
	private ReferenceConfig<T> reference;
	/**
	 * 泛型class
	 */
	private Class<?> interfaceClass;
	/**
	 * 动态url
	 */
	private String url;
	/**
	 * 超时时间
	 */
	private Integer timeout = DEFAULT_TIMEOUT;

	public DubboService() {

	}

	public T get() {
		ReferenceConfigCache cache = ReferenceConfigCache.getCache();
		return cache.get(referenceConfig());
	}

	public T get(ReferenceConfig<T> referenceConfig) {
		ReferenceConfigCache cache = ReferenceConfigCache.getCache();
		return cache.get(referenceConfig);
	}

	/**
	 * 配置信息
	 * 
	 * @param url
	 * @param timeout
	 * @return
	 */
	private ReferenceConfig<T> referenceConfig() {
		reference = new ReferenceConfig<T>();
		reference.setApplication(applicationConfig);
		reference.setRegistry(registryConfig);
		reference.setInterface(interfaceClass);
		reference.setTimeout(timeout);
		reference.setUrl(url);
		return reference;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getTimeout() {
		return timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

	public Class<?> getInterfaceClass() {
		return interfaceClass;
	}

	public void setInterfaceClass(Class<?> interfaceClass) {
		this.interfaceClass = interfaceClass;
	}

}
