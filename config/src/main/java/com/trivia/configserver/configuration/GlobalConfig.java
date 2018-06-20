package com.trivia.configserver.configuration;

import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration("configServer")
@EnableConfigServer
public class GlobalConfig {

}
