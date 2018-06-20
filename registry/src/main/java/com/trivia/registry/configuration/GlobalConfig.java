package com.trivia.registry.configuration;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

/**
 * @author: savoki
 * @date: 17-8-22
 */


@EnableDiscoveryClient
@EnableEurekaServer
@Configuration("registryServer")
public class GlobalConfig {
}
