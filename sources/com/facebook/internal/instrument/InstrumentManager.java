package com.facebook.internal.instrument;

import com.facebook.FacebookSdk;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import com.facebook.internal.instrument.threadcheck.ThreadCheckHandler;
import i3.b;
import i3.c;
import i3.d;

/* compiled from: InstrumentManager.kt */
public final class InstrumentManager {
    public static final InstrumentManager INSTANCE = new InstrumentManager();

    private InstrumentManager() {
    }

    public static final void start() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
            FeatureManager featureManager = FeatureManager.INSTANCE;
            FeatureManager.checkFeature(FeatureManager.Feature.CrashReport, b.f14882a);
            FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, d.f14884a);
            FeatureManager.checkFeature(FeatureManager.Feature.AnrReport, c.f14883a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: start$lambda-0  reason: not valid java name */
    public static final void m114start$lambda0(boolean z10) {
        if (z10) {
            CrashHandler.Companion.enable();
            FeatureManager featureManager = FeatureManager.INSTANCE;
            if (FeatureManager.isEnabled(FeatureManager.Feature.CrashShield)) {
                ExceptionAnalyzer exceptionAnalyzer = ExceptionAnalyzer.INSTANCE;
                ExceptionAnalyzer.enable();
                CrashShieldHandler crashShieldHandler = CrashShieldHandler.INSTANCE;
                CrashShieldHandler.enable();
            }
            if (FeatureManager.isEnabled(FeatureManager.Feature.ThreadCheck)) {
                ThreadCheckHandler threadCheckHandler = ThreadCheckHandler.INSTANCE;
                ThreadCheckHandler.enable();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: start$lambda-1  reason: not valid java name */
    public static final void m115start$lambda1(boolean z10) {
        if (z10) {
            ErrorReportHandler errorReportHandler = ErrorReportHandler.INSTANCE;
            ErrorReportHandler.enable();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: start$lambda-2  reason: not valid java name */
    public static final void m116start$lambda2(boolean z10) {
        if (z10) {
            ANRHandler aNRHandler = ANRHandler.INSTANCE;
            ANRHandler.enable();
        }
    }
}
