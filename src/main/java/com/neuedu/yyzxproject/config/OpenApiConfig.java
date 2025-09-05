package com.neuedu.yyzxproject.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.Inet4Address;
import java.net.UnknownHostException;

@Configuration
@Slf4j
public class OpenApiConfig implements ApplicationListener<WebServerInitializedEvent> {
    @Bean
    public OpenAPI springOpenAPI() {
        Contact contact = new Contact();
        contact.setName("老马");
        // 访问路径：http://localhost:8080/swagger-ui/index.html
        // 访问路径：http://localhost:8080/doc.html
        return new OpenAPI().info(new Info()
                .title("东软颐养中心系统后端接口测试")
                .description("SpringBoot Simple Application")
                .contact(contact)
                .version("1.0.0"));
    }

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        try {
            //获取IP
            String hostAddress = Inet4Address.getLocalHost().getHostAddress();
            //获取端口号
            int port = event.getWebServer().getPort();
            //获取应用名
            String applicationName = event.getApplicationContext().getApplicationName();
            // TODO:这个localhost改成host地址
            log.info("项目启动成功！接口文档地址: http://" + hostAddress + ":" + port + applicationName + "/doc.html");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
