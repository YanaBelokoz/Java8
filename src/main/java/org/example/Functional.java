package org.example;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@java.lang.Functional
public interface Functional {
    LogManager LOGGER = LogManager.getLogManager(Functional.class);

    Integer method1(Integer i);

    default void defaultMethod1() {
        LOGGER.info("defaultMethod1");
    }

    default void defaultMethod2() {
        LOGGER.info("defaultMethod2");
    }

    static void staticMethod1() {
        LOGGER.info("staticMethod1");
    }

    static void staticMethod2() {
        LOGGER.info("staticMethod2");
    }
}
