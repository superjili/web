/*
 *	Copyright © 2013 Changsha luoyecong Network Technology Co., Ltd. All rights reserved.
 *	
 *	http://www.luoyecong.com
 */

package com.luoyecong.cms.constant;

import com.luoyecong.cms.util.PropertyUtils;

/**
 * 系统常量
 * 
 * @author Herbert
 * 
 */
public class SystemConstant {

	/**
	 * 应用部署路径的KEY
	 */
	public static String luoyecong_CMS_ROOT = PropertyUtils.getRoot();

	/**
	 * 上传文件夹
	 */
	public static String UPLOAD_FOLDER = "upload/photo";

	/**
	 * 备份文件夹
	 */
	public static String BACKUP_FOLDER = "/WEB-INF/backup";

	/**
	 * Session中的管理员Key
	 */
	public static final String SESSION_ADMIN = "SESSION_ADMIN";

	/**
	 * 头像URL 180x180
	 */
	public static final String FACE_URL = "http://faceurl.luoyecong.com/face";

	/**
	 * 
	 */
	public static final String LANGUAGE = "language";

}
