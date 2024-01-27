package com.facebook.login;

/* compiled from: NonceUtil.kt */
public final class NonceUtil {
    public static final NonceUtil INSTANCE = new NonceUtil();

    private NonceUtil() {
    }

    public static final boolean isValidNonce(String str) {
        boolean z10 = false;
        if (str == null || str.length() == 0) {
            return false;
        }
        if (q.G(str, ' ', 0, false, 6, (Object) null) >= 0) {
            z10 = true;
        }
        return !z10;
    }
}
