package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* compiled from: HardwareConfigState */
public final class o {

    /* renamed from: f  reason: collision with root package name */
    private static final File f5899f = new File("/proc/self/fd");

    /* renamed from: g  reason: collision with root package name */
    private static volatile o f5900g;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5901a = d();

    /* renamed from: b  reason: collision with root package name */
    private final int f5902b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5903c;

    /* renamed from: d  reason: collision with root package name */
    private int f5904d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5905e = true;

    o() {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5902b = 20000;
            this.f5903c = 0;
            return;
        }
        this.f5902b = 700;
        this.f5903c = 128;
    }

    public static o a() {
        if (f5900g == null) {
            synchronized (o.class) {
                if (f5900g == null) {
                    f5900g = new o();
                }
            }
        }
        return f5900g;
    }

    private synchronized boolean b() {
        boolean z10 = true;
        int i10 = this.f5904d + 1;
        this.f5904d = i10;
        if (i10 >= 50) {
            this.f5904d = 0;
            int length = f5899f.list().length;
            if (length >= this.f5902b) {
                z10 = false;
            }
            this.f5905e = z10;
            if (!z10 && Log.isLoggable("Downsampler", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(this.f5902b);
            }
        }
        return this.f5905e;
    }

    private static boolean d() {
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        String substring = str.substring(0, 7);
        substring.hashCode();
        char c10 = 65535;
        switch (substring.hashCode()) {
            case -1398613787:
                if (substring.equals("SM-A520")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1398431166:
                if (substring.equals("SM-G930")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1398431161:
                if (substring.equals("SM-G935")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1398431073:
                if (substring.equals("SM-G960")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1398431068:
                if (substring.equals("SM-G965")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1398343746:
                if (substring.equals("SM-J720")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1398222624:
                if (substring.equals("SM-N935")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (Build.VERSION.SDK_INT != 26) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public boolean c(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        if (!z10 || !this.f5901a || Build.VERSION.SDK_INT < 26 || z11 || i10 < (i12 = this.f5903c) || i11 < i12 || !b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(26)
    public boolean e(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean c10 = c(i10, i11, z10, z11);
        if (c10) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return c10;
    }
}
