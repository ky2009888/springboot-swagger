package com.apps.api.swagger.springbootswagger.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author root
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    /**
     * 查看信息
     *
     * @return info.
     */
    @GetMapping("info")
    @ApiOperation("查询详细信息")
    public String info() {
        return "hello world";
    }
}
