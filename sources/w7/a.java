package w7;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import v7.j;

/* compiled from: ConnectionSpecSelector */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final List<j> f16986a;

    /* renamed from: b  reason: collision with root package name */
    private int f16987b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f16988c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f16989d;

    public a(List<j> list) {
        this.f16986a = list;
    }

    private boolean c(SSLSocket sSLSocket) {
        for (int i10 = this.f16987b; i10 < this.f16986a.size(); i10++) {
            if (this.f16986a.get(i10).g(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public j a(SSLSocket sSLSocket) {
        j jVar;
        int i10 = this.f16987b;
        int size = this.f16986a.size();
        while (true) {
            if (i10 >= size) {
                jVar = null;
                break;
            }
            jVar = this.f16986a.get(i10);
            if (jVar.g(sSLSocket)) {
                this.f16987b = i10 + 1;
                break;
            }
            i10++;
        }
        if (jVar != null) {
            this.f16988c = c(sSLSocket);
            b.f16991b.b(jVar, sSLSocket, this.f16989d);
            return jVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f16989d + ", modes=" + this.f16986a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean b(IOException iOException) {
        this.f16989d = true;
        if (!this.f16988c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z10 = iOException instanceof SSLHandshakeException;
        if ((z10 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (z10 || (iOException instanceof SSLProtocolException)) {
            return true;
        }
        return false;
    }
}
