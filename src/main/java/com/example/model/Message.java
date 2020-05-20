package com.example.model;

import java.io.Serializable;

public class Message implements Serializable
{
    private String message;
    private String umur;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }
}
