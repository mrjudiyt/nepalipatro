package u4;

import a6.y;
import android.util.SparseArray;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Collections;
import java.util.List;
import k4.k;

/* compiled from: TsPayloadReader */
public interface i0 {

    /* compiled from: TsPayloadReader */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f11869a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11870b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f11871c;

        public a(String str, int i10, byte[] bArr) {
            this.f11869a = str;
            this.f11870b = i10;
            this.f11871c = bArr;
        }
    }

    /* compiled from: TsPayloadReader */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f11872a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11873b;

        /* renamed from: c  reason: collision with root package name */
        public final List<a> f11874c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f11875d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            List<a> list2;
            this.f11872a = i10;
            this.f11873b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f11874c = list2;
            this.f11875d = bArr;
        }
    }

    /* compiled from: TsPayloadReader */
    public interface c {
        i0 a(int i10, b bVar);

        SparseArray<i0> b();
    }

    /* compiled from: TsPayloadReader */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f11876a;

        /* renamed from: b  reason: collision with root package name */
        private final int f11877b;

        /* renamed from: c  reason: collision with root package name */
        private final int f11878c;

        /* renamed from: d  reason: collision with root package name */
        private int f11879d;

        /* renamed from: e  reason: collision with root package name */
        private String f11880e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        private void d() {
            if (this.f11879d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f11879d;
            int i11 = i10 == Integer.MIN_VALUE ? this.f11877b : i10 + this.f11878c;
            this.f11879d = i11;
            String str = this.f11876a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
            sb.append(str);
            sb.append(i11);
            this.f11880e = sb.toString();
        }

        public String b() {
            d();
            return this.f11880e;
        }

        public int c() {
            d();
            return this.f11879d;
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(12);
                sb.append(i10);
                sb.append(RemoteSettings.FORWARD_SLASH_STRING);
                str = sb.toString();
            } else {
                str = "";
            }
            this.f11876a = str;
            this.f11877b = i11;
            this.f11878c = i12;
            this.f11879d = Integer.MIN_VALUE;
            this.f11880e = "";
        }
    }

    void a(y yVar, int i10);

    void b();

    void c(a6.i0 i0Var, k kVar, d dVar);
}
