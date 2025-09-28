package com.review;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.file.Files;


@Configuration
public class PromptConfig {

    @Bean
    public String getDocumentForHCM() throws IOException {
        var resource = new ClassPathResource("HCM202_document.txt");
        return Files.readString(resource.getFile().toPath());
    }

    @Bean
    public String getDocumentForMLN() throws IOException {
        var resource = new ClassPathResource("MLN131_document.txt");
        return Files.readString(resource.getFile().toPath());
    }
}
