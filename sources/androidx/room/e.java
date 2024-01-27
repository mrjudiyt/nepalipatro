package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import e1.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* compiled from: InvalidationTracker */
public class e {

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f4352m = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    final HashMap<String, Integer> f4353a;

    /* renamed from: b  reason: collision with root package name */
    final String[] f4354b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Set<String>> f4355c;

    /* renamed from: d  reason: collision with root package name */
    final h f4356d;

    /* renamed from: e  reason: collision with root package name */
    AtomicBoolean f4357e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f4358f = false;

    /* renamed from: g  reason: collision with root package name */
    volatile f f4359g;

    /* renamed from: h  reason: collision with root package name */
    private b f4360h;

    /* renamed from: i  reason: collision with root package name */
    private final d f4361i;
    @SuppressLint({"RestrictedApi"})

    /* renamed from: j  reason: collision with root package name */
    final o.b<c, d> f4362j = new o.b<>();

    /* renamed from: k  reason: collision with root package name */
    private f f4363k;

    /* renamed from: l  reason: collision with root package name */
    Runnable f4364l = new a();

    /* compiled from: InvalidationTracker */
    class a implements Runnable {
        a() {
        }

        /* JADX INFO: finally extract failed */
        private Set<Integer> a() {
            HashSet hashSet = new HashSet();
            Cursor p10 = e.this.f4356d.p(new e1.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (p10.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(p10.getInt(0)));
                } catch (Throwable th) {
                    p10.close();
                    throw th;
                }
            }
            p10.close();
            if (!hashSet.isEmpty()) {
                e.this.f4359g.z();
            }
            return hashSet;
        }

