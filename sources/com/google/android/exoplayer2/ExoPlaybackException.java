package com.google.android.exoplayer2;

import a6.a;
import a6.m0;
import android.os.SystemClock;
import android.text.TextUtils;
import b6.y;
import e4.b;
import e4.c;
import e4.j;
import java.io.IOException;

public final class ExoPlaybackException extends PlaybackException {

    /* renamed from: r  reason: collision with root package name */
    public static final b<ExoPlaybackException> f6210r = y.f5134a;

    /* renamed from: k  reason: collision with root package name */
    public final int f6211k;

    /* renamed from: l  reason: collision with root package name */
    public final String f6212l;

    /* renamed from: m  reason: collision with root package name */
    public final int f6213m;

    /* renamed from: n  reason: collision with root package name */
    public final j f6214n;

    /* renamed from: o  reason: collision with root package name */
    public final int f6215o;

    /* renamed from: p  reason: collision with root package name */
    public final g5.j f6216p;

    /* renamed from: q  reason: collision with root package name */
    final boolean f6217q;

    private ExoPlaybackException(int i10, Throwable th, int i11) {
        this(i10, th, (String) null, i11, (String) null, -1, (j) null, 4, false);
    }

    public static ExoPlaybackException b(Throwable th, String str, int i10, j jVar, int i11, boolean z10, int i12) {
        return new ExoPlaybackException(1, th, (String) null, i12, str, i10, jVar, jVar == null ? 4 : i11, z10);
    }

    public static ExoPlaybackException c(IOException iOException, int i10) {
        return new ExoPlaybackException(0, iOException, i10);
    }

    @Deprecated
    public static ExoPlaybackException d(RuntimeException runtimeException) {
        return e(runtimeException, 1000);
    }

    public static ExoPlaybackException e(RuntimeException runtimeException, int i10) {
        return new ExoPlaybackException(2, runtimeException, i10);
    }

    private static String f(int i10, String str, String str2, int i11, j jVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            String valueOf = String.valueOf(jVar);
            String c10 = c.c(i12);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 53 + valueOf.length() + String.valueOf(c10).length());
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i11);
            sb.append(", format=");
            sb.append(valueOf);
            sb.append(", format_supported=");
            sb.append(c10);
            str3 = sb.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        String valueOf2 = String.valueOf(str3);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 2 + String.valueOf(str).length());
        sb2.append(valueOf2);
        sb2.append(": ");
        sb2.append(str);
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public ExoPlaybackException a(g5.j jVar) {
        return new ExoPlaybackException((String) m0.j(getMessage()), getCause(), this.f6225h, this.f6211k, this.f6212l, this.f6213m, this.f6214n, this.f6215o, jVar, this.f6226i, this.f6217q);
    }

    public Exception g() {
        boolean z10 = true;
        if (this.f6211k != 1) {
            z10 = false;
        }
        a.f(z10);
        return (Exception) a.e(getCause());
    }

    public IOException h() {
        a.f(this.f6211k == 0);
        return (IOException) a.e(getCause());
    }

    public RuntimeException i() {
        a.f(this.f6211k == 2);
        return (RuntimeException) a.e(getCause());
    }

    private ExoPlaybackException(int i10, Throwable th, String str, int i11, String str2, int i12, j jVar, int i13, boolean z10) {
        this(f(i10, str, str2, i12, jVar, i13), th, i11, i10, str2, i12, jVar, i13, (g5.j) null, SystemClock.elapsedRealtime(), z10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ExoPlaybackException(String str, Throwable th, int i10, int i11, String str2, int i12, j jVar, int i13, g5.j jVar2, long j10, boolean z10) {
        super(str, th, i10, j10);
        int i14 = i11;
        boolean z11 = z10;
        boolean z12 = false;
        a.a(!z11 || i14 == 1);
        a.a((th != null || i14 == 3) ? true : z12);
        this.f6211k = i14;
        this.f6212l = str2;
        this.f6213m = i12;
        this.f6214n = jVar;
        this.f6215o = i13;
        this.f6216p = jVar2;
        this.f6217q = z11;
    }
}
