package com.mmall.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@ConfigurationProperties(prefix = "mmall.password")
public class PasswordProperties {

    private static String staticSalt = "zyssdafaqj23ou89ZXcj@#$@#$#@KJdjklj;D../dSF.,";

    private String salt;

    @PostConstruct
    public void setStaticSalt() {
        staticSalt = this.salt;
    }

    public static String getStaticSalt() {
        return staticSalt;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
