package com.example.demo.domain;

import com.fasterxml.jackson.databind.BeanProperty;
import lombok.Getter;

@Getter
public enum Calc implements Operation {

    ADD("+"){
        @Override
        public double apply(double x, double y) {
            return x+y;
        }
    },

    MINUS("-"){
        @Override
        public double apply(double x, double y) {
            return x-y;
        }
    };

    private final String character;

    Calc(String character){ this.character = character; }
}
