package profile;

import org.springframework.stereotype.Component;

@Component
public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}
