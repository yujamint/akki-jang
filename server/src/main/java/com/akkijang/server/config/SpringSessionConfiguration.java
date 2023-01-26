package com.akkijang.server.config;

import java.net.MalformedURLException;
import org.apache.tomcat.util.http.SameSiteCookies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

@Configuration
public class SpringSessionConfiguration {

    @Bean
    public CookieSerializer cookieSerializer() throws MalformedURLException {
        DefaultCookieSerializer serializer = new DefaultCookieSerializer();
        serializer.setCookieName("JSESSIONID");
        serializer.setSameSite("None");
        serializer.setUseHttpOnlyCookie(true);
        serializer.setUseSecureCookie(true);
        return serializer;
    }
}
