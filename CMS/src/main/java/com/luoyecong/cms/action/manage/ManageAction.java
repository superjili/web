/*
 *	Copyright © 2013 Changsha luoyecong Network Technology Co., Ltd. All rights reserved.
 *	
 *	http://www.luoyecong.com
 */

package com.luoyecong.cms.action.manage;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luoyecong.cms.entity.Admin;
import com.luoyecong.cms.entity.vo.ArticleVo;
import com.luoyecong.cms.exception.FolderNotFoundException;

/**
 * @author lqq
 * @author 进入网站后台首页
 * 
 */

@Controller
@RequestMapping("/manage")
public class ManageAction extends ManageBaseAction {

	@RequestMapping(value = "/index.htm", method = RequestMethod.GET)
	public String index(HttpServletRequest request, ModelMap modelMap)
			throws FolderNotFoundException {
		Admin admin = this.getAdmin(request);
		modelMap.put("articleCount", 0);
		modelMap.put("downloadCount", 0);
		modelMap.put("userCount", 0);
		modelMap.put("folderAll", folderService.getAllFolderList(0));
		List<ArticleVo> articleList = articleService
				.getArticleListByAdminIdAndFolderId(admin.getAdminId(), 0,
						null, 0, 10);
		modelMap.put("articleList", articleList);
		return "manage/index";
	}

}
