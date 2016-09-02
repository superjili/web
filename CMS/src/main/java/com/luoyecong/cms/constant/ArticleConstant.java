/*
 *	Copyright © 2013 Changsha luoyecong Network Technology Co., Ltd. All rights reserved.
 *	
 *	http://www.luoyecong.com
 */

package com.luoyecong.cms.constant;

/**
 * 文件常量
 * 
 * @author Zhang jiale
 * 
 */
public class ArticleConstant {

	/**
	 * 文件状态
	 * 
	 * @author Herbert
	 * 
	 */
	public static enum Status {
		/**
		 * 隐藏
		 */
		hidden, /**
		 * /** 公开的
		 */
		display,
	};

	/**
	 * 审核
	 * 
	 * @author Herbert
	 * 
	 */
	public static enum check {
		/**
		 * 已审核
		 */
		yes, /**
		 * /** 审核失败
		 */
		no, /**
		 * /** 未审核
		 */
		init,
	};
}
