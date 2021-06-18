package com.apps.api.swagger.springbootswagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author root
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 配置docket以配置Swagger具体参数
     *
     * @return Docket.
     */
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(true)
                .groupName("data-api")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.apps.api.swagger.springbootswagger.controller"))
                .build();
    }
    private ApiInfo apiInfo() {
        Contact contact = new Contact("联系人名字", "http://www.baidu.com/ky2009666", "ky2009666@163.com");
        // public ApiInfo(String title, String description, String version, String termsOfServiceUrl, Contact contact, String ", String licenseUrl, Collection<VendorExtension> vendorExtensions) {
        return new ApiInfo("data api",
                "data api support",
                "v1.0",
                "links",
                contact,
                "Apache 2.0 许可",
                "许可链接",
                new ArrayList<>());
    }
}
