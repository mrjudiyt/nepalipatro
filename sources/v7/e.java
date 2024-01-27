package v7;

import com.facebook.internal.security.CertificateUtil;
import ea.h;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* compiled from: CertificatePinner */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final e f16786b = new b().b();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Set<h>> f16787a;

    /* compiled from: CertificatePinner */
    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, Set<h>> f16788a = new LinkedHashMap();

        public e b() {
            return new e(this);
        }
    }

    public static String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha1/" + d((X509Certificate) certificate).a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    private static h d(X509Certificate x509Certificate) {
        return w7.h.p(h.q(x509Certificate.getPublicKey().getEncoded()));
    }

    public void a(String str, List<Certificate> list) {
        Set<h> b10 = b(str);
        if (b10 != null) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                if (!b10.contains(d((X509Certificate) list.get(i10)))) {
                    i10++;
                } else {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i11);
                sb.append("\n    ");
                sb.append(c(x509Certificate));
                sb.append(": ");
                sb.append(x509Certificate.getSubjectDN().getName());
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(CertificateUtil.DELIMITER);
            for (h a10 : b10) {
                sb.append("\n    sha1/");
                sb.append(a10.a());
            }
            throw new SSLPeerUnverifiedException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public Set<h> b(String str) {
        Set<h> set;
        Set<h> set2 = this.f16787a.get(str);
        int indexOf = str.indexOf(46);
        if (indexOf != str.lastIndexOf(46)) {
            set = this.f16787a.get("*." + str.substring(indexOf + 1));
        } else {
            set = null;
        }
        if (set2 == null && set == null) {
            return null;
        }
        if (set2 == null || set == null) {
            return set2 != null ? set2 : set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set2);
        linkedHashSet.addAll(set);
        return linkedHashSet;
    }

    private e(b bVar) {
        this.f16787a = w7.h.l(bVar.f16788a);
    }
}
