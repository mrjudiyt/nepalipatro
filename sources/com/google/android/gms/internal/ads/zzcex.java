package com.google.android.gms.internal.ads;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@22.5.0 */
final class zzcex extends SSLSocketFactory {
    final SSLSocketFactory zza = ((SSLSocketFactory) SSLSocketFactory.getDefault());
    final /* synthetic */ zzcey zzb;

    zzcex(zzcey zzcey) {
        this.zzb = zzcey;
    }

    private final Socket zza(Socket socket) {
        zzcey zzcey = this.zzb;
        if (zzcey.zzr > 0) {
            socket.setReceiveBufferSize(zzcey.zzr);
        }
        this.zzb.zzs.add(socket);
        return socket;
    }

    public final Socket createSocket(String str, int i10) {
        Socket createSocket = this.zza.createSocket(str, i10);
        zza(createSocket);
        return createSocket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        Socket createSocket = this.zza.createSocket(str, i10, inetAddress, i11);
        zza(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i10) {
        Socket createSocket = this.zza.createSocket(inetAddress, i10);
        zza(createSocket);
        return createSocket;
    }

    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        Socket createSocket = this.zza.createSocket(inetAddress, i10, inetAddress2, i11);
        zza(createSocket);
        return createSocket;
    }

    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) {
        Socket createSocket = this.zza.createSocket(socket, str, i10, z10);
        zza(createSocket);
        return createSocket;
    }
}
