package com.skypro.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("order")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/addItems")
    public List<Integer> addItems(List<Integer> idList) {
        return cartService.addItems(idList);
    }

    @GetMapping("/getItems")
    public List<Integer> getItems() {
        return cartService.getItems();
    }


}
