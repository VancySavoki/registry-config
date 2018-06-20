[中文](README-zh.md)
# sample-config
Spring Cloud External Configuration Repository

# application-env.yml
  Common config file,all microservice which fetching configuration file from config server will get the file contents as configuration
  e.g. 
  ```
  https://registry-config-server/{service-name}/{env}/{branch}
  
  ```  
  in official document:  
  * `service-name` indicates to {name}  
  * `env` indicates to {profile}  
  * `branch` indicates {label},means git branch  
# SERVICE-env.yml
  specified microservice configurations file.
  
