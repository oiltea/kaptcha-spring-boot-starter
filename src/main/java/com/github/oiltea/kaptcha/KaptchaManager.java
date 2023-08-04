package com.github.oiltea.kaptcha;

import org.springframework.util.Assert;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.util.WebUtils;

import java.util.Date;
import java.util.Objects;

/**
 * KaptchaManager
 *
 * @author DuJiang
 * @since 1.0.0
 */
public class KaptchaManager {
	
	private final String sessionConfigKey;
	
	private final String sessionConfigDate;
	
	public KaptchaManager(String sessionConfigKey, String sessionConfigDate) {
		this.sessionConfigKey = sessionConfigKey;
		this.sessionConfigDate = sessionConfigDate;
	}
	
	/**
	 * 比较验证码是否正确 (区分大小写)
	 *
	 * @param text 验证码
	 * @return {@code true} 验证码匹配
	 */
	public boolean equals(String text) {
		return this.equals(text, Objects.toString(getSessionAttribute(sessionConfigKey)));
	}
	
	/**
	 * 比较验证码是否正确 (不区分大小写)
	 *
	 * @param text 验证码
	 * @return {@code true} 验证码匹配
	 */
	public boolean equalsIgnoreCase(String text) {
		return this.equalsIgnoreCase(text, Objects.toString(getSessionAttribute(sessionConfigKey)));
	}
	
	/**
	 * 验证码是否过期
	 *
	 * @return {@code true} 过期
	 */
	public boolean expired() {
		Object o = getSessionAttribute(sessionConfigDate);
		return Objects.nonNull(o) && new Date().compareTo((Date) o) > 0;
	}
	
	/*
	 * Check the given request for a session attribute of the given name.
	 * Returns null if there is no session or if the session has no such attribute.
	 * Does not create a new session if none has existed before!
	 *
	 * @param name the name of the session attribute
	 * @return the value of the session attribute, or {@code null} if not found
	 */
	private Object getSessionAttribute(String name) {
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		Assert.notNull(requestAttributes, "RequestAttributes must not be null");
		return WebUtils.getSessionAttribute(((ServletRequestAttributes) requestAttributes).getRequest(), name);
	}
	
	/**
	 * Compare two strings for equality (case-sensitive) and handle null values
	 *
	 * @param str1 the first String, may be {@code null}
	 * @param str2 the second String, may be {@code null}
	 * @return {@code true} if the String are equal (case-sensitive), or both {@code null}
	 */
	private boolean equals(String str1, String str2) {
		if (str1 == null && str2 == null) {
			return true;
		} else if (str1 == null || str2 == null) {
			return false;
		} else {
			return str1.equals(str2);
		}
	}
	
	/**
	 * Compare two strings for equality (case-insensitive) and handle null values
	 *
	 * @param str1 the first String, may be {@code null}
	 * @param str2 the second String, may be {@code null}
	 * @return {@code true} if the String are equal (case-insensitive), or both {@code null}
	 */
	private boolean equalsIgnoreCase(String str1, String str2) {
		if (str1 == null && str2 == null) {
			return true;
		} else if (str1 == null || str2 == null) {
			return false;
		} else {
			return str1.equalsIgnoreCase(str2);
		}
	}
}