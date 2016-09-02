/*
 *	Copyright © 2013 Changsha luoyecong Network Technology Co., Ltd. All rights reserved.
 *	
 *	http://www.luoyecong.com
 */

package com.luoyecong.cms.exception;

/**
 * 
 * 系统配置Key获得的Value为空
 * 
 * @author Herbert
 * 
 */
public class AuthException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AuthException(String msg) {
		super(msg);
	}
}
