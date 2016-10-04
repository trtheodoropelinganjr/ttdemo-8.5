package com.tooltwist.ttdemo.viewHelpers;

import java.util.HashMap;
import java.util.Properties;

import tooltwist.wbd.ViewHelper;

import com.dinaa.ui.UimData;

public class LinkWidgetViewHelper extends ViewHelper {
	private HashMap<String, Object> scopes = new HashMap<String, Object>();

	public LinkWidgetViewHelper(Properties properties) {
		super(properties);
		String target = properties.getProperty("target");
		scopes.put("label", properties.getProperty("label"));
		scopes.put("url", properties.getProperty("url"));
		scopes.put("navpoint", properties.getProperty("navpoint"));
		scopes.put("switcher", properties.getProperty("switcher"));
		scopes.put("target", target);
		scopes.put("selected_href", properties.getProperty("selected_href"));
		
		if(target.equals("NewPage")){
			scopes.put("new_page", "true");
		}
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void callPreFetch(UimData ud) throws Exception {
		// TODO Auto-generated method stub
		super.callPreFetch(ud);
		scopes.put("placeholder", "placeholder");
	}

	public HashMap<String, Object> getScopes() {
		return scopes;
	}

}
