[英文](README.md)
# 示例配置仓库
Spring Cloud Config Server外部git配置仓库

# application-env.yml
  公共配置文件，所有从配置中心获取配置的服务都会得到application-XXX中的配置内容，XXX代表具体的profile
    
  例子. 
  ```
  https://registry-config-server/{service-name}/{env}/{branch}
  
  ```  
  在官方文档中，上述例子中的变量:  
  * `service-name` 代表 {name}  
  * `env` 代表 {profile}  
  * `branch` 代表 {label},含义是git的分支  
# SERVICE-env.yml
  特定服务的配置文件
  
