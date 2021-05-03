package com.pmdtest.controller;

import com.pmdtest.controller.request.IntersectionRequest;
import com.pmdtest.service.IntersectionService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://atcoder.jp/contests/abc199/tasks/abc199_b
 */
@RestController
@RequestMapping("/intersection")
public class IntersectionController {
    private final IntersectionService intersectionService;

    public IntersectionController(IntersectionService intersectionService) {
        this.intersectionService = intersectionService;
    }

    @PostMapping
    public int getCount(@RequestBody IntersectionRequest intersectionRequest) {
        int count = intersectionService.getCount(intersectionRequest.getN(), intersectionRequest.getA(), intersectionRequest.getB());
        System.out.println("count:" + count);
        return count;
    }
}
