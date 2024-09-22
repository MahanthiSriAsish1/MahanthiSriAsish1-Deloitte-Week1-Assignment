package com.deloitte.lab5ex1.cg.eis.exception;

import java.io.Serializable;

public class AgeException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public AgeException(String message) {
        super(message);
    }
}