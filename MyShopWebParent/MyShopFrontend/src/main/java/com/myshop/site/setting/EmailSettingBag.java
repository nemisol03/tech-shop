package com.myshop.site.setting;

import com.myshop.common.entity.Setting;
import com.myshop.common.entity.SettingBag;

import java.util.List;

public class EmailSettingBag extends SettingBag {

    public EmailSettingBag(List<Setting> settingList) {
        super(settingList);
    }

    public String getHost() {
        return getValue("MAIL_HOST");
    }
    public int getPort() {
        return Integer.parseInt(getValue("MAIL_PORT"));
    }
    public String getUsername() {
        return getValue("MAIL_USERNAME");
    }
    public String getPassword() {
        return getValue("MAIL_PASSWORD");
    }
    public String getSenderName() {
        return getValue("MAIL_SENDER_NAME");
    }
    public String getSmtpAuth() {
        return getValue("MAIL_AUTH");
    }
    public String getSmtpSecured() {
        return getValue("MAIL_SECURED");
    }

    public String getMailFrom() {
        return getValue("MAIL_FROM");
    }

    public String getVerifySubject() {
        return getValue("CUSTOMER_VERIFY_SUBJECT");
    }
    public String getVerifyContent() {
        return getValue("CUSTOMER_VERIFY_CONTENT");
    }

}
