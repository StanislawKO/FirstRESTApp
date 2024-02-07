package com.kozh.springcourse.firstrestapp.util;

public class PersonNotCreatedException  extends RuntimeException{
    public PersonNotCreatedException(String msg) {
        super(msg);
    }
}
