package com.luoyecong.cms.plugin;

import javax.annotation.PostConstruct;

public interface Plugin {

	@PostConstruct
	public void init() throws Exception;
}
