package com.example.mauricio.tutorialandroid;

import java.io.Serializable;

/**
 * Created by mauricio on 19/02/17.
 */

public class Data implements Serializable {
    int a;
    int b;

    public Data(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
