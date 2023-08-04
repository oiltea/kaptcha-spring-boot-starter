package com.github.oiltea.kaptcha;

import com.google.code.kaptcha.Constants;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * KaptchaProperties
 *
 * @author DuJiang
 * @since 1.0.0
 */
@ConfigurationProperties(prefix = KaptchaProperties.PREFIX)
public class KaptchaProperties {
	
	public static final String PREFIX = "oiltea.kaptcha";
	
	/**
	 * 验证码接口路径，默认为 "/kaptcha.jpg"
	 */
	private String urlMapping = "/kaptcha.jpg";
	
	/**
	 * 验证码在 session 中的 key 值，默认为 Constants.KAPTCHA_SESSION_CONFIG_KEY。
	 */
	private String sessionConfigKey = Constants.KAPTCHA_SESSION_KEY;
	
	/**
	 * 验证码在 session 中的创建时间，默认为 Constants.KAPTCHA_SESSION_CONFIG_DATE。
	 */
	private String sessionConfigDate = Constants.KAPTCHA_SESSION_DATE;
	
	/**
	 * 验证码边框的样式，默认为 "no"，可选值为 "yes" 和 "no"。
	 */
	private String border;
	
	/**
	 * 验证码边框的颜色，默认为 Color.BLACK。
	 */
	private String borderColor;
	
	/**
	 * 验证码边框的厚度，默认为 1。
	 */
	private String borderThickness;
	
	/**
	 * 验证码干扰线的颜色，默认为 Color.BLACK。
	 */
	private String noiseColor;
	
	/**
	 * 验证码干扰线的实现类，默认为 com.google.code.kaptcha.impl.DefaultNoise。
	 */
	private String noiseImpl;
	
	/**
	 * 验证码样式的实现类，默认为 com.google.code.kaptcha.impl.WaterRipple。
	 */
	private String obscurificatorImpl;
	
	/**
	 * 验证码生成器的实现类，默认为 com.google.code.kaptcha.impl.DefaultKaptcha。
	 */
	private String producerImpl;
	
	/**
	 * 验证码文本生成器的实现类，默认为 com.google.code.kaptcha.text.impl.DefaultTextCreator。
	 */
	private String textproducerImpl;
	
	/**
	 * 验证码文本生成器使用的字符集，默认为 "abcde2345678gfynmnpwx"。
	 */
	private String textproducerCharString;
	
	/**
	 * 验证码文本的长度，默认为 5。
	 */
	private String textproducerCharLength;
	
	/**
	 * 验证码文本使用的字体，默认为 Arial, Courier。
	 */
	private String textproducerFontNames;
	
	/**
	 * 验证码文本的颜色，默认为 Color.BLACK。
	 */
	private String textproducerFontColor;
	
	/**
	 * 验证码文本的字体大小，默认为 40。
	 */
	private String textproducerFontSize;
	
	/**
	 * 验证码文本字符之间的间距，默认为 2。
	 */
	private String textproducerCharSpace;
	
	/**
	 * 验证码文本渲染器的实现类，默认为 com.google.code.kaptcha.text.impl.DefaultWordRenderer。
	 */
	private String wordrendererImpl;
	
	/**
	 * 验证码背景生成器的实现类，默认为 com.google.code.kaptcha.impl.DefaultBackground。
	 */
	private String backgroundImpl;
	
	/**
	 * 验证码背景的起始颜色，默认为 Color.LIGHT_GRAY。
	 */
	private String backgroundClrFrom;
	
	/**
	 * 验证码背景的结束颜色，默认为 Color.WHITE。
	 */
	private String backgroundClrTo;
	
	/**
	 * 验证码图片的宽度，默认为200。
	 */
	private String imageWidth;
	
	/**
	 * 验证码图片的高度，默认为50。
	 */
	private String imageHeight;
	
	public String getUrlMapping() {
		return urlMapping;
	}
	
	public void setUrlMapping(String urlMapping) {
		this.urlMapping = urlMapping;
	}
	
	public String getSessionConfigKey() {
		return sessionConfigKey;
	}
	
