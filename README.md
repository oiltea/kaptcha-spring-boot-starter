# Google kaptcha SpringBoot support

[![](https://jitpack.io/v/oiltea/kaptcha-spring-boot-starter.svg)](https://jitpack.io/#oiltea/kaptcha-spring-boot-starter)

# 使用方法

1、引入依赖
``` xml
<dependency>
	<groupId>com.github.oiltea</groupId>
	<artifactId>kaptcha-spring-boot-starter</artifactId>
	<version>latest-version</version>
</dependency>
```

2、基本配置
``` properties
oiltea.kaptcha.url-mapping=/kaptcha.jpg
oiltea.kaptcha.textproducer-char-string=123456789ABCDEFGHIJKLMNPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz
oiltea.kaptcha.textproducer-char-length=4
oiltea.kaptcha.border=no
oiltea.kaptcha.image-width=120
oiltea.kaptcha.image-height=48
```