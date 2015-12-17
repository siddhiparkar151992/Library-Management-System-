package com.xoriant.librarymanagement.controller;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class SessionListener implements HttpSessionBindingListener
{
    protected int numSessions = 0;


////////////// called every time this object is added to a session:
    public synchronized void valueBound(HttpSessionBindingEvent event) {
        numSessions ++;
    }

////////////// called every time this object is removed from a session:
    public synchronized void valueUnbound(HttpSessionBindingEvent event) {
        numSessions --;
    }

////////////// returns the current number of bound sessions:
    public int getNumSessions() {
        return numSessions;
    }
}