	public void setSessionConfigKey(String sessionConfigKey) {
		this.sessionConfigKey = sessionConfigKey;
	}
	
	public String getSessionConfigDate() {
		return sessionConfigDate;
	}
	
	public void setSessionConfigDate(String sessionConfigDate) {
		this.sessionConfigDate = sessionConfigDate;
	}
	
	public String getBorder() {
		return border;
	}
	
	public void setBorder(String border) {
		this.border = border;
	}
	
	public String getBorderColor() {
		return borderColor;
	}
	
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}
	
	public String getBorderThickness() {
		return borderThickness;
	}
	
	public void setBorderThickness(String borderThickness) {
		this.borderThickness = borderThickness;
	}
	
	public String getNoiseColor() {
		return noiseColor;
	}
	
	public void setNoiseColor(String noiseColor) {
		this.noiseColor = noiseColor;
	}
	
	public String getNoiseImpl() {
		return noiseImpl;
	}
	
	public void setNoiseImpl(String noiseImpl) {
		this.noiseImpl = noiseImpl;
	}
	
	public String getObscurificatorImpl() {
		return obscurificatorImpl;
	}
	
	public void setObscurificatorImpl(String obscurificatorImpl) {
		this.obscurificatorImpl = obscurificatorImpl;
	}
	
	public String getProducerImpl() {
		return producerImpl;
	}
	
	public void setProducerImpl(String producerImpl) {
		this.producerImpl = producerImpl;
	}
	
	public String getTextproducerImpl() {
		return textproducerImpl;
	}
	
	public void setTextproducerImpl(String textproducerImpl) {
		this.textproducerImpl = textproducerImpl;
	}
	
	public String getTextproducerCharString() {
		return textproducerCharString;
	}
	
	public void setTextproducerCharString(String textproducerCharString) {
		this.textproducerCharString = textproducerCharString;
	}
	
	public String getTextproducerCharLength() {
		return textproducerCharLength;
	}
	
	public void setTextproducerCharLength(String textproducerCharLength) {
		this.textproducerCharLength = textproducerCharLength;
	}
	
	public String getTextproducerFontNames() {
		return textproducerFontNames;
	}
	
	public void setTextproducerFontNames(String textproducerFontNames) {
		this.textproducerFontNames = textproducerFontNames;
	}
	
	public String getTextproducerFontColor() {
		return textproducerFontColor;
	}
	
	public void setTextproducerFontColor(String textproducerFontColor) {
		this.textproducerFontColor = textproducerFontColor;
	}
	
	public String getTextproducerFontSize() {
		return textproducerFontSize;
	}
	
	public void setTextproducerFontSize(String textproducerFontSize) {
		this.textproducerFontSize = textproducerFontSize;
	}
	
	public String getTextproducerCharSpace() {
		return textproducerCharSpace;
	}
	
	public void setTextproducerCharSpace(String textproducerCharSpace) {
		this.textproducerCharSpace = textproducerCharSpace;
	}
	
	public String getWordrendererImpl() {
		return wordrendererImpl;
	}
	
	public void setWordrendererImpl(String wordrendererImpl) {
		this.wordrendererImpl = wordrendererImpl;
	}
	
	public String getBackgroundImpl() {
		return backgroundImpl;
	}
	
	public void setBackgroundImpl(String backgroundImpl) {
		this.backgroundImpl = backgroundImpl;
	}
	
	public String getBackgroundClrFrom() {
		return backgroundClrFrom;
	}
	
	public void setBackgroundClrFrom(String backgroundClrFrom) {
		this.backgroundClrFrom = backgroundClrFrom;
	}
	
	public String getBackgroundClrTo() {
		return backgroundClrTo;
	}
	
	public void setBackgroundClrTo(String backgroundClrTo) {
		this.backgroundClrTo = backgroundClrTo;
	}
	
	public String getImageWidth() {
		return imageWidth;
	}
	
	public void setImageWidth(String imageWidth) {
		this.imageWidth = imageWidth;
	}
	
	public String getImageHeight() {
		return imageHeight;
	}
	
	public void setImageHeight(String imageHeight) {
		this.imageHeight = imageHeight;
	}
}