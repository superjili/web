/*
 *	Copyright © 2013 Changsha luoyecong Network Technology Co., Ltd. All rights reserved.
 *	
 *	http://www.luoyecong.com
 */

package com.luoyecong.cms.tag;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luoyecong.cms.plugin.TagPlugin;
import com.luoyecong.cms.service.FolderService;
import com.luoyecong.cms.util.HttpUtils;
import com.luoyecong.cms.util.PropertyUtils;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * folder标签
 * 
 * @author lqq
 * 
 */
@Service
public class FolderUrlTag extends TagPlugin {
	@Autowired
	private FolderService folderService;

	public void execute(Environment env, Map params, TemplateModel[] loopVars,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		String folderId = params.get("folderId").toString();
		String basePath = HttpUtils.getBasePath(request);
		if (Boolean.getBoolean(PropertyUtils.getValue("luoyecong.static"))) {
			env.getOut().write(basePath + "/html/folder/" + folderId + ".html");
		} else {
			env.getOut().write(basePath + "/folder/" + folderId + ".htm");
		}
	}

}
