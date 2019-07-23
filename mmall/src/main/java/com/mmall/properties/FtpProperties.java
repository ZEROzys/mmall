package com.mmall.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@ConfigurationProperties(prefix = "mmall.ftp")
public class FtpProperties {
    /*private static String staticServerIp = "111.231.1.237";
    private static String staticUsername = "ftpuser";
    private static String staticPassword = "azt153Ftpuser";
    private static String staticDomain = "http://www.zhuys.xyz/";
*/
    private static String staticServerIp = "192.168.137.1";
    private static String staticUsername = "ACER";
    private static String staticPassword = "azt153Win10";
    private static String staticDomain = "ftp://111.231.1.237/";

    private String serverIp;
    private String username;
    private String password;
    private String domain;

    @PostConstruct
    public void set() {
        staticServerIp = this.serverIp;
        staticUsername = username;
        staticPassword = password;
        staticDomain = domain;
    }

    public static String getStaticServerIp() {
        return staticServerIp;
    }

    public static String getStaticUsername() {
        return staticUsername;
    }

    public static String getStaticPassword() {
        return staticPassword;
    }

    public static String getStaticDomain() {
        return staticDomain;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
