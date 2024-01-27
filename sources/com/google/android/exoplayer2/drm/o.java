package com.google.android.exoplayer2.drm;

import a6.a;
import a6.m0;
import a6.p;
import a6.y;
import android.annotation.SuppressLint;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.drm.n;
import e4.c;
import j4.q;
import j4.r;
import j4.s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l6.e;
import r4.l;

/* compiled from: FrameworkMediaDrm */
public final class o implements n {

    /* renamed from: d  reason: collision with root package name */
    public static final n.c f6588d = s.f15387a;

    /* renamed from: a  reason: collision with root package name */
    private final UUID f6589a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaDrm f6590b;

    /* renamed from: c  reason: collision with root package name */
    private int f6591c = 1;

    private o(UUID uuid) {
        a.e(uuid);
        a.b(!c.f8046b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f6589a = uuid;
        MediaDrm mediaDrm = new MediaDrm(r(uuid));
        this.f6590b = mediaDrm;
        if (c.f8048d.equals(uuid) && y()) {
            t(mediaDrm);
        }
    }

    private static byte[] n(byte[] bArr) {
        y yVar = new y(bArr);
        int p10 = yVar.p();
        short r10 = yVar.r();
        short r11 = yVar.r();
        if (r10 == 1 && r11 == 1) {
            short r12 = yVar.r();
            Charset charset = e.f15606e;
            String A = yVar.A(r12, charset);
            if (A.contains("<LA_URL>")) {
                return bArr;
            }
            int indexOf = A.indexOf("</DATA>");
            if (indexOf == -1) {
                p.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
            }
            String substring = A.substring(0, indexOf);
            String substring2 = A.substring(indexOf);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 26 + String.valueOf(substring2).length());
            sb.append(substring);
            sb.append("<LA_URL>https://x</LA_URL>");
            sb.append(substring2);
            String sb2 = sb.toString();
            int i10 = p10 + 52;
            ByteBuffer allocate = ByteBuffer.allocate(i10);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(i10);
            allocate.putShort((short) r10);
            allocate.putShort((short) r11);
            allocate.putShort((short) (sb2.length() * 2));
            allocate.put(sb2.getBytes(charset));
            return allocate.array();
        }
        p.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
        return bArr;
    }

