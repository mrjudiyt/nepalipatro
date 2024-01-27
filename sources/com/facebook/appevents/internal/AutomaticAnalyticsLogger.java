package com.facebook.appevents.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.iap.InAppPurchaseEventManager;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AutomaticAnalyticsLogger.kt */
public final class AutomaticAnalyticsLogger {
    private static final String APP_EVENTS_IF_AUTO_LOG_SUBS = "app_events_if_auto_log_subs";
    public static final AutomaticAnalyticsLogger INSTANCE = new AutomaticAnalyticsLogger();
    private static final String TAG = AutomaticAnalyticsLogger.class.getCanonicalName();
    private static final InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(FacebookSdk.getApplicationContext());

    /* compiled from: AutomaticAnalyticsLogger.kt */
    private static final class PurchaseLoggingParameters {
        private Currency currency;
        private Bundle param;
        private BigDecimal purchaseAmount;

        public PurchaseLoggingParameters(BigDecimal bigDecimal, Currency currency2, Bundle bundle) {
            m.f(bigDecimal, "purchaseAmount");
            m.f(currency2, FirebaseAnalytics.Param.CURRENCY);
            m.f(bundle, "param");
            this.purchaseAmount = bigDecimal;
            this.currency = currency2;
            this.param = bundle;
        }

        public final Currency getCurrency() {
            return this.currency;
        }

        public final Bundle getParam() {
            return this.param;
        }

        public final BigDecimal getPurchaseAmount() {
            return this.purchaseAmount;
        }

        public final void setCurrency(Currency currency2) {
            m.f(currency2, "<set-?>");
            this.currency = currency2;
        }

        public final void setParam(Bundle bundle) {
            m.f(bundle, "<set-?>");
            this.param = bundle;
        }

        public final void setPurchaseAmount(BigDecimal bigDecimal) {
            m.f(bigDecimal, "<set-?>");
            this.purchaseAmount = bigDecimal;
        }
    }

    static {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
    }

    private AutomaticAnalyticsLogger() {
    }

    private final PurchaseLoggingParameters getPurchaseLoggingParameters(String str, String str2) {
        return getPurchaseLoggingParameters(str, str2, new HashMap());
    }

    public static final boolean isImplicitPurchaseLoggingEnabled() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        String applicationId = FacebookSdk.getApplicationId();
        FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
        FetchedAppSettings appSettingsWithoutQuery = FetchedAppSettingsManager.getAppSettingsWithoutQuery(applicationId);
        return appSettingsWithoutQuery != null && FacebookSdk.getAutoLogAppEventsEnabled() && appSettingsWithoutQuery.getIAPAutomaticLoggingEnabled();
    }

    public static final void logActivateAppEvent() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        String applicationId = FacebookSdk.getApplicationId();
        if (FacebookSdk.getAutoLogAppEventsEnabled() && (applicationContext instanceof Application)) {
            AppEventsLogger.Companion.activateApp((Application) applicationContext, applicationId);
        }
    }

    public static final void logActivityTimeSpentEvent(String str, long j10) {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        String applicationId = FacebookSdk.getApplicationId();
        FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
        FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(applicationId, false);
        if (queryAppSettings != null && queryAppSettings.getAutomaticLoggingEnabled() && j10 > 0) {
            InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(applicationContext);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence(Constants.AA_TIME_SPENT_SCREEN_PARAMETER_NAME, str);
            internalAppEventsLogger2.logEvent(Constants.AA_TIME_SPENT_EVENT_NAME, (double) j10, bundle);
        }
    }

    public static final void logPurchase(String str, String str2, boolean z10) {
        PurchaseLoggingParameters purchaseLoggingParameters;
        m.f(str, "purchase");
        m.f(str2, "skuDetails");
        AutomaticAnalyticsLogger automaticAnalyticsLogger = INSTANCE;
        if (isImplicitPurchaseLoggingEnabled() && (purchaseLoggingParameters = automaticAnalyticsLogger.getPurchaseLoggingParameters(str, str2)) != null) {
            boolean z11 = false;
            if (z10) {
                FetchedAppGateKeepersManager fetchedAppGateKeepersManager = FetchedAppGateKeepersManager.INSTANCE;
                FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
                if (FetchedAppGateKeepersManager.getGateKeeperForKey(APP_EVENTS_IF_AUTO_LOG_SUBS, FacebookSdk.getApplicationId(), false)) {
                    z11 = true;
                }
            }
            if (z11) {
                internalAppEventsLogger.logEventImplicitly(InAppPurchaseEventManager.INSTANCE.hasFreeTrialPeirod(str2) ? AppEventsConstants.EVENT_NAME_START_TRIAL : AppEventsConstants.EVENT_NAME_SUBSCRIBE, purchaseLoggingParameters.getPurchaseAmount(), purchaseLoggingParameters.getCurrency(), purchaseLoggingParameters.getParam());
            } else {
                internalAppEventsLogger.logPurchaseImplicitly(purchaseLoggingParameters.getPurchaseAmount(), purchaseLoggingParameters.getCurrency(), purchaseLoggingParameters.getParam());
            }
        }
    }

    private final PurchaseLoggingParameters getPurchaseLoggingParameters(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            boolean z10 = true;
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence(Constants.IAP_PRODUCT_ID, jSONObject.getString("productId"));
            bundle.putCharSequence(Constants.IAP_PURCHASE_TIME, jSONObject.getString("purchaseTime"));
            bundle.putCharSequence(Constants.IAP_PURCHASE_TOKEN, jSONObject.getString("purchaseToken"));
            bundle.putCharSequence(Constants.IAP_PACKAGE_NAME, jSONObject.optString(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME));
            bundle.putCharSequence(Constants.IAP_PRODUCT_TITLE, jSONObject2.optString(ShareConstants.WEB_DIALOG_PARAM_TITLE));
            bundle.putCharSequence(Constants.IAP_PRODUCT_DESCRIPTION, jSONObject2.optString("description"));
            String optString = jSONObject2.optString(ShareConstants.MEDIA_TYPE);
            bundle.putCharSequence(Constants.IAP_PRODUCT_TYPE, optString);
            if (m.a(optString, "subs")) {
                bundle.putCharSequence(Constants.IAP_SUBSCRIPTION_AUTORENEWING, Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence(Constants.IAP_SUBSCRIPTION_PERIOD, jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence(Constants.IAP_FREE_TRIAL_PERIOD, jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                m.e(optString2, "introductoryPriceCycles");
                if (optString2.length() != 0) {
                    z10 = false;
                }
                if (!z10) {
                    bundle.putCharSequence(Constants.IAP_INTRO_PRICE_AMOUNT_MICROS, jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence(Constants.IAP_INTRO_PRICE_CYCLES, optString2);
                }
            }
            for (Map.Entry next : map.entrySet()) {
                bundle.putCharSequence((String) next.getKey(), (String) next.getValue());
            }
            BigDecimal bigDecimal = new BigDecimal(((double) jSONObject2.getLong("price_amount_micros")) / 1000000.0d);
            Currency instance = Currency.getInstance(jSONObject2.getString("price_currency_code"));
            m.e(instance, "getInstance(skuDetailsJSON.getString(\"price_currency_code\"))");
            return new PurchaseLoggingParameters(bigDecimal, instance, bundle);
        } catch (JSONException unused) {
            return null;
        }
    }
}
