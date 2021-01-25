package org.lean.javaclass;

interface Itf0 {
    void run();
    default void sleep(){
        new String("I need sleep.");
    }
}
