package com.github.oiltea.kaptcha;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.servlet.KaptchaServlet;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * KaptchaAutoConfiguration
 *
 * @author DuJiang
 * @since 1.0.0
 */
@Configuration
@EnableConfigurationProperties(KaptchaProperties.class)
public class KaptchaAutoConfiguration {
	
	@Bean
	public ServletRegistrationBean<KaptchaServlet> myServlet(KaptchaProperties properties) {
		Map<String, String> initParameters = new HashMap<>();
		initParameters.put(Constants.KAPTCHA_SESSION_CONFIG_KEY, properties.getSessionConfigKey());
		initParameters.put(Constants.KAPTCHA_SESSION_CONFIG_DATE, properties.getSessionConfigDate());
		initParameters.put(Constants.KAPTCHA_BORDER, properties.getBorder());
		initParameters.put(Constants.KAPTCHA_BORDER_COLOR, properties.getBorderColor());
		initParameters.put(Constants.KAPTCHA_BORDER_THICKNESS, properties.getBorderThickness());
		initParameters.put(Constants.KAPTCHA_NOISE_COLOR, properties.getNoiseColor());
		initParameters.put(Constants.KAPTCHA_NOISE_IMPL, properties.getNoiseImpl());
		initParameters.put(Constants.KAPTCHA_OBSCURIFICATOR_IMPL, properties.getObscurificatorImpl());
		initParameters.put(Constants.KAPTCHA_PRODUCER_IMPL, properties.getProducerImpl());
		initParameters.put(Constants.KAPTCHA_TEXTPRODUCER_IMPL, properties.getTextproducerImpl());
		initParameters.put(Constants.KAPTCHA_TEXTPRODUCER_CHAR_STRING, properties.getTextproducerCharString());
		initParameters.put(Constants.KAPTCHA_TEXTPRODUCER_CHAR_LENGTH, properties.getTextproducerCharLength());
		initParameters.put(Constants.KAPTCHA_TEXTPRODUCER_FONT_NAMES, properties.getTextproducerFontNames());
		initParameters.put(Constants.KAPTCHA_TEXTPRODUCER_FONT_COLOR, properties.getTextproducerFontColor());
		initParameters.put(Constants.KAPTCHA_TEXTPRODUCER_FONT_SIZE, properties.getTextproducerFontSize());
		initParameters.put(Constants.KAPTCHA_TEXTPRODUCER_CHAR_SPACE, properties.getTextproducerCharSpace());
		initParameters.put(Constants.KAPTCHA_WORDRENDERER_IMPL, properties.getWordrendererImpl());
		initParameters.put(Constants.KAPTCHA_BACKGROUND_IMPL, properties.getBackgroundImpl());
		initParameters.put(Constants.KAPTCHA_BACKGROUND_CLR_FROM, properties.getBackgroundClrFrom());
		initParameters.put(Constants.KAPTCHA_BACKGROUND_CLR_TO, properties.getBackgroundClrTo());
		initParameters.put(Constants.KAPTCHA_IMAGE_WIDTH, properties.getImageWidth());
		initParameters.put(Constants.KAPTCHA_IMAGE_HEIGHT, properties.getImageHeight());
		
		// 移除值为 null 的键值对
		initParameters.entrySet().removeIf(entry -> Objects.isNull(entry.getValue()));
		
		ServletRegistrationBean<KaptchaServlet> servletRegistrationBean = new ServletRegistrationBean<>();
		servletRegistrationBean.setServlet(new KaptchaServlet());
		servletRegistrationBean.addUrlMappings(properties.getUrlMapping());
		servletRegistrationBean.setInitParameters(initParameters);
		return servletRegistrationBean;
	}
	
	@Bean
	public KaptchaManager kaptchaManager(KaptchaProperties properties) {
		return new KaptchaManager(properties.getSessionConfigKey(), properties.getSessionConfigDate());
	}
}