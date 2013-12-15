package com.cy.services;

import org.springframework.stereotype.Component;

@Component
public class Foo implements IFoo {

    public void ok() {
        System.out.println("ok");
    }
}
