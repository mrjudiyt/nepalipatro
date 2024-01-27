package com.google.firebase.dynamiclinks;

import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.dynamiclinks.ShortDynamicLink;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.jvm.internal.m;
import o8.q;
import y8.l;

/* compiled from: FirebaseDynamicLinks.kt */
public final class FirebaseDynamicLinksKt {
    public static final void androidParameters(DynamicLink.Builder builder, l<? super DynamicLink.AndroidParameters.Builder, q> lVar) {
        m.f(builder, "<this>");
        m.f(lVar, "init");
        DynamicLink.AndroidParameters.Builder builder2 = new DynamicLink.AndroidParameters.Builder();
        lVar.invoke(builder2);
        builder.setAndroidParameters(builder2.build());
    }

    public static final Uri component1(ShortDynamicLink shortDynamicLink) {
        m.f(shortDynamicLink, "<this>");
        return shortDynamicLink.getShortLink();
    }

    public static final Uri component2(ShortDynamicLink shortDynamicLink) {
        m.f(shortDynamicLink, "<this>");
        return shortDynamicLink.getPreviewLink();
    }

    public static final List<ShortDynamicLink.Warning> component3(ShortDynamicLink shortDynamicLink) {
        m.f(shortDynamicLink, "<this>");
        List<? extends ShortDynamicLink.Warning> warnings = shortDynamicLink.getWarnings();
        m.e(warnings, "warnings");
        return warnings;
    }

    public static final DynamicLink dynamicLink(FirebaseDynamicLinks firebaseDynamicLinks, l<? super DynamicLink.Builder, q> lVar) {
        m.f(firebaseDynamicLinks, "<this>");
        m.f(lVar, "init");
        DynamicLink.Builder createDynamicLink = FirebaseDynamicLinks.getInstance().createDynamicLink();
        m.e(createDynamicLink, "getInstance().createDynamicLink()");
        lVar.invoke(createDynamicLink);
        DynamicLink buildDynamicLink = createDynamicLink.buildDynamicLink();
        m.e(buildDynamicLink, "builder.buildDynamicLink()");
        return buildDynamicLink;
    }

    public static final FirebaseDynamicLinks dynamicLinks(Firebase firebase, FirebaseApp firebaseApp) {
        m.f(firebase, "<this>");
        m.f(firebaseApp, "app");
        FirebaseDynamicLinks instance = FirebaseDynamicLinks.getInstance(firebaseApp);
        m.e(instance, "getInstance(app)");
        return instance;
    }

    public static final FirebaseDynamicLinks getDynamicLinks(Firebase firebase) {
        m.f(firebase, "<this>");
        FirebaseDynamicLinks instance = FirebaseDynamicLinks.getInstance();
        m.e(instance, "getInstance()");
        return instance;
    }

    public static final void googleAnalyticsParameters(DynamicLink.Builder builder, l<? super DynamicLink.GoogleAnalyticsParameters.Builder, q> lVar) {
        m.f(builder, "<this>");
        m.f(lVar, "init");
        DynamicLink.GoogleAnalyticsParameters.Builder builder2 = new DynamicLink.GoogleAnalyticsParameters.Builder();
        lVar.invoke(builder2);
        builder.setGoogleAnalyticsParameters(builder2.build());
    }

    public static final void iosParameters(DynamicLink.Builder builder, String str, l<? super DynamicLink.IosParameters.Builder, q> lVar) {
        m.f(builder, "<this>");
        m.f(str, "bundleId");
        m.f(lVar, "init");
        DynamicLink.IosParameters.Builder builder2 = new DynamicLink.IosParameters.Builder(str);
        lVar.invoke(builder2);
        builder.setIosParameters(builder2.build());
    }

    public static final void itunesConnectAnalyticsParameters(DynamicLink.Builder builder, l<? super DynamicLink.ItunesConnectAnalyticsParameters.Builder, q> lVar) {
        m.f(builder, "<this>");
        m.f(lVar, "init");
        DynamicLink.ItunesConnectAnalyticsParameters.Builder builder2 = new DynamicLink.ItunesConnectAnalyticsParameters.Builder();
        lVar.invoke(builder2);
        builder.setItunesConnectAnalyticsParameters(builder2.build());
    }

