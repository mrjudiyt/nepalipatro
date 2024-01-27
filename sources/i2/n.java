package i2;

import a3.k;
import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy */
public class n implements l {

    /* renamed from: d  reason: collision with root package name */
    private static final Bitmap.Config[] f9263d;

    /* renamed from: e  reason: collision with root package name */
    private static final Bitmap.Config[] f9264e;

    /* renamed from: f  reason: collision with root package name */
    private static final Bitmap.Config[] f9265f = {Bitmap.Config.RGB_565};

    /* renamed from: g  reason: collision with root package name */
    private static final Bitmap.Config[] f9266g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h  reason: collision with root package name */
    private static final Bitmap.Config[] f9267h = {Bitmap.Config.ALPHA_8};

    /* renamed from: a  reason: collision with root package name */
    private final c f9268a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final h<b, Bitmap> f9269b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f9270c = new HashMap();

    /* compiled from: SizeConfigStrategy */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9271a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9271a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9271a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9271a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9271a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i2.n.a.<clinit>():void");
        }
    }

    /* compiled from: SizeConfigStrategy */
    static final class b implements m {

        /* renamed from: a  reason: collision with root package name */
        private final c f9272a;

        /* renamed from: b  reason: collision with root package name */
        int f9273b;

        /* renamed from: c  reason: collision with root package name */
        private Bitmap.Config f9274c;

        public b(c cVar) {
            this.f9272a = cVar;
        }

        public void a() {
            this.f9272a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f9273b = i10;
            this.f9274c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f9273b != bVar.f9273b || !k.d(this.f9274c, bVar.f9274c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i10 = this.f9273b * 31;
            Bitmap.Config config = this.f9274c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return n.i(this.f9273b, this.f9274c);
        }
    }

    /* compiled from: SizeConfigStrategy */
    static class c extends d<b> {
        c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f9263d = configArr;
        f9264e = configArr;
    }

    private void g(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> k10 = k(bitmap.getConfig());
        Integer num2 = (Integer) k10.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + f(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            k10.remove(num);
        } else {
            k10.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private b h(int i10, Bitmap.Config config) {
        b e10 = this.f9268a.e(i10, config);
        Bitmap.Config[] j10 = j(config);
        int length = j10.length;
        int i11 = 0;
        while (i11 < length) {
            Bitmap.Config config2 = j10[i11];
            Integer ceilingKey = k(config2).ceilingKey(Integer.valueOf(i10));
            if (ceilingKey == null || ceilingKey.intValue() > i10 * 8) {
                i11++;
            } else {
                if (ceilingKey.intValue() == i10) {
                    if (config2 == null) {
                        if (config == null) {
                            return e10;
                        }
                    } else if (config2.equals(config)) {
                        return e10;
                    }
                }
                this.f9268a.c(e10);
                return this.f9268a.e(ceilingKey.intValue(), config2);
            }
        }
        return e10;
    }

    static String i(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f9264e;
        }
        int i10 = a.f9271a[config.ordinal()];
        if (i10 == 1) {
            return f9263d;
        }
        if (i10 == 2) {
            return f9265f;
        }
        if (i10 == 3) {
            return f9266g;
        }
        if (i10 == 4) {
            return f9267h;
        }
        return new Bitmap.Config[]{config};
    }

    private NavigableMap<Integer, Integer> k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f9270c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f9270c.put(config, treeMap);
        return treeMap;
    }

    public Bitmap a() {
        Bitmap f10 = this.f9269b.f();
        if (f10 != null) {
            g(Integer.valueOf(k.h(f10)), f10);
        }
        return f10;
    }

    public String b(int i10, int i11, Bitmap.Config config) {
        return i(k.g(i10, i11, config), config);
    }

    public void c(Bitmap bitmap) {
        b e10 = this.f9268a.e(k.h(bitmap), bitmap.getConfig());
        this.f9269b.d(e10, bitmap);
        NavigableMap<Integer, Integer> k10 = k(bitmap.getConfig());
        Integer num = (Integer) k10.get(Integer.valueOf(e10.f9273b));
        Integer valueOf = Integer.valueOf(e10.f9273b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        k10.put(valueOf, Integer.valueOf(i10));
    }

    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        b h10 = h(k.g(i10, i11, config), config);
        Bitmap a10 = this.f9269b.a(h10);
        if (a10 != null) {
            g(Integer.valueOf(h10.f9273b), a10);
            a10.reconfigure(i10, i11, config);
        }
        return a10;
    }

    public int e(Bitmap bitmap) {
        return k.h(bitmap);
    }

    public String f(Bitmap bitmap) {
        return i(k.h(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f9269b);
        sb.append(", sortedSizes=(");
        for (Map.Entry next : this.f9270c.entrySet()) {
            sb.append(next.getKey());
            sb.append('[');
            sb.append(next.getValue());
            sb.append("], ");
        }
        if (!this.f9270c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
