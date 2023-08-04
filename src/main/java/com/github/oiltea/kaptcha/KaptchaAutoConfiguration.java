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
	public ServletRegistrationBean<KaptchaServlet> myServlet(KaptchaProperties kaptchaProperties) {
		Map<String, String> initParameters = new HashMap<>();
		initParameters.put(Constants.KAPTCHA_SESSION_CONFIG_KEY, kaptchaProperties.getSessionConfigKey());
		initParameters.put(Constants.KAPTCHA_SESSION_CONFIG_DATE, kaptchaProperties.getSessionConfigDate());
		initParameters.put(Constants.KAPTCHA_BORDER, kaptchaProperties.getBorder());
		initParameters.put(Constants.KAPTCHA_BORDER_COLOR, kaptchaProperties.getBorderColor());
		initParameters.put(Constants.KAPTCHA_BORDER_THICKNESS, kaptchaProperties.getBorderThickness());
		initParameters.put(Constants.KAPTCHA_NOISE_COLOR, kaptchaProperties.getNoiseColor());
		initParameters.put(Constants.KAPTCHA_NOISE_IMPL, kaptchaProperties.getNoiseImpl());
		initParameters.put(Constants.KAPTCHA_OBSCURIFICATOR_IMPL, kaptchaProperties.getObscurificatorImpl());
		initParameters.put(Constants.KAPTCHA_PRODUCER_IMPL, kaptchaProperties.getProducerImpl());
		initParameters.put(Constants.KAPTCHA_TEXTPRODUCER_IMPL, kaptchaProperties.getTextproducerImpl());
		initParameters.put(Constants.KAPTCHA_TEXTPRODUCER_CHAR_STRING, kaptchaProperties.getTextproducerCharString());
		initParameters.put(Constants.KAPTCHA_TEXTPRODUCER_CHAR_LENGTH, kaptchaProperties.getTextproducerCharLength());
		initParameters.put(Constants.KAPTCHA_TEXTPRODUCER_FONT_NAMES, kaptchaProperties.getTextproducerFontNames());
		initParameters.put(Constants.KAPTCHA_TEXTPRODUCER_FONT_COLOR, kaptchaProperties.getTextproducerFontColor());
		initParameters.put(Constants.KAPTCHA_TEXTPRODUCER_FONT_SIZE, kaptchaProperties.getTextproducerFontSize());
		initParameters.put(Constants.KAPTCHA_TEXTPRODUCER_CHAR_SPACE, kaptchaProperties.getTextproducerCharSpace());
		initParameters.put(Constants.KAPTCHA_WORDRENDERER_IMPL, kaptchaProperties.getWordrendererImpl());
		initParameters.put(Constants.KAPTCHA_BACKGROUND_IMPL, kaptchaProperties.getBackgroundImpl());
		initParameters.put(Constants.KAPTCHA_BACKGROUND_CLR_FROM, kaptchaProperties.getBackgroundClrFrom());
		initParameters.put(Constants.KAPTCHA_BACKGROUND_CLR_TO, kaptchaProperties.getBackgroundClrTo());
		initParameters.put(Constants.KAPTCHA_IMAGE_WIDTH, kaptchaProperties.getImageWidth());
		initParameters.put(Constants.KAPTCHA_IMAGE_HEIGHT, kaptchaProperties.getImageHeight());
		
		initParameters.entrySet().removeIf(entry -> Objects.isNull(entry.getValue()));
		
		ServletRegistrationBean<KaptchaServlet> servletRegistrationBean = new ServletRegistrationBean<>();
		servletRegistrationBean.setServlet(new KaptchaServlet());
		servletRegistrationBean.addUrlMappings(kaptchaProperties.getUrlMapping());
		servletRegistrationBean.setInitParameters(initParameters);
		return servletRegistrationBean;
	}
}