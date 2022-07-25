package com.chainsys.springmvc.commonutil;

import com.chainsys.springmvc.commonutil.HTMLHelper;
import com.chainsys.springmvc.commonutil.LogMannager;

public class ExceptionMannager {
	public static String handleException(Exception e,String source,String message) {
		LogMannager.logException(e,source, message);
		message +="Message: "+e.getMessage();
		String errorPage=HTMLHelper.getHTMLTemplate("ERROR",message);
		return errorPage;
	}
}

