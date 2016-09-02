/*
 *	Copyright © 2013 Changsha luoyecong Network Technology Co., Ltd. All rights reserved.
 *	
 *	http://www.luoyecong.com
 */
package com.luoyecong.cms.action;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.luoyecong.cms.service.ArticleService;
import com.luoyecong.cms.service.FolderService;
import com.luoyecong.cms.service.HeadlineService;
import com.luoyecong.cms.service.TemplateService;

/**
 * 
 * @author Herbert
 * 
 */
public class BaseAction {

	@Autowired
	protected FolderService folderService;

	@Autowired
	protected ArticleService fileService;

	@Autowired
	protected TemplateService themeService;

	@Autowired
	protected HeadlineService headlineService;

	protected final Logger logger = Logger.getLogger(this.getClass());
}
