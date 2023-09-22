package com.tech.players;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Cricket {
    private int id;

    @Override
    public String toString() {
        return "Cricket{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    private String name;
    private Double salary;
//    private Players players;

}
