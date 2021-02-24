package ru.netology.demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.demo.profile.DevProfile;
import ru.netology.demo.profile.ProductionProfile;
import ru.netology.demo.profile.SystemProfile;

@Configuration
public class JavaConfig {

    @Bean(name = "devProfile")
    @ConditionalOnProperty(
            value = "netology.profile.dev",
            havingValue = "false",
            matchIfMissing = false
    )
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean(name = "productionProfile")
    @ConditionalOnProperty(
            value = "netology.profile.dev",
            havingValue = "true"
    )
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
