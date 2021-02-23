package config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import profile.DevProfile;
import profile.ProductionProfile;
import profile.SystemProfile;

public class JavaConfig {

    @ConditionalOnProperty
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @ConditionalOnProperty
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
