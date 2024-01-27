package androidx.core.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import androidx.core.util.h;
import java.util.concurrent.Executor;

/* compiled from: FontsContractCompat */
public class g {

    /* compiled from: FontsContractCompat */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f2438a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f2439b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f2438a = i10;
            this.f2439b = bVarArr;
        }

        static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f2439b;
        }

        public int c() {
            return this.f2438a;
        }
    }

    /* compiled from: FontsContractCompat */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f2440a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2441b;

        /* renamed from: c  reason: collision with root package name */
        private final int f2442c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f2443d;

        /* renamed from: e  reason: collision with root package name */
        private final int f2444e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f2440a = (Uri) h.b(uri);
            this.f2441b = i10;
            this.f2442c = i11;
            this.f2443d = z10;
            this.f2444e = i12;
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f2444e;
        }

        public int c() {
            return this.f2441b;
        }

        public Uri d() {
            return this.f2440a;
        }

        public int e() {
            return this.f2442c;
        }

        public boolean f() {
            return this.f2443d;
        }
    }

    /* compiled from: FontsContractCompat */
    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, e eVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        a aVar = new a(cVar, handler);
        if (z10) {
            return f.e(context, eVar, aVar, i10, i11);
        }
        return f.d(context, eVar, i10, (Executor) null, aVar);
    }
}
