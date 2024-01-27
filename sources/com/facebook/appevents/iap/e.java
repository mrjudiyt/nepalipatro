package com.facebook.appevents.iap;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ InAppPurchaseBillingClientWrapper f5979h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Runnable f5980i;

    public /* synthetic */ e(InAppPurchaseBillingClientWrapper inAppPurchaseBillingClientWrapper, Runnable runnable) {
        this.f5979h = inAppPurchaseBillingClientWrapper;
        this.f5980i = runnable;
    }

    public final void run() {
        InAppPurchaseBillingClientWrapper.m58queryPurchaseHistory$lambda0(this.f5979h, this.f5980i);
    }
}
