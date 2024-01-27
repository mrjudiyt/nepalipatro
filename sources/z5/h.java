package z5;

import a6.a;
import a6.m0;
import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.b;
import java.net.URLDecoder;
import l6.e;

/* compiled from: DataSchemeDataSource */
public final class h extends f {

    /* renamed from: e  reason: collision with root package name */
    private b f13206e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f13207f;

    /* renamed from: g  reason: collision with root package name */
    private int f13208g;

    /* renamed from: h  reason: collision with root package name */
    private int f13209h;

    public h() {
        super(false);
    }

    public void close() {
        if (this.f13207f != null) {
            this.f13207f = null;
            q();
        }
        this.f13206e = null;
    }

    public long h(b bVar) {
        r(bVar);
        this.f13206e = bVar;
        Uri uri = bVar.f7699a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        a.b(equals, valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        String[] E0 = m0.E0(uri.getSchemeSpecificPart(), ",");
        if (E0.length == 2) {
            String str = E0[1];
            if (E0[0].contains(";base64")) {
                try {
                    this.f13207f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    String valueOf2 = String.valueOf(str);
                    throw ParserException.b(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e10);
                }
            } else {
                this.f13207f = m0.g0(URLDecoder.decode(str, e.f15602a.name()));
            }
            long j10 = bVar.f7705g;
            byte[] bArr = this.f13207f;
            if (j10 <= ((long) bArr.length)) {
                int i10 = (int) j10;
                this.f13208g = i10;
                int length = bArr.length - i10;
                this.f13209h = length;
                long j11 = bVar.f7706h;
                if (j11 != -1) {
                    this.f13209h = (int) Math.min((long) length, j11);
                }
                s(bVar);
                long j12 = bVar.f7706h;
                return j12 != -1 ? j12 : (long) this.f13209h;
            }
            this.f13207f = null;
            throw new DataSourceException(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(valueOf3.length() + 23);
        sb.append("Unexpected URI format: ");
        sb.append(valueOf3);
        throw ParserException.b(sb.toString(), (Throwable) null);
    }

    public Uri n() {
        b bVar = this.f13206e;
        if (bVar != null) {
            return bVar.f7699a;
        }
        return null;
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f13209h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(m0.j(this.f13207f), this.f13208g, bArr, i10, min);
        this.f13208g += min;
        this.f13209h -= min;
        p(min);
        return min;
    }
}