    private static byte[] o(UUID uuid, byte[] bArr) {
        return c.f8047c.equals(uuid) ? a.a(bArr) : bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if ("AFTT".equals(r0) == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] p(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = e4.c.f8049e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L_0x0018
            byte[] r1 = r4.l.e(r4, r3)
            if (r1 != 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r4 = r1
        L_0x0010:
            byte[] r4 = n(r4)
            byte[] r4 = r4.l.a(r0, r4)
        L_0x0018:
            int r1 = a6.m0.f205a
            r2 = 23
            if (r1 >= r2) goto L_0x0026
            java.util.UUID r1 = e4.c.f8048d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0058
        L_0x0026:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = a6.m0.f207c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = a6.m0.f208d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0058
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x005f
        L_0x0058:
            byte[] r3 = r4.l.e(r4, r3)
            if (r3 == 0) goto L_0x005f
            return r3
        L_0x005f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.o.p(java.util.UUID, byte[]):byte[]");
    }

    private static String q(UUID uuid, String str) {
        return (m0.f205a >= 26 || !c.f8047c.equals(uuid) || (!"video/mp4".equals(str) && !"audio/mp4".equals(str))) ? str : "cenc";
    }

    private static UUID r(UUID uuid) {
        return (m0.f205a >= 27 || !c.f8047c.equals(uuid)) ? uuid : c.f8046b;
    }

    @SuppressLint({"WrongConstant"})
    private static void t(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static h.b v(UUID uuid, List<h.b> list) {
        boolean z10;
        if (!c.f8048d.equals(uuid)) {
            return list.get(0);
        }
        if (m0.f205a >= 28 && list.size() > 1) {
            h.b bVar = list.get(0);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    z10 = true;
                    break;
                }
                h.b bVar2 = list.get(i10);
                byte[] bArr = (byte[]) a.e(bVar2.f6573l);
                if (!m0.c(bVar2.f6572k, bVar.f6572k) || !m0.c(bVar2.f6571j, bVar.f6571j) || !l.c(bArr)) {
                    z10 = false;
                } else {
                    i11 += bArr.length;
                    i10++;
                }
            }
            z10 = false;
            if (z10) {
                byte[] bArr2 = new byte[i11];
                int i12 = 0;
                for (int i13 = 0; i13 < list.size(); i13++) {
                    byte[] bArr3 = (byte[]) a.e(list.get(i13).f6573l);
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i12, length);
                    i12 += length;
                }
                return bVar.c(bArr2);
            }
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            h.b bVar3 = list.get(i14);
            int g10 = l.g((byte[]) a.e(bVar3.f6573l));
            int i15 = m0.f205a;
            if (i15 < 23 && g10 == 0) {
                return bVar3;
            }
            if (i15 >= 23 && g10 == 1) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(n.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ n x(UUID uuid) {
        try {
            return z(uuid);
        } catch (UnsupportedDrmException unused) {
            String valueOf = String.valueOf(uuid);
            StringBuilder sb = new StringBuilder(valueOf.length() + 53);
            sb.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb.append(valueOf);
            sb.append(".");
            p.c("FrameworkMediaDrm", sb.toString());
            return new l();
        }
    }

    private static boolean y() {
        return "ASUS_Z00AD".equals(m0.f208d);
    }

    public static o z(UUID uuid) {
        try {
            return new o(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new UnsupportedDrmException(1, e10);
        } catch (Exception e11) {
            throw new UnsupportedDrmException(2, e11);
        }
    }

    public Class<q> a() {
        return q.class;
    }

    public Map<String, String> b(byte[] bArr) {
        return this.f6590b.queryKeyStatus(bArr);
    }

    public n.d d() {
        MediaDrm.ProvisionRequest provisionRequest = this.f6590b.getProvisionRequest();
        return new n.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public byte[] e() {
        return this.f6590b.openSession();
    }

    public void f(byte[] bArr, byte[] bArr2) {
        this.f6590b.restoreKeys(bArr, bArr2);
    }

    public void g(byte[] bArr) {
        this.f6590b.closeSession(bArr);
    }

    public void h(n.b bVar) {
        r rVar;
        MediaDrm mediaDrm = this.f6590b;
        if (bVar == null) {
            rVar = null;
        } else {
            rVar = new r(this, bVar);
        }
        mediaDrm.setOnEventListener(rVar);
    }

    public byte[] i(byte[] bArr, byte[] bArr2) {
        if (c.f8047c.equals(this.f6589a)) {
            bArr2 = a.b(bArr2);
        }
        return this.f6590b.provideKeyResponse(bArr, bArr2);
    }

    public void j(byte[] bArr) {
        this.f6590b.provideProvisionResponse(bArr);
    }

    public n.a k(byte[] bArr, List<h.b> list, int i10, HashMap<String, String> hashMap) {
        String str;
        byte[] bArr2;
        h.b bVar = null;
        if (list != null) {
            bVar = v(this.f6589a, list);
            bArr2 = p(this.f6589a, (byte[]) a.e(bVar.f6573l));
            str = q(this.f6589a, bVar.f6572k);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f6590b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] o10 = o(this.f6589a, keyRequest.getData());
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("https://x".equals(defaultUrl)) {
            defaultUrl = "";
        }
        if (TextUtils.isEmpty(defaultUrl) && bVar != null && !TextUtils.isEmpty(bVar.f6571j)) {
            defaultUrl = bVar.f6571j;
        }
        return new n.a(o10, defaultUrl, m0.f205a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    public synchronized void release() {
        int i10 = this.f6591c - 1;
        this.f6591c = i10;
        if (i10 == 0) {
            this.f6590b.release();
        }
    }

    /* renamed from: s */
    public q c(byte[] bArr) {
        return new q(r(this.f6589a), bArr, m0.f205a < 21 && c.f8048d.equals(this.f6589a) && "L3".equals(u("securityLevel")));
    }

    public String u(String str) {
        return this.f6590b.getPropertyString(str);
    }
}
