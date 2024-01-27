package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.Logger;

/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
final class zzcu implements Logger {
    private int zza = 2;
    private boolean zzb;

    zzcu() {
    }

    public final void error(Exception exc) {
    }

    public final void error(String str) {
    }

    public final int getLogLevel() {
        return this.zza;
    }

    public final void info(String str) {
    }

    public final void setLogLevel(int i10) {
        this.zza = i10;
        if (!this.zzb) {
            zzet<String> zzet = zzeu.zzc;
            String zzb2 = zzet.zzb();
            String zzb3 = zzet.zzb();
            StringBuilder sb = new StringBuilder(zzb3.length() + 91);
            sb.append("Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
            sb.append(zzb3);
            sb.append(" DEBUG");
            this.zzb = true;
        }
    }

    public final void verbose(String str) {
    }

    public final void warn(String str) {
    }
}
