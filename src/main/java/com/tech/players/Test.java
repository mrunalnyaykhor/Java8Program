package com.tech.players;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Players players1 = new Players();
        players1.setHobbies("Cricket");
        players1.setPlayersId(1);
        Players players2 = new Players();
        players2.setHobbies("HollyBall");
        players2.setPlayersId(2);
        Players players3 = new Players();
        players3.setHobbies("HollyBall");
        players3.setPlayersId(3);

        Cricket cricket1 = new Cricket();
        cricket1.setId(1);
        cricket1.setName("Rahul");
        cricket1.setSalary(30330.00);
        Cricket cricket2 = new Cricket();
        cricket2.setId(1);
        cricket2.setName("Abhishek");
        cricket2.setSalary(40330.00);

        List<Cricket> list = new ArrayList<>();
        list.add(cricket1);
        list.add(cricket2);

        List<Players>players= new ArrayList<>();
        players.add(players1);
        players.add(players2);
        players.add(players3);

        List<Cricket> collect = list.stream().collect(Collectors.toList());
        System.out.println(collect);

        List<Players> playersList = players.stream().collect(Collectors.toList());
        System.out.println(playersList);



    }
}
