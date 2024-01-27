package e4;

import android.annotation.SuppressLint;

/* compiled from: RendererCapabilities */
public final /* synthetic */ class r {
    public static int a(int i10) {
        return b(i10, 0, 0);
    }

    @SuppressLint({"WrongConstant"})
    public static int b(int i10, int i11, int i12) {
        return i10 | i11 | i12;
    }

    @SuppressLint({"WrongConstant"})
    public static int c(int i10) {
        return i10 & 7;
    }

    @SuppressLint({"WrongConstant"})
    public static int d(int i10) {
        return i10 & 32;
    }
}
