package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import e1.c;
import e1.e;
import e1.f;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: RoomDatabase */
public abstract class h {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    protected volatile e1.b f4397a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f4398b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f4399c;

    /* renamed from: d  reason: collision with root package name */
    private e1.c f4400d;

    /* renamed from: e  reason: collision with root package name */
    private final e f4401e = e();

    /* renamed from: f  reason: collision with root package name */
    private boolean f4402f;

    /* renamed from: g  reason: collision with root package name */
    boolean f4403g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    protected List<b> f4404h;

    /* renamed from: i  reason: collision with root package name */
    private final ReentrantReadWriteLock f4405i = new ReentrantReadWriteLock();

    /* renamed from: j  reason: collision with root package name */
    private final ThreadLocal<Integer> f4406j = new ThreadLocal<>();

    /* renamed from: k  reason: collision with root package name */
    private final Map<String, Object> f4407k = new ConcurrentHashMap();

    /* compiled from: RoomDatabase */
    public static class a<T extends h> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f4408a;

        /* renamed from: b  reason: collision with root package name */
        private final String f4409b;

        /* renamed from: c  reason: collision with root package name */
        private final Context f4410c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<b> f4411d;

        /* renamed from: e  reason: collision with root package name */
        private Executor f4412e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f4413f;

        /* renamed from: g  reason: collision with root package name */
        private c.C0129c f4414g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f4415h;

        /* renamed from: i  reason: collision with root package name */
        private c f4416i = c.AUTOMATIC;

        /* renamed from: j  reason: collision with root package name */
        private boolean f4417j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f4418k = true;

        /* renamed from: l  reason: collision with root package name */
        private boolean f4419l;

        /* renamed from: m  reason: collision with root package name */
        private final d f4420m = new d();

        /* renamed from: n  reason: collision with root package name */
        private Set<Integer> f4421n;

        /* renamed from: o  reason: collision with root package name */
        private Set<Integer> f4422o;

        /* renamed from: p  reason: collision with root package name */
        private String f4423p;

        /* renamed from: q  reason: collision with root package name */
        private File f4424q;

        a(Context context, Class<T> cls, String str) {
            this.f4410c = context;
            this.f4408a = cls;
            this.f4409b = str;
        }

        public a<T> a(b bVar) {
            if (this.f4411d == null) {
                this.f4411d = new ArrayList<>();
            }
            this.f4411d.add(bVar);
            return this;
        }

        public a<T> b(b1.a... aVarArr) {
            if (this.f4422o == null) {
                this.f4422o = new HashSet();
            }
            for (b1.a aVar : aVarArr) {
                this.f4422o.add(Integer.valueOf(aVar.f4966a));
                this.f4422o.add(Integer.valueOf(aVar.f4967b));
            }
            this.f4420m.b(aVarArr);
            return this;
        }

