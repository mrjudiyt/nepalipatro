package com.facebook.appevents.cloudbridge;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: AppEventsConversionsAPITransformer.kt */
public enum AppEventUserAndAppDataField {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes");
    
    public static final Companion Companion = null;
    private final String rawValue;

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final AppEventUserAndAppDataField invoke(String str) {
            m.f(str, "rawValue");
            for (AppEventUserAndAppDataField appEventUserAndAppDataField : AppEventUserAndAppDataField.values()) {
                if (m.a(appEventUserAndAppDataField.getRawValue(), str)) {
                    return appEventUserAndAppDataField;
                }
            }
            return null;
        }
    }

    static {
        Companion = new Companion((g) null);
    }

    private AppEventUserAndAppDataField(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
