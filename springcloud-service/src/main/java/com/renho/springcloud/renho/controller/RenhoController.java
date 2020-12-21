package com.renho.springcloud.renho.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author renho
 * @date 2020/12/21
 */
@RestController
@RequestMapping("/renho")
public class RenhoController {

    @GetMapping("")
    public String get() {
        return "/renho/get";
    }

}
