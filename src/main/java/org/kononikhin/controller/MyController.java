package org.kononikhin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String getHomePage() {
        return "home";
    }

    @GetMapping("/leaders")
    public String getLeadersPage() {
        return "leaders";
    }

    @GetMapping("/system")
    public String getSystemPage() {
        return "system";
    }

    @GetMapping("/accessDenied")
    public String getAccessDenied() {
        return "accessDenied";
    }
}
