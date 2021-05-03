package com.pmdtest.service;

import java.util.List;
import java.util.Deque;

import org.springframework.stereotype.Component;

@Component
public class IntersectionService {
    public int getCount(int N, List<Integer> aList, List<Integer> bList) {
        int min = 1000;
        int max = 1000;

        for (int i = 0; i < N; i++) {
            min = Math.min(aList.get(i), min);
            max = Math.min(bList.get(i), max);
        }

        return max - min;
    }
}