    public static final void navigationInfoParameters(DynamicLink.Builder builder, l<? super DynamicLink.NavigationInfoParameters.Builder, q> lVar) {
        m.f(builder, "<this>");
        m.f(lVar, "init");
        DynamicLink.NavigationInfoParameters.Builder builder2 = new DynamicLink.NavigationInfoParameters.Builder();
        lVar.invoke(builder2);
        builder.setNavigationInfoParameters(builder2.build());
    }

    public static final Task<ShortDynamicLink> shortLinkAsync(FirebaseDynamicLinks firebaseDynamicLinks, l<? super DynamicLink.Builder, q> lVar) {
        m.f(firebaseDynamicLinks, "<this>");
        m.f(lVar, "init");
        DynamicLink.Builder createDynamicLink = FirebaseDynamicLinks.getInstance().createDynamicLink();
        m.e(createDynamicLink, "getInstance().createDynamicLink()");
        lVar.invoke(createDynamicLink);
        Task<ShortDynamicLink> buildShortDynamicLink = createDynamicLink.buildShortDynamicLink();
        m.e(buildShortDynamicLink, "builder.buildShortDynamicLink()");
        return buildShortDynamicLink;
    }

    public static final void socialMetaTagParameters(DynamicLink.Builder builder, l<? super DynamicLink.SocialMetaTagParameters.Builder, q> lVar) {
        m.f(builder, "<this>");
        m.f(lVar, "init");
        DynamicLink.SocialMetaTagParameters.Builder builder2 = new DynamicLink.SocialMetaTagParameters.Builder();
        lVar.invoke(builder2);
        builder.setSocialMetaTagParameters(builder2.build());
    }

    public static final Uri component1(PendingDynamicLinkData pendingDynamicLinkData) {
        m.f(pendingDynamicLinkData, "<this>");
        return pendingDynamicLinkData.getLink();
    }

    public static final int component2(PendingDynamicLinkData pendingDynamicLinkData) {
        m.f(pendingDynamicLinkData, "<this>");
        return pendingDynamicLinkData.getMinimumAppVersion();
    }

    public static final long component3(PendingDynamicLinkData pendingDynamicLinkData) {
        m.f(pendingDynamicLinkData, "<this>");
        return pendingDynamicLinkData.getClickTimestamp();
    }

    public static final void androidParameters(DynamicLink.Builder builder, String str, l<? super DynamicLink.AndroidParameters.Builder, q> lVar) {
        m.f(builder, "<this>");
        m.f(str, RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME);
        m.f(lVar, "init");
        DynamicLink.AndroidParameters.Builder builder2 = new DynamicLink.AndroidParameters.Builder(str);
        lVar.invoke(builder2);
        builder.setAndroidParameters(builder2.build());
    }

    public static final void googleAnalyticsParameters(DynamicLink.Builder builder, String str, String str2, String str3, l<? super DynamicLink.GoogleAnalyticsParameters.Builder, q> lVar) {
        m.f(builder, "<this>");
        m.f(str, "source");
        m.f(str2, "medium");
        m.f(str3, "campaign");
        m.f(lVar, "init");
        DynamicLink.GoogleAnalyticsParameters.Builder builder2 = new DynamicLink.GoogleAnalyticsParameters.Builder(str, str2, str3);
        lVar.invoke(builder2);
        builder.setGoogleAnalyticsParameters(builder2.build());
    }

    public static final Task<ShortDynamicLink> shortLinkAsync(FirebaseDynamicLinks firebaseDynamicLinks, int i10, l<? super DynamicLink.Builder, q> lVar) {
        m.f(firebaseDynamicLinks, "<this>");
        m.f(lVar, "init");
        DynamicLink.Builder createDynamicLink = FirebaseDynamicLinks.getInstance().createDynamicLink();
        m.e(createDynamicLink, "getInstance().createDynamicLink()");
        lVar.invoke(createDynamicLink);
        Task<ShortDynamicLink> buildShortDynamicLink = createDynamicLink.buildShortDynamicLink(i10);
        m.e(buildShortDynamicLink, "builder.buildShortDynamicLink(suffix)");
        return buildShortDynamicLink;
    }
}
