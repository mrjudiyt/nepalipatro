package l6;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: Splitter */
public final class s {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final d f15622a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15623b;

    /* renamed from: c  reason: collision with root package name */
    private final c f15624c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f15625d;

    /* compiled from: Splitter */
    class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f15626a;

        /* renamed from: l6.s$a$a  reason: collision with other inner class name */
        /* compiled from: Splitter */
        class C0263a extends b {
            C0263a(s sVar, CharSequence charSequence) {
                super(sVar, charSequence);
            }

            /* access modifiers changed from: package-private */
            public int f(int i10) {
                return i10 + 1;
            }

            /* access modifiers changed from: package-private */
            public int g(int i10) {
                return a.this.f15626a.c(this.f15628j, i10);
            }
        }

        a(d dVar) {
            this.f15626a = dVar;
        }

        /* renamed from: b */
        public b a(s sVar, CharSequence charSequence) {
            return new C0263a(sVar, charSequence);
        }
    }

    /* compiled from: Splitter */
    private static abstract class b extends b<String> {

        /* renamed from: j  reason: collision with root package name */
        final CharSequence f15628j;

        /* renamed from: k  reason: collision with root package name */
        final d f15629k;

        /* renamed from: l  reason: collision with root package name */
        final boolean f15630l;

        /* renamed from: m  reason: collision with root package name */
        int f15631m = 0;

        /* renamed from: n  reason: collision with root package name */
        int f15632n;

        protected b(s sVar, CharSequence charSequence) {
            this.f15629k = sVar.f15622a;
            this.f15630l = sVar.f15623b;
            this.f15632n = sVar.f15625d;
            this.f15628j = charSequence;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public String b() {
            int i10;
            int i11 = this.f15631m;
            while (true) {
                int i12 = this.f15631m;
                if (i12 == -1) {
                    return (String) c();
                }
                int g10 = g(i12);
                if (g10 == -1) {
                    g10 = this.f15628j.length();
                    this.f15631m = -1;
                } else {
                    this.f15631m = f(g10);
                }
                int i13 = this.f15631m;
                if (i13 == i11) {
                    int i14 = i13 + 1;
                    this.f15631m = i14;
                    if (i14 > this.f15628j.length()) {
                        this.f15631m = -1;
                    }
                } else {
                    while (i11 < g10 && this.f15629k.e(this.f15628j.charAt(i11))) {
                        i11++;
                    }
                    while (i10 > i11 && this.f15629k.e(this.f15628j.charAt(i10 - 1))) {
                        g10 = i10 - 1;
                    }
                    if (!this.f15630l || i11 != i10) {
                        int i15 = this.f15632n;
                    } else {
                        i11 = this.f15631m;
                    }
                }
            }
            int i152 = this.f15632n;
            if (i152 == 1) {
                i10 = this.f15628j.length();
                this.f15631m = -1;
                while (i10 > i11 && this.f15629k.e(this.f15628j.charAt(i10 - 1))) {
                    i10--;
                }
            } else {
                this.f15632n = i152 - 1;
            }
            return this.f15628j.subSequence(i11, i10).toString();
        }

        /* access modifiers changed from: package-private */
        public abstract int f(int i10);

        /* access modifiers changed from: package-private */
        public abstract int g(int i10);
    }

    /* compiled from: Splitter */
    private interface c {
        Iterator<String> a(s sVar, CharSequence charSequence);
    }

    private s(c cVar) {
        this(cVar, false, d.f(), Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public static s d(char c10) {
        return e(d.d(c10));
    }

    public static s e(d dVar) {
        p.j(dVar);
        return new s(new a(dVar));
    }

    private Iterator<String> g(CharSequence charSequence) {
        return this.f15624c.a(this, charSequence);
    }

    public List<String> f(CharSequence charSequence) {
        p.j(charSequence);
        Iterator<String> g10 = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g10.hasNext()) {
            arrayList.add(g10.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private s(c cVar, boolean z10, d dVar, int i10) {
        this.f15624c = cVar;
        this.f15623b = z10;
        this.f15622a = dVar;
        this.f15625d = i10;
    }
}
