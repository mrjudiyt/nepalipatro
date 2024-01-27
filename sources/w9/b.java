package w9;

import android.util.Base64;
import g9.d;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.m;

/* compiled from: CryptoHelper.kt */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private String f17044a;

    /* renamed from: b  reason: collision with root package name */
    private final IvParameterSpec f17045b;

    /* renamed from: c  reason: collision with root package name */
    private final SecretKeySpec f17046c;

    /* renamed from: d  reason: collision with root package name */
    private Cipher f17047d;

    /* compiled from: CryptoHelper.kt */
    public final class a {
        public a() {
        }

        public final String a(String str) {
            return new String(new b(b.this.e()).c(str), d.f14759b);
        }

        public final String b(String str) {
            String encodeToString = Base64.encodeToString(new b(b.this.e()).d(str), 0);
            m.e(encodeToString, "encodeToString(enc.encry…Encrypt), Base64.DEFAULT)");
            return encodeToString;
        }
    }

    public b(String str) {
        this.f17044a = str;
        String str2 = this.f17044a;
        m.c(str2);
        Charset charset = d.f14759b;
        byte[] bytes = str2.getBytes(charset);
        m.e(bytes, "this as java.lang.String).getBytes(charset)");
        this.f17045b = new IvParameterSpec(bytes);
        String str3 = this.f17044a;
        m.c(str3);
        byte[] bytes2 = str3.getBytes(charset);
        m.e(bytes2, "this as java.lang.String).getBytes(charset)");
        this.f17046c = new SecretKeySpec(bytes2, "AES");
        try {
            this.f17047d = Cipher.getInstance("AES");
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
        } catch (NoSuchPaddingException e11) {
            e11.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public final byte[] c(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                try {
                    Cipher cipher = this.f17047d;
                    if (cipher != null) {
                        cipher.init(2, this.f17046c, this.f17045b);
                    }
                    Cipher cipher2 = this.f17047d;
                    m.c(cipher2);
                    byte[] doFinal = cipher2.doFinal(Base64.decode(str, 0));
                    m.e(doFinal, "{\n            cipher?.in…ase64.DEFAULT))\n        }");
                    return doFinal;
                } catch (Exception e10) {
                    throw new Exception("[decrypt] " + e10.getMessage());
                }
            }
        }
        throw new Exception("Empty string");
    }

    /* access modifiers changed from: private */
    public final byte[] d(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                try {
                    Cipher cipher = this.f17047d;
                    if (cipher != null) {
                        cipher.init(1, this.f17046c, this.f17045b);
                    }
                    Cipher cipher2 = this.f17047d;
                    m.c(cipher2);
                    byte[] bytes = str.getBytes(d.f14759b);
                    m.e(bytes, "this as java.lang.String).getBytes(charset)");
                    byte[] doFinal = cipher2.doFinal(bytes);
                    m.e(doFinal, "{\n            cipher?.in….toByteArray())\n        }");
                    return doFinal;
                } catch (Exception e10) {
                    throw new Exception("[encrypt] " + e10.getMessage());
                }
            }
        }
        throw new Exception("Empty string");
    }

    public final String e() {
        return this.f17044a;
    }
}
