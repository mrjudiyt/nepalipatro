package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import z5.f;

public final class UdpDataSource extends f {

    /* renamed from: e  reason: collision with root package name */
    private final int f7689e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f7690f;

    /* renamed from: g  reason: collision with root package name */
    private final DatagramPacket f7691g;

    /* renamed from: h  reason: collision with root package name */
    private Uri f7692h;

    /* renamed from: i  reason: collision with root package name */
    private DatagramSocket f7693i;

    /* renamed from: j  reason: collision with root package name */
    private MulticastSocket f7694j;

    /* renamed from: k  reason: collision with root package name */
    private InetAddress f7695k;

    /* renamed from: l  reason: collision with root package name */
    private InetSocketAddress f7696l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f7697m;

    /* renamed from: n  reason: collision with root package name */
    private int f7698n;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    public void close() {
        this.f7692h = null;
        MulticastSocket multicastSocket = this.f7694j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f7695k);
            } catch (IOException unused) {
            }
            this.f7694j = null;
        }
        DatagramSocket datagramSocket = this.f7693i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f7693i = null;
        }
        this.f7695k = null;
        this.f7696l = null;
        this.f7698n = 0;
        if (this.f7697m) {
            this.f7697m = false;
            q();
        }
    }

    public long h(b bVar) {
        Uri uri = bVar.f7699a;
        this.f7692h = uri;
        String host = uri.getHost();
        int port = this.f7692h.getPort();
        r(bVar);
        try {
            this.f7695k = InetAddress.getByName(host);
            this.f7696l = new InetSocketAddress(this.f7695k, port);
            if (this.f7695k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f7696l);
                this.f7694j = multicastSocket;
                multicastSocket.joinGroup(this.f7695k);
                this.f7693i = this.f7694j;
            } else {
                this.f7693i = new DatagramSocket(this.f7696l);
            }
            this.f7693i.setSoTimeout(this.f7689e);
            this.f7697m = true;
            s(bVar);
            return -1;
        } catch (SecurityException e10) {
            throw new UdpDataSourceException(e10, AdError.INTERNAL_ERROR_2006);
        } catch (IOException e11) {
            throw new UdpDataSourceException(e11, AdError.INTERNAL_ERROR_CODE);
        }
    }

    public Uri n() {
        return this.f7692h;
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (this.f7698n == 0) {
            try {
                this.f7693i.receive(this.f7691g);
                int length = this.f7691g.getLength();
                this.f7698n = length;
                p(length);
            } catch (SocketTimeoutException e10) {
                throw new UdpDataSourceException(e10, AdError.CACHE_ERROR_CODE);
            } catch (IOException e11) {
                throw new UdpDataSourceException(e11, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f7691g.getLength();
        int i12 = this.f7698n;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f7690f, length2 - i12, bArr, i10, min);
        this.f7698n -= min;
        return min;
    }

    public UdpDataSource(int i10) {
        this(i10, 8000);
    }

    public UdpDataSource(int i10, int i11) {
        super(true);
        this.f7689e = i11;
        byte[] bArr = new byte[i10];
        this.f7690f = bArr;
        this.f7691g = new DatagramPacket(bArr, 0, i10);
    }
}
