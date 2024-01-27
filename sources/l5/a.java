package l5;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.b;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import z5.j;
import z5.r;

/* compiled from: Aes128DataSource */
class a implements com.google.android.exoplayer2.upstream.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f9982a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f9983b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f9984c;

    /* renamed from: d  reason: collision with root package name */
    private CipherInputStream f9985d;

    public a(com.google.android.exoplayer2.upstream.a aVar, byte[] bArr, byte[] bArr2) {
        this.f9982a = aVar;
        this.f9983b = bArr;
        this.f9984c = bArr2;
    }

    public final void c(r rVar) {
        a6.a.e(rVar);
        this.f9982a.c(rVar);
    }

    public void close() {
        if (this.f9985d != null) {
            this.f9985d = null;
            this.f9982a.close();
        }
    }

    public final long h(b bVar) {
        try {
            Cipher p10 = p();
            try {
                p10.init(2, new SecretKeySpec(this.f9983b, "AES"), new IvParameterSpec(this.f9984c));
                j jVar = new j(this.f9982a, bVar);
                this.f9985d = new CipherInputStream(jVar, p10);
                jVar.h();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final Map<String, List<String>> j() {
        return this.f9982a.j();
    }

    public final Uri n() {
        return this.f9982a.n();
    }

    /* access modifiers changed from: protected */
    public Cipher p() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    public final int read(byte[] bArr, int i10, int i11) {
        a6.a.e(this.f9985d);
        int read = this.f9985d.read(bArr, i10, i11);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
