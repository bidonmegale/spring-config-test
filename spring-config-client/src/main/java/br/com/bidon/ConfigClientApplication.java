package br.com.bidon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@ComponentScan
@RestController
@RefreshScope
public class ConfigClientApplication {

    @Value("${testando.config.bidon}")
    private String url;

    @RequestMapping("")
    String hello() {
        return "Ola " + url + "\n";
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
