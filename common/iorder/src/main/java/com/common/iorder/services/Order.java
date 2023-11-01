package com.common.iorder.services;

import com.common.iorder.api.OrderApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class Order implements OrderApi {

    @GetMapping(path = "/buying")
    @Override
    public boolean buying() {
        return false;
    }

    @GetMapping(path = "/refund")
    @Override
    public boolean refund() {
        return false;
    }
}
