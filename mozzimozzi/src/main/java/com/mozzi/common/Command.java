package com.mozzi.common;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.internal.misc.FileSystemOption;

public interface Command {
	public String exec(HttpServletRequest req, HttpServletResponse resp)//
			throws ServletException, IOException;
	void syso();
	FileSystemOption<T>;

}
