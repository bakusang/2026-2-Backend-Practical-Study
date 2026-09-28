package com.gdghongik.commerce.entity;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Embeddable
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Quantity {

    private int value;

    private Quantity(int value) {
        // TODO[W2-3]: 수량이 1개 미만이면 IllegalArgumentException 을 던지세요.
        if(value < 1){
            throw new IllegalArgumentException("수량은 1개 이상이어야 합니다.");
        }
        this.value = value;
    }

    public static Quantity of(int value) {
        return new Quantity(value);
    }

    public int value() {
        return value;
    }

    @Override
    public String toString() {
        return value + "개";
    }
}
