package com.baidu.ueditor.define;

import java.util.HashMap;
import java.util.Map;

public class MIMEType {

	public static final Map<String, String> types = new HashMap<String, String>(){{
		put( "images/gif", ".gif" );
		put( "images/jpeg", ".jpg" );
		put( "images/jpg", ".jpg" );
		put( "images/png", ".png" );
		put( "images/bmp", ".bmp" );
	}};
	
	public static String getSuffix ( String mime ) {
		return MIMEType.types.get( mime );
	}
	
}
