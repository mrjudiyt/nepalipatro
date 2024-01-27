package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.gtm.zzfa;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Objects;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
public class ExceptionReporter implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler zza;
    private final Tracker zzb;
    private final Context zzc;
    private ExceptionParser zzd;
    private GoogleAnalytics zze;

    public ExceptionReporter(Tracker tracker, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        String str;
        String str2;
        Objects.requireNonNull(tracker, "tracker cannot be null");
        Objects.requireNonNull(context, "context cannot be null");
        this.zza = uncaughtExceptionHandler;
        this.zzb = tracker;
        this.zzd = new StandardExceptionParser(context, new ArrayList());
        this.zzc = context.getApplicationContext();
        if (uncaughtExceptionHandler == null) {
            str = "null";
        } else {
            str = uncaughtExceptionHandler.getClass().getName();
        }
        if (str.length() != 0) {
            str2 = "ExceptionReporter created, original handler is ".concat(str);
        } else {
            str2 = new String("ExceptionReporter created, original handler is ");
        }
        zzfa.zzd(str2);
    }

    public ExceptionParser getExceptionParser() {
        return this.zzd;
    }

    public void setExceptionParser(ExceptionParser exceptionParser) {
        this.zzd = exceptionParser;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String str;
        String str2;
        if (this.zzd != null) {
            str = this.zzd.getDescription(thread != null ? thread.getName() : null, th);
        } else {
            str = "UncaughtException";
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "Reporting uncaught exception: ".concat(valueOf);
        } else {
            str2 = new String("Reporting uncaught exception: ");
        }
        zzfa.zzd(str2);
        Tracker tracker = this.zzb;
        HitBuilders.ExceptionBuilder exceptionBuilder = new HitBuilders.ExceptionBuilder();
        exceptionBuilder.setDescription(str);
        exceptionBuilder.setFatal(true);
        tracker.send(exceptionBuilder.build());
        if (this.zze == null) {
            this.zze = GoogleAnalytics.getInstance(this.zzc);
        }
        GoogleAnalytics googleAnalytics = this.zze;
        googleAnalytics.dispatchLocalHits();
        googleAnalytics.zzb().zzf().zzn();
        if (this.zza != null) {
            zzfa.zzd("Passing exception to the original handler");
            this.zza.uncaughtException(thread, th);
        }
    }

    /* access modifiers changed from: package-private */
    public final Thread.UncaughtExceptionHandler zza() {
        return this.zza;
    }
}
