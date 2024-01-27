package e4;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import b6.x;
import c6.b;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.mediacodec.j;
import com.google.android.exoplayer2.w0;
import java.util.ArrayList;
import o5.k;
import x4.f;
import x4.g;

/* compiled from: DefaultRenderersFactory */
public class e implements u {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8071a;

    /* renamed from: b  reason: collision with root package name */
    private int f8072b = 0;

    /* renamed from: c  reason: collision with root package name */
    private long f8073c = 5000;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8074d;

    /* renamed from: e  reason: collision with root package name */
    private j f8075e = j.f6999a;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8076f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f8077g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f8078h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8079i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f8080j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f8081k;

    public e(Context context) {
        this.f8071a = context;
    }

    public w0[] a(Handler handler, x xVar, a aVar, o5.j jVar, f fVar) {
        ArrayList arrayList = new ArrayList();
        h(this.f8071a, this.f8072b, this.f8075e, this.f8074d, handler, xVar, this.f8073c, arrayList);
        AudioSink c10 = c(this.f8071a, this.f8079i, this.f8080j, this.f8081k);
        if (c10 != null) {
            b(this.f8071a, this.f8072b, this.f8075e, this.f8074d, c10, handler, aVar, arrayList);
        }
        ArrayList arrayList2 = arrayList;
        g(this.f8071a, jVar, handler.getLooper(), this.f8072b, arrayList2);
        e(this.f8071a, fVar, handler.getLooper(), this.f8072b, arrayList2);
        d(this.f8071a, this.f8072b, arrayList);
        Handler handler2 = handler;
        f(this.f8071a, handler, this.f8072b, arrayList);
        return (w0[]) arrayList.toArray(new w0[0]);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006c A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a5 A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x0078] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r15, int r16, com.google.android.exoplayer2.mediacodec.j r17, boolean r18, com.google.android.exoplayer2.audio.AudioSink r19, android.os.Handler r20, com.google.android.exoplayer2.audio.a r21, java.util.ArrayList<com.google.android.exoplayer2.w0> r22) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            r9 = r22
            java.lang.String r10 = "DefaultRenderersFactory"
            java.lang.Class<com.google.android.exoplayer2.audio.AudioSink> r11 = com.google.android.exoplayer2.audio.AudioSink.class
            java.lang.Class<com.google.android.exoplayer2.audio.a> r12 = com.google.android.exoplayer2.audio.a.class
            com.google.android.exoplayer2.audio.g r13 = new com.google.android.exoplayer2.audio.g
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r20
            r7 = r21
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            boolean r2 = r1.f8076f
            r13.i0(r2)
            boolean r2 = r1.f8077g
            r13.j0(r2)
            boolean r2 = r1.f8078h
            r13.k0(r2)
            r9.add(r13)
            if (r0 != 0) goto L_0x0031
            return
        L_0x0031:
            int r2 = r22.size()
            r3 = 2
            if (r0 != r3) goto L_0x003a
            int r2 = r2 + -1
        L_0x003a:
            r0 = 0
            r4 = 3
            r5 = 1
            java.lang.String r6 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r0] = r8     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r5] = r12     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r3] = r11     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.reflect.Constructor r6 = r6.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r0] = r20     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r5] = r21     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            r7[r3] = r19     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            java.lang.Object r6 = r6.newInstance(r7)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            com.google.android.exoplayer2.w0 r6 = (com.google.android.exoplayer2.w0) r6     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006c }
            int r7 = r2 + 1
            r9.add(r2, r6)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x006c }
            java.lang.String r2 = "Loaded LibopusAudioRenderer."
            a6.p.f(r10, r2)     // Catch:{ ClassNotFoundException -> 0x006a, Exception -> 0x006c }
            goto L_0x0076
        L_0x006a:
            r2 = r7
            goto L_0x0075
        L_0x006c:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating Opus extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x0075:
            r7 = r2
        L_0x0076:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r6[r0] = r8     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r5] = r12     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r3] = r11     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r0] = r20     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r5] = r21     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            r6[r3] = r19     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            java.lang.Object r2 = r2.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            com.google.android.exoplayer2.w0 r2 = (com.google.android.exoplayer2.w0) r2     // Catch:{ ClassNotFoundException -> 0x00ae, Exception -> 0x00a5 }
            int r6 = r7 + 1
            r9.add(r7, r2)     // Catch:{ ClassNotFoundException -> 0x00a3, Exception -> 0x00a5 }
            java.lang.String r2 = "Loaded LibflacAudioRenderer."
            a6.p.f(r10, r2)     // Catch:{ ClassNotFoundException -> 0x00a3, Exception -> 0x00a5 }
            goto L_0x00af
        L_0x00a3:
            r7 = r6
            goto L_0x00ae
        L_0x00a5:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating FLAC extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x00ae:
            r6 = r7
        L_0x00af:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r0] = r8     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r7[r5] = r12     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r7[r3] = r11     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r4[r0] = r20     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r4[r5] = r21     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r4[r3] = r19     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.Object r0 = r2.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            com.google.android.exoplayer2.w0 r0 = (com.google.android.exoplayer2.w0) r0     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            r9.add(r6, r0)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            a6.p.f(r10, r0)     // Catch:{ ClassNotFoundException -> 0x00e3, Exception -> 0x00da }
            goto L_0x00e3
        L_0x00da:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating FFmpeg extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.e.b(android.content.Context, int, com.google.android.exoplayer2.mediacodec.j, boolean, com.google.android.exoplayer2.audio.AudioSink, android.os.Handler, com.google.android.exoplayer2.audio.a, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    public AudioSink c(Context context, boolean z10, boolean z11, boolean z12) {
        return new DefaultAudioSink(g4.e.c(context), new DefaultAudioSink.d(new AudioProcessor[0]), z10, z11, z12 ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    public void d(Context context, int i10, ArrayList<w0> arrayList) {
        arrayList.add(new b());
    }

    /* access modifiers changed from: protected */
    public void e(Context context, f fVar, Looper looper, int i10, ArrayList<w0> arrayList) {
        arrayList.add(new g(fVar, looper));
    }

    /* access modifiers changed from: protected */
    public void f(Context context, Handler handler, int i10, ArrayList<w0> arrayList) {
    }

    /* access modifiers changed from: protected */
    public void g(Context context, o5.j jVar, Looper looper, int i10, ArrayList<w0> arrayList) {
        arrayList.add(new k(jVar, looper));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0088, code lost:
        throw new java.lang.RuntimeException("Error instantiating VP9 extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0080 A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x0043] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(android.content.Context r16, int r17, com.google.android.exoplayer2.mediacodec.j r18, boolean r19, android.os.Handler r20, b6.x r21, long r22, java.util.ArrayList<com.google.android.exoplayer2.w0> r24) {
        /*
            r15 = this;
            r1 = r15
            r0 = r17
            r11 = r24
            java.lang.String r12 = "DefaultRenderersFactory"
            java.lang.Class<b6.x> r13 = b6.x.class
            b6.g r14 = new b6.g
            r10 = 50
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r22
            r7 = r19
            r8 = r20
            r9 = r21
            r2.<init>(r3, r4, r5, r7, r8, r9, r10)
            boolean r2 = r1.f8076f
            r14.i0(r2)
            boolean r2 = r1.f8077g
            r14.j0(r2)
            boolean r2 = r1.f8078h
            r14.k0(r2)
            r11.add(r14)
            if (r0 != 0) goto L_0x0032
            return
        L_0x0032:
            int r2 = r24.size()
            r3 = 2
            if (r0 != r3) goto L_0x003b
            int r2 = r2 + -1
        L_0x003b:
            r0 = 50
            r4 = 3
            r5 = 0
            r6 = 4
            r7 = 1
            java.lang.String r8 = "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r5] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Class<android.os.Handler> r10 = android.os.Handler.class
            r9[r7] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r3] = r13     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r4] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.reflect.Constructor r8 = r8.getConstructor(r9)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Long r10 = java.lang.Long.valueOf(r22)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r5] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r7] = r20     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r3] = r21     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            r9[r4] = r10     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            java.lang.Object r8 = r8.newInstance(r9)     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            com.google.android.exoplayer2.w0 r8 = (com.google.android.exoplayer2.w0) r8     // Catch:{ ClassNotFoundException -> 0x0089, Exception -> 0x0080 }
            int r9 = r2 + 1
            r11.add(r2, r8)     // Catch:{ ClassNotFoundException -> 0x007e, Exception -> 0x0080 }
            java.lang.String r2 = "Loaded LibvpxVideoRenderer."
            a6.p.f(r12, r2)     // Catch:{ ClassNotFoundException -> 0x007e, Exception -> 0x0080 }
            goto L_0x008a
        L_0x007e:
            r2 = r9
            goto L_0x0089
        L_0x0080:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating VP9 extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x0089:
            r9 = r2
        L_0x008a:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r8[r5] = r10     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Class<android.os.Handler> r10 = android.os.Handler.class
            r8[r7] = r10     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r8[r3] = r13     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r8[r4] = r10     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r8)     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Long r8 = java.lang.Long.valueOf(r22)     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r6[r5] = r8     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r6[r7] = r20     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r6[r3] = r21     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r6[r4] = r0     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.Object r0 = r2.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            com.google.android.exoplayer2.w0 r0 = (com.google.android.exoplayer2.w0) r0     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            r11.add(r9, r0)     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            java.lang.String r0 = "Loaded Libgav1VideoRenderer."
            a6.p.f(r12, r0)     // Catch:{ ClassNotFoundException -> 0x00ce, Exception -> 0x00c5 }
            goto L_0x00ce
        L_0x00c5:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Error instantiating AV1 extension"
            r2.<init>(r3, r0)
            throw r2
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.e.h(android.content.Context, int, com.google.android.exoplayer2.mediacodec.j, boolean, android.os.Handler, b6.x, long, java.util.ArrayList):void");
    }
}
