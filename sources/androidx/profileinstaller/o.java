package androidx.profileinstaller;

import com.facebook.internal.security.CertificateUtil;
import java.util.Arrays;

/* compiled from: ProfileVersion */
public class o {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f3967a = {48, 49, 53, 0};

    /* renamed from: b  reason: collision with root package name */
    static final byte[] f3968b = {48, 49, 48, 0};

    /* renamed from: c  reason: collision with root package name */
    static final byte[] f3969c = {48, 48, 57, 0};

    /* renamed from: d  reason: collision with root package name */
    static final byte[] f3970d = {48, 48, 53, 0};

    /* renamed from: e  reason: collision with root package name */
    static final byte[] f3971e = {48, 48, 49, 0};

    /* renamed from: f  reason: collision with root package name */
    static final byte[] f3972f = {48, 48, 49, 0};

    /* renamed from: g  reason: collision with root package name */
    static final byte[] f3973g = {48, 48, 50, 0};

    static String a(byte[] bArr) {
        if (!Arrays.equals(bArr, f3971e) && !Arrays.equals(bArr, f3970d)) {
            return "!";
        }
        return CertificateUtil.DELIMITER;
    }
}