        public void run() {
            e1.b V;
            Lock h10 = e.this.f4356d.h();
            Set<Integer> set = null;
            try {
                h10.lock();
                if (!e.this.c()) {
                    h10.unlock();
                } else if (!e.this.f4357e.compareAndSet(true, false)) {
                    h10.unlock();
                } else if (e.this.f4356d.k()) {
                    h10.unlock();
                } else {
                    h hVar = e.this.f4356d;
                    if (hVar.f4403g) {
                        V = hVar.i().V();
                        V.k();
                        set = a();
                        V.O();
                        V.a0();
                    } else {
                        set = a();
                    }
                    h10.unlock();
                    if (set != null && !set.isEmpty()) {
                        synchronized (e.this.f4362j) {
                            Iterator<Map.Entry<c, d>> it = e.this.f4362j.iterator();
                            while (it.hasNext()) {
                                ((d) it.next().getValue()).a(set);
                            }
                        }
                    }
                }
            } catch (SQLiteException | IllegalStateException unused) {
            } catch (Throwable th) {
                h10.unlock();
                throw th;
            }
        }
    }

    /* compiled from: InvalidationTracker */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final long[] f4366a;

        /* renamed from: b  reason: collision with root package name */
        final boolean[] f4367b;

        /* renamed from: c  reason: collision with root package name */
        final int[] f4368c;

        /* renamed from: d  reason: collision with root package name */
        boolean f4369d;

        /* renamed from: e  reason: collision with root package name */
        boolean f4370e;

        b(int i10) {
            long[] jArr = new long[i10];
            this.f4366a = jArr;
            boolean[] zArr = new boolean[i10];
            this.f4367b = zArr;
            this.f4368c = new int[i10];
            Arrays.fill(jArr, 0);
            Arrays.fill(zArr, false);
        }

        /* access modifiers changed from: package-private */
        public int[] a() {
            synchronized (this) {
                if (this.f4369d) {
                    if (!this.f4370e) {
                        int length = this.f4366a.length;
                        int i10 = 0;
                        while (true) {
                            int i11 = 1;
                            if (i10 < length) {
                                boolean z10 = this.f4366a[i10] > 0;
                                boolean[] zArr = this.f4367b;
                                if (z10 != zArr[i10]) {
                                    int[] iArr = this.f4368c;
                                    if (!z10) {
                                        i11 = 2;
                                    }
                                    iArr[i10] = i11;
                                } else {
                                    this.f4368c[i10] = 0;
                                }
                                zArr[i10] = z10;
                                i10++;
                            } else {
                                this.f4370e = true;
                                this.f4369d = false;
                                int[] iArr2 = this.f4368c;
                                return iArr2;
                            }
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f4366a;
                    long j10 = jArr[i10];
                    jArr[i10] = 1 + j10;
                    if (j10 == 0) {
                        this.f4369d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        /* access modifiers changed from: package-private */
        public boolean c(int... iArr) {
            boolean z10;
            synchronized (this) {
                z10 = false;
                for (int i10 : iArr) {
                    long[] jArr = this.f4366a;
                    long j10 = jArr[i10];
                    jArr[i10] = j10 - 1;
                    if (j10 == 1) {
                        this.f4369d = true;
                        z10 = true;
                    }
                }
            }
            return z10;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            synchronized (this) {
                this.f4370e = false;
            }
        }
    }

    /* compiled from: InvalidationTracker */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String[] f4371a;

        public c(String[] strArr) {
            this.f4371a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return false;
        }

        public abstract void b(Set<String> set);
    }

    /* compiled from: InvalidationTracker */
    static class d {

        /* renamed from: a  reason: collision with root package name */
        final int[] f4372a;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f4373b;

        /* renamed from: c  reason: collision with root package name */
        final c f4374c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<String> f4375d;

        d(c cVar, int[] iArr, String[] strArr) {
            this.f4374c = cVar;
            this.f4372a = iArr;
            this.f4373b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                this.f4375d = Collections.unmodifiableSet(hashSet);
                return;
            }
            this.f4375d = null;
        }

        /* access modifiers changed from: package-private */
        public void a(Set<Integer> set) {
            int length = this.f4372a.length;
            Set set2 = null;
            for (int i10 = 0; i10 < length; i10++) {
                if (set.contains(Integer.valueOf(this.f4372a[i10]))) {
                    if (length == 1) {
                        set2 = this.f4375d;
                    } else {
                        if (set2 == null) {
                            set2 = new HashSet(length);
                        }
                        set2.add(this.f4373b[i10]);
                    }
                }
            }
            if (set2 != null) {
                this.f4374c.b(set2);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(String[] strArr) {
            Set<String> set = null;
            if (this.f4373b.length == 1) {
                int length = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    } else if (strArr[i10].equalsIgnoreCase(this.f4373b[0])) {
                        set = this.f4375d;
                        break;
                    } else {
                        i10++;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f4373b;
                    int length2 = strArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            break;
                        }
                        String str2 = strArr2[i11];
                        if (str2.equalsIgnoreCase(str)) {
                            hashSet.add(str2);
                            break;
                        }
                        i11++;
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f4374c.b(set);
            }
        }
    }

    public e(h hVar, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.f4356d = hVar;
        this.f4360h = new b(strArr.length);
        this.f4353a = new HashMap<>();
        this.f4355c = map2;
        this.f4361i = new d(hVar);
        int length = strArr.length;
        this.f4354b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f4353a.put(lowerCase, Integer.valueOf(i10));
            String str2 = map.get(strArr[i10]);
            if (str2 != null) {
                this.f4354b[i10] = str2.toLowerCase(locale);
            } else {
                this.f4354b[i10] = lowerCase;
            }
        }
        for (Map.Entry next : map.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) next.getValue()).toLowerCase(locale2);
            if (this.f4353a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) next.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap = this.f4353a;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    private static void b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    private String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f4355c.containsKey(lowerCase)) {
                hashSet.addAll(this.f4355c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void j(e1.b bVar, int i10) {
        bVar.t("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f4354b[i10];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f4352m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i10);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.t(sb.toString());
        }
    }

    private void k(e1.b bVar, int i10) {
        String str = this.f4354b[i10];
        StringBuilder sb = new StringBuilder();
        for (String b10 : f4352m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            b(sb, str, b10);
            bVar.t(sb.toString());
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void a(c cVar) {
        d f10;
        String[] h10 = h(cVar.f4371a);
        int[] iArr = new int[h10.length];
        int length = h10.length;
        int i10 = 0;
        while (i10 < length) {
            Integer num = this.f4353a.get(h10[i10].toLowerCase(Locale.US));
            if (num != null) {
                iArr[i10] = num.intValue();
                i10++;
            } else {
                throw new IllegalArgumentException("There is no table with name " + h10[i10]);
            }
        }
        d dVar = new d(cVar, iArr, h10);
        synchronized (this.f4362j) {
            f10 = this.f4362j.f(cVar, dVar);
        }
        if (f10 == null && this.f4360h.b(iArr)) {
            l();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        if (!this.f4356d.o()) {
            return false;
        }
        if (!this.f4358f) {
            this.f4356d.i().V();
        }
        if (!this.f4358f) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void d(e1.b bVar) {
        synchronized (this) {
            if (!this.f4358f) {
                bVar.t("PRAGMA temp_store = MEMORY;");
                bVar.t("PRAGMA recursive_triggers='ON';");
                bVar.t("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                m(bVar);
                this.f4359g = bVar.A("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                this.f4358f = true;
            }
        }
    }

    public void e(String... strArr) {
        synchronized (this.f4362j) {
            Iterator<Map.Entry<c, d>> it = this.f4362j.iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (!((c) next.getKey()).a()) {
                    ((d) next.getValue()).b(strArr);
                }
            }
        }
    }

    public void f() {
        if (this.f4357e.compareAndSet(false, true)) {
            this.f4356d.j().execute(this.f4364l);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public void g(c cVar) {
        d g10;
        synchronized (this.f4362j) {
            g10 = this.f4362j.g(cVar);
        }
        if (g10 != null && this.f4360h.c(g10.f4372a)) {
            l();
        }
    }

    /* access modifiers changed from: package-private */
    public void i(Context context, String str) {
        this.f4363k = new f(context, str, this, this.f4356d.j());
    }

    /* access modifiers changed from: package-private */
    public void l() {
        if (this.f4356d.o()) {
            m(this.f4356d.i().V());
        }
    }

    /* access modifiers changed from: package-private */
    public void m(e1.b bVar) {
        if (!bVar.p0()) {
            while (true) {
                try {
                    Lock h10 = this.f4356d.h();
                    h10.lock();
                    try {
                        int[] a10 = this.f4360h.a();
                        if (a10 == null) {
                            h10.unlock();
                            return;
                        }
                        int length = a10.length;
                        bVar.k();
                        for (int i10 = 0; i10 < length; i10++) {
                            int i11 = a10[i10];
                            if (i11 == 1) {
                                j(bVar, i10);
                            } else if (i11 == 2) {
                                k(bVar, i10);
                            }
                        }
                        bVar.O();
                        bVar.a0();
                        this.f4360h.d();
                        h10.unlock();
                    } catch (Throwable th) {
                        h10.unlock();
                        throw th;
                    }
                } catch (SQLiteException | IllegalStateException unused) {
                    return;
                }
            }
        }
    }
}
