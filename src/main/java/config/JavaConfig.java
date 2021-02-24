package config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import profile.DevProfile;
import profile.ProductionProfile;
import profile.SystemProfile;

@Configuration
public class JavaConfig {

    @Bean(name = "devProfile")
    @ConditionalOnProperty(
            value = "netology.profile.dev",
            havingValue = "true",
            matchIfMissing = true
    )
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean(name = "productionProfile")
    @ConditionalOnProperty(
            value = "netology.profile.prod",
            havingValue = "false"
    )
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
