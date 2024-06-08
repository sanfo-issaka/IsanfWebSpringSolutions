package com.example.demo;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String index(Model model, @AuthenticationPrincipal OidcUser principal) {
        if (principal != null) {
            model.addAttribute("name", principal.getFullName());
        }
        return "index";
    }

    @GetMapping("/user")
    public String user(Model model, @AuthenticationPrincipal OidcUser principal) {
        model.addAttribute("name", principal.getFullName());
        model.addAttribute("email", principal.getEmail());
        return "user";
    }
}