        public a<T> c() {
            this.f4415h = true;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public T d() {
            Executor executor;
            if (this.f4410c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f4408a != null) {
                Executor executor2 = this.f4412e;
                if (executor2 == null && this.f4413f == null) {
                    Executor f10 = n.c.f();
                    this.f4413f = f10;
                    this.f4412e = f10;
                } else if (executor2 != null && this.f4413f == null) {
                    this.f4413f = executor2;
                } else if (executor2 == null && (executor = this.f4413f) != null) {
                    this.f4412e = executor;
                }
                Set<Integer> set = this.f4422o;
                if (!(set == null || this.f4421n == null)) {
                    for (Integer next : set) {
                        if (this.f4421n.contains(next)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + next);
                        }
                    }
                }
                if (this.f4414g == null) {
                    this.f4414g = new f1.c();
                }
                String str = this.f4423p;
                if (!(str == null && this.f4424q == null)) {
                    if (this.f4409b == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    } else if (str == null || this.f4424q == null) {
                        this.f4414g = new k(str, this.f4424q, this.f4414g);
                    } else {
                        throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                    }
                }
                Context context = this.f4410c;
                String str2 = this.f4409b;
                c.C0129c cVar = this.f4414g;
                d dVar = this.f4420m;
                ArrayList<b> arrayList = this.f4411d;
                boolean z10 = this.f4415h;
                c d10 = this.f4416i.d(context);
                Executor executor3 = this.f4412e;
                Executor executor4 = this.f4413f;
                boolean z11 = this.f4417j;
                boolean z12 = this.f4418k;
                boolean z13 = this.f4419l;
                boolean z14 = z12;
                boolean z15 = z13;
                a aVar = new a(context, str2, cVar, dVar, arrayList, z10, d10, executor3, executor4, z11, z14, z15, this.f4421n, this.f4423p, this.f4424q);
                T t10 = (h) g.b(this.f4408a, "_Impl");
                t10.l(aVar);
                return t10;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        public a<T> e() {
            this.f4418k = false;
            this.f4419l = true;
            return this;
        }

        public a<T> f(c.C0129c cVar) {
            this.f4414g = cVar;
            return this;
        }

        public a<T> g(Executor executor) {
            this.f4412e = executor;
            return this;
        }
    }

    /* compiled from: RoomDatabase */
    public static abstract class b {
        public void a(e1.b bVar) {
        }

        public void b(e1.b bVar) {
        }

        public void c(e1.b bVar) {
        }
    }

    /* compiled from: RoomDatabase */
    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean a(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"NewApi"})
        public c d(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || a(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    /* compiled from: RoomDatabase */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private HashMap<Integer, TreeMap<Integer, b1.a>> f4429a = new HashMap<>();

        private void a(b1.a aVar) {
            int i10 = aVar.f4966a;
            int i11 = aVar.f4967b;
            TreeMap treeMap = this.f4429a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f4429a.put(Integer.valueOf(i10), treeMap);
            }
            b1.a aVar2 = (b1.a) treeMap.get(Integer.valueOf(i11));
            if (aVar2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Overriding migration ");
                sb.append(aVar2);
                sb.append(" with ");
                sb.append(aVar);
            }
            treeMap.put(Integer.valueOf(i11), aVar);
        }

        private List<b1.a> d(List<b1.a> list, boolean z10, int i10, int i11) {
            Set set;
            boolean z11;
            do {
                if (z10) {
                    if (i10 >= i11) {
                        return list;
                    }
                } else if (i10 <= i11) {
                    return list;
                }
                TreeMap treeMap = this.f4429a.get(Integer.valueOf(i10));
                if (treeMap != null) {
                    if (z10) {
                        set = treeMap.descendingKeySet();
                    } else {
                        set = treeMap.keySet();
                    }
                    Iterator it = set.iterator();
                    while (true) {
                        z11 = true;
                        boolean z12 = false;
                        if (!it.hasNext()) {
                            z11 = false;
                            continue;
                            break;
                        }
                        int intValue = ((Integer) it.next()).intValue();
                        if (!z10 ? !(intValue < i11 || intValue >= i10) : !(intValue > i11 || intValue <= i10)) {
                            z12 = true;
                            continue;
                        }
                        if (z12) {
                            list.add(treeMap.get(Integer.valueOf(intValue)));
                            i10 = intValue;
                            continue;
                            break;
                        }
                    }
                } else {
                    return null;
                }
            } while (z11);
            return null;
        }

        public void b(b1.a... aVarArr) {
            for (b1.a a10 : aVarArr) {
                a(a10);
            }
        }

        public List<b1.a> c(int i10, int i11) {
            if (i10 == i11) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i11 > i10, i10, i11);
        }
    }

    private static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f4402f && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!k() && this.f4406j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        e1.b V = this.f4400d.V();
        this.f4401e.m(V);
        V.k();
    }

    public f d(String str) {
        a();
        b();
        return this.f4400d.V().A(str);
    }

    /* access modifiers changed from: protected */
    public abstract e e();

    /* access modifiers changed from: protected */
    public abstract e1.c f(a aVar);

    @Deprecated
    public void g() {
        this.f4400d.V().a0();
        if (!k()) {
            this.f4401e.f();
        }
    }

    /* access modifiers changed from: package-private */
    public Lock h() {
        return this.f4405i.readLock();
    }

    public e1.c i() {
        return this.f4400d;
    }

    public Executor j() {
        return this.f4398b;
    }

    public boolean k() {
        return this.f4400d.V().p0();
    }

    public void l(a aVar) {
        e1.c f10 = f(aVar);
        this.f4400d = f10;
        if (f10 instanceof j) {
            ((j) f10).h(aVar);
        }
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (aVar.f4339g == c.WRITE_AHEAD_LOGGING) {
                z10 = true;
            }
            this.f4400d.setWriteAheadLoggingEnabled(z10);
        }
        this.f4404h = aVar.f4337e;
        this.f4398b = aVar.f4340h;
        this.f4399c = new l(aVar.f4341i);
        this.f4402f = aVar.f4338f;
        this.f4403g = z10;
        if (aVar.f4342j) {
            this.f4401e.i(aVar.f4334b, aVar.f4335c);
        }
    }

    /* access modifiers changed from: protected */
    public void m(e1.b bVar) {
        this.f4401e.d(bVar);
    }

    public boolean o() {
        e1.b bVar = this.f4397a;
        return bVar != null && bVar.isOpen();
    }

    public Cursor p(e eVar) {
        return q(eVar, (CancellationSignal) null);
    }

    public Cursor q(e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal == null || Build.VERSION.SDK_INT < 16) {
            return this.f4400d.V().G0(eVar);
        }
        return this.f4400d.V().M(eVar, cancellationSignal);
    }

    @Deprecated
    public void r() {
        this.f4400d.V().O();
    }
}
