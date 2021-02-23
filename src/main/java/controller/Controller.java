package controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import profile.SystemProfile;

public class Controller {
    @RestController
    @RequestMapping("/")
    @ConfigurationProperties("netology")
    public class ProfileController {
        private SystemProfile profile;

        public ProfileController(SystemProfile profile) {
            this.profile = profile;
        }

        @GetMapping("profile")
        public String getProfile() {
            return profile.getProfile();
        }
    }
}
