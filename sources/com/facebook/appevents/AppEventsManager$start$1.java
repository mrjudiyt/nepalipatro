package com.facebook.appevents;

import com.facebook.appevents.aam.MetadataIndexer;
import com.facebook.appevents.cloudbridge.AppEventsCAPIManager;
import com.facebook.appevents.eventdeactivation.EventDeactivationManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;

/* compiled from: AppEventsManager.kt */
public final class AppEventsManager$start$1 implements FetchedAppSettingsManager.FetchedAppSettingsCallback {
    AppEventsManager$start$1() {
    }

    /* access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-0  reason: not valid java name */
    public static final void m33onSuccess$lambda0(boolean z10) {
        if (z10) {
            MetadataIndexer metadataIndexer = MetadataIndexer.INSTANCE;
            MetadataIndexer.enable();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-1  reason: not valid java name */
    public static final void m34onSuccess$lambda1(boolean z10) {
        if (z10) {
            RestrictiveDataManager restrictiveDataManager = RestrictiveDataManager.INSTANCE;
            RestrictiveDataManager.enable();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-2  reason: not valid java name */
    public static final void m35onSuccess$lambda2(boolean z10) {
        if (z10) {
            ModelManager modelManager = ModelManager.INSTANCE;
            ModelManager.enable();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-3  reason: not valid java name */
    public static final void m36onSuccess$lambda3(boolean z10) {
        if (z10) {
            EventDeactivationManager eventDeactivationManager = EventDeactivationManager.INSTANCE;
            EventDeactivationManager.enable();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-4  reason: not valid java name */
    public static final void m37onSuccess$lambda4(boolean z10) {
        if (z10) {
            InAppPurchaseManager inAppPurchaseManager = InAppPurchaseManager.INSTANCE;
            InAppPurchaseManager.enableAutoLogging();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onSuccess$lambda-5  reason: not valid java name */
    public static final void m38onSuccess$lambda5(boolean z10) {
        if (z10) {
            AppEventsCAPIManager appEventsCAPIManager = AppEventsCAPIManager.INSTANCE;
            AppEventsCAPIManager.enable();
        }
    }

    public void onError() {
    }

    public void onSuccess(FetchedAppSettings fetchedAppSettings) {
        FeatureManager featureManager = FeatureManager.INSTANCE;
        FeatureManager.checkFeature(FeatureManager.Feature.AAM, m.f5993a);
        FeatureManager.checkFeature(FeatureManager.Feature.RestrictiveDataFiltering, p.f6001a);
        FeatureManager.checkFeature(FeatureManager.Feature.PrivacyProtection, k.f5991a);
        FeatureManager.checkFeature(FeatureManager.Feature.EventDeactivation, o.f5995a);
        FeatureManager.checkFeature(FeatureManager.Feature.IapLogging, n.f5994a);
        FeatureManager.checkFeature(FeatureManager.Feature.CloudBridge, l.f5992a);
    }
}
