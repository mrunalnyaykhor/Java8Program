package com.tech.players;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Players {
    private int playersId;

    @Override
    public String toString() {
        return "Players{" +
                "playersId=" + playersId +
                ", hobbies='" + hobbies + '\'' +
                '}';
    }

    private String hobbies;
}
