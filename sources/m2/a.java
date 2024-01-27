package m2;

import e2.f;
import f2.j;
import java.io.InputStream;
import l2.g;
import l2.m;
import l2.n;
import l2.o;
import l2.r;

/* compiled from: HttpGlideUrlLoader */
public class a implements n<g, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final f<Integer> f10190b = f.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a  reason: collision with root package name */
    private final m<g, g> f10191a;

    /* renamed from: m2.a$a  reason: collision with other inner class name */
    /* compiled from: HttpGlideUrlLoader */
    public static class C0168a implements o<g, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final m<g, g> f10192a = new m<>(500);

        public n<g, InputStream> a(r rVar) {
            return new a(this.f10192a);
        }
    }

    public a(m<g, g> mVar) {
        this.f10191a = mVar;
    }

    /* renamed from: c */
    public n.a<InputStream> b(g gVar, int i10, int i11, e2.g gVar2) {
        m<g, g> mVar = this.f10191a;
        if (mVar != null) {
            g a10 = mVar.a(gVar, 0, 0);
            if (a10 == null) {
                this.f10191a.b(gVar, 0, 0, gVar);
            } else {
                gVar = a10;
            }
        }
        return new n.a<>(gVar, new j(gVar, ((Integer) gVar2.c(f10190b)).intValue()));
    }

    /* renamed from: d */
    public boolean a(g gVar) {
        return true;
    }
}
