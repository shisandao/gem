package com.ssd.gem.controller;

import com.ssd.gem.mbg.model.GemOrder;
import com.ssd.gem.service.IGemOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GemOrderController {

    @Autowired
    private IGemOrderService iGemOrderService;

    @RequestMapping("/order/insert")
    void insert(@RequestBody GemOrder gemOrder) {
        iGemOrderService.insert(gemOrder);
    }

}
