package com.lausi.companiescrud.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info=@Info(
        title="companies CRUD",
        version = "1.0.0",
        description = "This is a crud for management companies"
    )
)
public class OpenApiConfig {
    
}
