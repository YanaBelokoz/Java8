package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Main {
    static Logger LOGGER = LogManager.getLogManager(Main.class);

    public static void main(String [] args) {
        List<Integer> number = new ArrayList<>(List.of(2, 4, 6, 8));
        List<Integer> number2 = new ArrayList<>(List.of(1, 3, 5, 7));
        List<List<Integer>> listOfLists = new ArrayList<>(List.of(number, number2));
        List<Integer> listOfInst = listOfLists.stream()
                .flatMap(list ->list.stream())
                .collect(Collectors.toList());
        LOGGER.info("Flat numbers" + listOfInst);
        LOGGER.info("Sorted numbers" + listOfInst.stream().sorted().collect(Collectors.toList()));
        listOfInst.add(null);
        List<Integer> withoutNull = listOfInst.stream().map(el  -> Optional.ofNullable(el).orElse(55)).collect(Collectors.toList());
        LOGGER.info("Null is changed to 55 number" + withoutNull);
        FunctionalInterface n = (Integer x) -> x * 2;
        List<Integer> task2 = withoutNull.stream().map(n::method1).collect(Collectors.toList());
        LOGGER.info(task2);
    }
}