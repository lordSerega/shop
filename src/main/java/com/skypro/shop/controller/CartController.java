package com.skypro.shop.controller;

import com.skypro.shop.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/addItems")
    public List<Integer> addItems(@RequestParam List<Integer> idList) {
        return cartService.addItems(idList);
    }

    @GetMapping("/getItems")
    public List<Integer> getItems() {
        return cartService.getItems();
    }


}
