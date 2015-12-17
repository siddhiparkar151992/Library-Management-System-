package com.xoriant.librarymanagement.controller;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

public interface ObjectCreator<T> {
	
	public T getObject(T object);
	public T createObject();
	T createObject(HttpServletRequest req) throws ParseException;

}
