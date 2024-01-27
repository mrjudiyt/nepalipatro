package o1;

import android.text.TextUtils;
import androidx.work.f;
import androidx.work.m;
import androidx.work.p;
import androidx.work.u;
import androidx.work.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import w1.b;

/* compiled from: WorkContinuationImpl */
public class g extends u {

    /* renamed from: j  reason: collision with root package name */
    private static final String f10307j = m.f("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    private final i f10308a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10309b;

    /* renamed from: c  reason: collision with root package name */
    private final f f10310c;

    /* renamed from: d  reason: collision with root package name */
    private final List<? extends x> f10311d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f10312e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f10313f;

    /* renamed from: g  reason: collision with root package name */
    private final List<g> f10314g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10315h;

    /* renamed from: i  reason: collision with root package name */
    private p f10316i;

    public g(i iVar, List<? extends x> list) {
        this(iVar, (String) null, f.KEEP, list, (List<g>) null);
    }

    private static boolean i(g gVar, Set<String> set) {
        set.addAll(gVar.c());
        Set<String> l10 = l(gVar);
        for (String contains : set) {
            if (l10.contains(contains)) {
                return true;
            }
        }
        List<g> e10 = gVar.e();
        if (e10 != null && !e10.isEmpty()) {
            for (g i10 : e10) {
                if (i(i10, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set<String> l(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> e10 = gVar.e();
        if (e10 != null && !e10.isEmpty()) {
            for (g c10 : e10) {
                hashSet.addAll(c10.c());
            }
        }
        return hashSet;
    }

    public p a() {
        if (!this.f10315h) {
            b bVar = new b(this);
            this.f10308a.r().b(bVar);
            this.f10316i = bVar.d();
        } else {
            m.c().h(f10307j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f10312e)}), new Throwable[0]);
        }
        return this.f10316i;
    }

    public f b() {
        return this.f10310c;
    }

    public List<String> c() {
        return this.f10312e;
    }

    public String d() {
        return this.f10309b;
    }

    public List<g> e() {
        return this.f10314g;
    }

    public List<? extends x> f() {
        return this.f10311d;
    }

    public i g() {
        return this.f10308a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f10315h;
    }

    public void k() {
        this.f10315h = true;
    }

    public g(i iVar, String str, f fVar, List<? extends x> list) {
        this(iVar, str, fVar, list, (List<g>) null);
    }

    public g(i iVar, String str, f fVar, List<? extends x> list, List<g> list2) {
        this.f10308a = iVar;
        this.f10309b = str;
        this.f10310c = fVar;
        this.f10311d = list;
        this.f10314g = list2;
        this.f10312e = new ArrayList(list.size());
        this.f10313f = new ArrayList();
        if (list2 != null) {
            for (g gVar : list2) {
                this.f10313f.addAll(gVar.f10313f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String a10 = ((x) list.get(i10)).a();
            this.f10312e.add(a10);
            this.f10313f.add(a10);
        }
    }
}
