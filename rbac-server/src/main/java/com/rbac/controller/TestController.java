package com.rbac.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JIAJUN KOU
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    public String Test(){
        return "hello RABC";
    }

}
