package com.facebook;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import java.util.Random;
import kotlin.jvm.internal.g;

/* compiled from: FacebookException.kt */
public class FacebookException extends RuntimeException {
    public static final Companion Companion = new Companion((g) null);
    public static final long serialVersionUID = 1;

    /* compiled from: FacebookException.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public FacebookException() {
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m5_init_$lambda0(String str, boolean z10) {
        if (z10) {
            try {
                ErrorReportHandler errorReportHandler = ErrorReportHandler.INSTANCE;
                ErrorReportHandler.save(str);
            } catch (Exception unused) {
            }
        }
    }

    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str != null) {
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.isInitialized() && random.nextInt(100) > 50) {
                FeatureManager featureManager = FeatureManager.INSTANCE;
                FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, new f(str));
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FacebookException(java.lang.String r2, java.lang.Object... r3) {
        /*
            r1 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.m.f(r3, r0)
            if (r2 != 0) goto L_0x0009
            r2 = 0
            goto L_0x001c
        L_0x0009:
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.String r3 = "java.lang.String.format(this, *args)"
            kotlin.jvm.internal.m.e(r2, r3)
        L_0x001c:
            r1.<init>((java.lang.String) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookException.<init>(java.lang.String, java.lang.Object[]):void");
    }

    public FacebookException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookException(Throwable th) {
        super(th);
    }
}
