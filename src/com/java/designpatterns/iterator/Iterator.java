package com.java.designpatterns.iterator;

public abstract class Iterator {
    public abstract Object firstElement();
    public abstract Object nextElement();
    public abstract Object getElement();
    public abstract boolean isEnd();
}