package com.facebook.appevents.cloudbridge;

import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: AppEventsConversionsAPITransformer.kt */
public enum ConversionsAPICustomEventField {
    VALUE_TO_SUM("value"),
    EVENT_TIME("event_time"),
    EVENT_NAME("event_name"),
    CONTENT_IDS("content_ids"),
    CONTENTS("contents"),
    CONTENT_TYPE(FirebaseAnalytics.Param.CONTENT_TYPE),
    DESCRIPTION("description"),
    LEVEL(FirebaseAnalytics.Param.LEVEL),
    MAX_RATING_VALUE("max_rating_value"),
    NUM_ITEMS("num_items"),
    PAYMENT_INFO_AVAILABLE("payment_info_available"),
    REGISTRATION_METHOD("registration_method"),
    SEARCH_STRING("search_string"),
    SUCCESS("success"),
    ORDER_ID("order_id"),
    AD_TYPE(AppEventsConstants.EVENT_PARAM_AD_TYPE),
    CURRENCY(FirebaseAnalytics.Param.CURRENCY);
    
    private final String rawValue;

    private ConversionsAPICustomEventField(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
