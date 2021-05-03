package com.pmdtest.controller.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IntersectionRequest {
    private final int N;
    private final List<Integer> A;
    private final List<Integer> B;

    public IntersectionRequest(
            @JsonProperty("N") int n,
            @JsonProperty("A") List<Integer> a,
            @JsonProperty("B") List<Integer> b
    ) {
        N = n;
        A = a;
        B = b;
    }

    public int getN() {
        return N;
    }

    public List<Integer> getA() {
        return A;
    }

    public List<Integer> getB() {
        return B;
    }
}
