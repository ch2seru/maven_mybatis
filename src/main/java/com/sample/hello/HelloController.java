package com.sample.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Subject :
 * User: lke
 * Date: 12. 3. 26
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Map<String, Object> map){
        return  "/hello";
    }

}
