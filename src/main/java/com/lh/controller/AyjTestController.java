package com.lh.controller;


import com.lh.service.AyjTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lh
 * @since 2020-04-28
 */
@RestController
@RequestMapping("/ayj-test")
public class AyjTestController {
    @Autowired
    private AyjTestService ayjTestService;

    @PostMapping("/insert")
    public void insert() {
        ayjTestService.insert();
    }

    @PostMapping("/update")
    public void update() {
        ayjTestService.updateById();
    }

    @PostMapping("/selectByCriteria")
    public Object selectByCriteria() {
        return ayjTestService.selectByCriteria();
    }
}
