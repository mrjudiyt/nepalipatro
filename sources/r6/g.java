package r6;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t6.d;
import u6.n;

/* compiled from: GsonBuilder */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private d f16352a = d.f16508n;

    /* renamed from: b  reason: collision with root package name */
    private r f16353b = r.DEFAULT;

    /* renamed from: c  reason: collision with root package name */
    private e f16354c = d.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Type, h<?>> f16355d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final List<t> f16356e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List<t> f16357f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f16358g = false;

    /* renamed from: h  reason: collision with root package name */
    private String f16359h;

    /* renamed from: i  reason: collision with root package name */
    private int f16360i = 2;

    /* renamed from: j  reason: collision with root package name */
    private int f16361j = 2;

    /* renamed from: k  reason: collision with root package name */
    private boolean f16362k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f16363l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f16364m = true;

    /* renamed from: n  reason: collision with root package name */
    private boolean f16365n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f16366o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f16367p = false;

    private void a(String str, int i10, int i11, List<t> list) {
        a aVar;
        a aVar2;
        a aVar3;
        if (str != null && !"".equals(str.trim())) {
            aVar2 = new a(Date.class, str);
            aVar = new a(Timestamp.class, str);
            aVar3 = new a(java.sql.Date.class, str);
        } else if (i10 != 2 && i11 != 2) {
            a aVar4 = new a(Date.class, i10, i11);
            a aVar5 = new a(Timestamp.class, i10, i11);
            a aVar6 = new a(java.sql.Date.class, i10, i11);
            aVar2 = aVar4;
            aVar = aVar5;
            aVar3 = aVar6;
        } else {
            return;
        }
        list.add(n.b(Date.class, aVar2));
        list.add(n.b(Timestamp.class, aVar));
        list.add(n.b(java.sql.Date.class, aVar3));
    }

    public f b() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f16356e.size() + this.f16357f.size() + 3);
        arrayList2.addAll(this.f16356e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f16357f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        a(this.f16359h, this.f16360i, this.f16361j, arrayList2);
        return new f(this.f16352a, this.f16354c, this.f16355d, this.f16358g, this.f16362k, this.f16366o, this.f16364m, this.f16365n, this.f16367p, this.f16363l, this.f16353b, this.f16359h, this.f16360i, this.f16361j, this.f16356e, this.f16357f, arrayList);
    }

    public g c(String str) {
        this.f16359h = str;
        return this;
    }
}
