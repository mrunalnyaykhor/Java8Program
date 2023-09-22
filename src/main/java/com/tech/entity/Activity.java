package com.tech.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Activity {
    @Override
    public String toString() {
        return "Activity{" +
                "hobbies='" + hobbies + '\'' +
                "name='" + name + '\'' +
                '}';
    }

    private String hobbies;
    private String name;
}
