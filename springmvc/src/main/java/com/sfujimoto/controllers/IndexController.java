package com.sfujimoto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* sfujimoto: 2017/03/21 10:42 */
@Controller
public class IndexController {

    // look for a view called "index"
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
