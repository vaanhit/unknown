package com.unknowninc.spring.util;

import java.util.Map;

import org.springframework.util.AntPathMatcher;

public class CaseInsensitivePathMatcher extends AntPathMatcher {
	
	@Override
    protected boolean doMatch(String pattern, String path,
    		boolean fullMatch, Map<String, String> uriTemplateVariables) {
		System.out.println("domatch called");
        return super.doMatch(pattern.toLowerCase(), path.toLowerCase(), fullMatch, uriTemplateVariables);
    }
	
}
