package v7;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import w7.h;

/* compiled from: Handshake */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final String f16865a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Certificate> f16866b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Certificate> f16867c;

    private o(String str, List<Certificate> list, List<Certificate> list2) {
        this.f16865a = str;
        this.f16866b = list;
        this.f16867c = list2;
    }

    public static o b(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            try {
                certificateArr = sSLSession.getPeerCertificates();
            } catch (SSLPeerUnverifiedException unused) {
                certificateArr = null;
            }
            if (certificateArr != null) {
                list = h.k(certificateArr);
            } else {
                list = Collections.emptyList();
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                list2 = h.k(localCertificates);
            } else {
                list2 = Collections.emptyList();
            }
            return new o(cipherSuite, list, list2);
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public String a() {
        return this.f16865a;
    }

    public List<Certificate> c() {
        return this.f16866b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.f16865a.equals(oVar.f16865a) || !this.f16866b.equals(oVar.f16866b) || !this.f16867c.equals(oVar.f16867c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((527 + this.f16865a.hashCode()) * 31) + this.f16866b.hashCode()) * 31) + this.f16867c.hashCode();
    }
}
