/*
 *	Copyright © 2013 Changsha luoyecong Network Technology Co., Ltd. All rights reserved.
 *	
 *	http://www.luoyecong.com
 */

package com.luoyecong.cms.tag;

import static freemarker.template.ObjectWrapper.BEANS_WRAPPER;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luoyecong.cms.entity.vo.ArticleVo;
import com.luoyecong.cms.entity.vo.FolderVo;
import com.luoyecong.cms.exception.FolderNotFoundException;
import com.luoyecong.cms.plugin.TagPlugin;
import com.luoyecong.cms.service.ArticleService;
import com.luoyecong.cms.service.FolderService;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * @author Herbert
 * 
 */
@Service
public class ArticleListTag extends TagPlugin {

	@Autowired
	private ArticleService articleService;

	@Autowired
	private FolderService folderService;

	public void execute(Environment env, Map params, TemplateModel[] loopVars,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		// 获取页面的参数
		Integer folderId = Integer.parseInt(params.get("folderId").toString());
		Integer rows = Integer.parseInt(params.get("rows").toString());
		// 获取文件的分页
		try {
			FolderVo folder = folderService.getFolderById(folderId);
			List<ArticleVo> articlelist = articleService.getArticleListOfDisplayByPath(
					folder.getPath(), 0, rows);
			env.setVariable("tag_article_list", BEANS_WRAPPER.wrap(articlelist));
		} catch (FolderNotFoundException e) {
			env.setVariable("tag_article_list", BEANS_WRAPPER.wrap(null));
		}

		body.render(env.getOut());
	}

}
