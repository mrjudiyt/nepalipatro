package v7;

import ea.f;
import ea.h;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: RequestBody */
public abstract class w {

    /* compiled from: RequestBody */
    static class a extends w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f16937a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f16938b;

        a(s sVar, h hVar) {
            this.f16937a = sVar;
            this.f16938b = hVar;
        }

        public long a() {
            return (long) this.f16938b.u();
        }

        public s b() {
            return this.f16937a;
        }

        public void g(f fVar) {
            fVar.u0(this.f16938b);
        }
    }

    /* compiled from: RequestBody */
    static class b extends w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f16939a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f16940b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ byte[] f16941c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f16942d;

        b(s sVar, int i10, byte[] bArr, int i11) {
            this.f16939a = sVar;
            this.f16940b = i10;
            this.f16941c = bArr;
            this.f16942d = i11;
        }

        public long a() {
            return (long) this.f16940b;
        }

        public s b() {
            return this.f16939a;
        }

        public void g(f fVar) {
            fVar.Z(this.f16941c, this.f16942d, this.f16940b);
        }
    }

    public static w c(s sVar, h hVar) {
        return new a(sVar, hVar);
    }

    public static w d(s sVar, String str) {
        Charset charset = w7.h.f17016c;
        if (sVar != null) {
            Charset a10 = sVar.a();
            if (a10 == null) {
                sVar = s.c(sVar + "; charset=utf-8");
            } else {
                charset = a10;
            }
        }
        return e(sVar, str.getBytes(charset));
    }

    public static w e(s sVar, byte[] bArr) {
        return f(sVar, bArr, 0, bArr.length);
    }

    public static w f(s sVar, byte[] bArr, int i10, int i11) {
        Objects.requireNonNull(bArr, "content == null");
        w7.h.a((long) bArr.length, (long) i10, (long) i11);
        return new b(sVar, i11, bArr, i10);
    }

    public abstract long a();

    public abstract s b();

    public abstract void g(f fVar);
}
