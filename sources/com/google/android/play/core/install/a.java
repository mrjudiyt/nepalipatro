package com.google.android.play.core.install;

import java.util.Objects;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
final class a extends InstallState {

    /* renamed from: a  reason: collision with root package name */
    private final int f13484a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13485b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13486c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13487d;

    /* renamed from: e  reason: collision with root package name */
    private final String f13488e;

    a(int i10, long j10, long j11, int i11, String str) {
        this.f13484a = i10;
        this.f13485b = j10;
        this.f13486c = j11;
        this.f13487d = i11;
        Objects.requireNonNull(str, "Null packageName");
        this.f13488e = str;
    }

    public final long a() {
        return this.f13485b;
    }

    public final int b() {
        return this.f13487d;
    }

    public final int c() {
        return this.f13484a;
    }

    public final String d() {
        return this.f13488e;
    }

    public final long e() {
        return this.f13486c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f13484a == installState.c() && this.f13485b == installState.a() && this.f13486c == installState.e() && this.f13487d == installState.b() && this.f13488e.equals(installState.d());
        }
    }

    public final int hashCode() {
        long j10 = this.f13485b;
        long j11 = this.f13486c;
        return ((((((((this.f13484a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f13487d) * 1000003) ^ this.f13488e.hashCode();
    }

    public final String toString() {
        int i10 = this.f13484a;
        long j10 = this.f13485b;
        long j11 = this.f13486c;
        int i11 = this.f13487d;
        String str = this.f13488e;
        return "InstallState{installStatus=" + i10 + ", bytesDownloaded=" + j10 + ", totalBytesToDownload=" + j11 + ", installErrorCode=" + i11 + ", packageName=" + str + "}";
    }
}
