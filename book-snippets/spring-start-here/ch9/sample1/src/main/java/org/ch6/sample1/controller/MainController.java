package org.ch6.sample1.controller;

import org.ch6.sample1.service.LoginCountService;
import org.springframework.stereotype.Controller;
import org.ch6.sample1.service.LoggedUserManagementService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
public class MainController {

    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;
    private Logger logger = Logger.getLogger(MainController.class.getName());

    public MainController(
            LoggedUserManagementService loggedUserManagementService,
            LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    @GetMapping("/main")
    public String home(
            @RequestParam(required = false) String logout,
            Model model) {

        if (logout != null) {
            loggedUserManagementService.setUsername(null);
        }

        String username = loggedUserManagementService.getUsername();
        int count = loginCountService.getCount();


        if (username == null) {
            return "redirect:/";
        }
        model.addAttribute("username" , username);
        model.addAttribute("loginCount", count);

        logger.info("login attempts: " + count);

        return "main.html";
    }

}
