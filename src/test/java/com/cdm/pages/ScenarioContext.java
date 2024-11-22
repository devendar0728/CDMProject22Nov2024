package com.cdm.pages;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
	public static final Map<String, Object> contextMap = new HashMap<String, Object>();

    public static void setContext(String key, Object value) {
        contextMap.put(key, value);
    }

    public static <T> T getContext(String key) {
        
        return (T) contextMap.get(key);
    }
}
