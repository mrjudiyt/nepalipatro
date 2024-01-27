package v5;

import a6.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import o5.a;

/* compiled from: TtmlNode */
final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f12434a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12435b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12436c;

    /* renamed from: d  reason: collision with root package name */
    public final long f12437d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12438e;

    /* renamed from: f  reason: collision with root package name */
    public final g f12439f;

    /* renamed from: g  reason: collision with root package name */
    private final String[] f12440g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12441h;

    /* renamed from: i  reason: collision with root package name */
    public final String f12442i;

    /* renamed from: j  reason: collision with root package name */
    public final d f12443j;

    /* renamed from: k  reason: collision with root package name */
    private final HashMap<String, Integer> f12444k;

    /* renamed from: l  reason: collision with root package name */
    private final HashMap<String, Integer> f12445l;

    /* renamed from: m  reason: collision with root package name */
    private List<d> f12446m;

    private d(String str, String str2, long j10, long j11, g gVar, String[] strArr, String str3, String str4, d dVar) {
        this.f12434a = str;
        this.f12435b = str2;
        this.f12442i = str4;
        this.f12439f = gVar;
        this.f12440g = strArr;
        this.f12436c = str2 != null;
        this.f12437d = j10;
        this.f12438e = j11;
        this.f12441h = (String) a.e(str3);
        this.f12443j = dVar;
        this.f12444k = new HashMap<>();
        this.f12445l = new HashMap<>();
    }

    private void b(Map<String, g> map, a.b bVar, int i10, int i11, int i12) {
        g f10 = f.f(this.f12439f, this.f12440g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.d();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.n(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (f10 != null) {
            f.a(spannableStringBuilder2, i10, i11, f10, this.f12443j, map, i12);
            if ("p".equals(this.f12434a)) {
                if (f10.k() != Float.MAX_VALUE) {
                    bVar.l((f10.k() * -90.0f) / 100.0f);
                }
                if (f10.m() != null) {
                    bVar.o(f10.m());
                }
                if (f10.h() != null) {
                    bVar.i(f10.h());
                }
            }
        }
    }

    public static d c(String str, long j10, long j11, g gVar, String[] strArr, String str2, String str3, d dVar) {
        return new d(str, (String) null, j10, j11, gVar, strArr, str2, str3, dVar);
    }

    public static d d(String str) {
        return new d((String) null, f.b(str), -9223372036854775807L, -9223372036854775807L, (g) null, (String[]) null, "", (String) null, (d) null);
    }

    private static void e(SpannableStringBuilder spannableStringBuilder) {
        for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), "");
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                int i12 = i11;
                while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                    i12++;
                }
                int i13 = i12 - i11;
                if (i13 > 0) {
                    spannableStringBuilder.delete(i10, i13 + i10);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
            if (spannableStringBuilder.charAt(i14) == 10) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
            if (spannableStringBuilder.charAt(i16) == ' ') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == 10) {
                    spannableStringBuilder.delete(i16, i17);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    private void i(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = "p".equals(this.f12434a);
        boolean equals2 = "div".equals(this.f12434a);
        if (z10 || equals || (equals2 && this.f12442i != null)) {
            long j10 = this.f12437d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f12438e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f12446m != null) {
            for (int i10 = 0; i10 < this.f12446m.size(); i10++) {
                this.f12446m.get(i10).i(treeSet, z10 || equals);
            }
        }
    }

    private static SpannableStringBuilder k(String str, Map<String, a.b> map) {
        if (!map.containsKey(str)) {
            a.b bVar = new a.b();
            bVar.n(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) a6.a.e(map.get(str).d());
    }

    private void n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f12441h)) {
            str = this.f12441h;
        }
        if (!m(j10) || !"div".equals(this.f12434a) || this.f12442i == null) {
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).n(j10, str, list);
            }
            return;
        }
        list.add(new Pair(str, this.f12442i));
    }

    private void o(long j10, Map<String, g> map, Map<String, e> map2, String str, Map<String, a.b> map3) {
        int i10;
        if (m(j10)) {
            String str2 = "".equals(this.f12441h) ? str : this.f12441h;
            Iterator<Map.Entry<String, Integer>> it = this.f12445l.entrySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str3 = (String) next.getKey();
                int intValue = this.f12444k.containsKey(str3) ? this.f12444k.get(str3).intValue() : 0;
                int intValue2 = ((Integer) next.getValue()).intValue();
                if (intValue != intValue2) {
                    b(map, (a.b) a6.a.e(map3.get(str3)), intValue, intValue2, ((e) a6.a.e(map2.get(str2))).f12456j);
                } else {
                    Map<String, e> map4 = map2;
                    Map<String, a.b> map5 = map3;
                }
            }
            Map<String, e> map6 = map2;
            Map<String, a.b> map7 = map3;
            while (i10 < g()) {
                f(i10).o(j10, map, map2, str2, map3);
                i10++;
                Map<String, e> map8 = map2;
            }
        }
    }

    private void p(long j10, boolean z10, String str, Map<String, a.b> map) {
        this.f12444k.clear();
        this.f12445l.clear();
        if (!"metadata".equals(this.f12434a)) {
            if (!"".equals(this.f12441h)) {
                str = this.f12441h;
            }
            if (this.f12436c && z10) {
                k(str, map).append((CharSequence) a6.a.e(this.f12435b));
            } else if ("br".equals(this.f12434a) && z10) {
                k(str, map).append(10);
            } else if (m(j10)) {
                for (Map.Entry next : map.entrySet()) {
                    this.f12444k.put((String) next.getKey(), Integer.valueOf(((CharSequence) a6.a.e(((a.b) next.getValue()).d())).length()));
                }
                boolean equals = "p".equals(this.f12434a);
                for (int i10 = 0; i10 < g(); i10++) {
                    f(i10).p(j10, z10 || equals, str, map);
                }
                if (equals) {
                    f.c(k(str, map));
                }
                for (Map.Entry next2 : map.entrySet()) {
                    this.f12445l.put((String) next2.getKey(), Integer.valueOf(((CharSequence) a6.a.e(((a.b) next2.getValue()).d())).length()));
                }
            }
        }
    }

    public void a(d dVar) {
        if (this.f12446m == null) {
            this.f12446m = new ArrayList();
        }
        this.f12446m.add(dVar);
    }

    public d f(int i10) {
        List<d> list = this.f12446m;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<d> list = this.f12446m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<o5.a> h(long j10, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        ArrayList<Pair> arrayList = new ArrayList<>();
        n(j10, this.f12441h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j11 = j10;
        p(j11, false, this.f12441h, treeMap);
        o(j11, map, map2, this.f12441h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) a6.a.e(map2.get(pair.first));
                arrayList2.add(new a.b().e(decodeByteArray).j(eVar.f12448b).k(0).g(eVar.f12449c, 0).h(eVar.f12451e).m(eVar.f12452f).f(eVar.f12453g).q(eVar.f12456j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) a6.a.e(map2.get(entry.getKey()));
            a.b bVar = (a.b) entry.getValue();
            e((SpannableStringBuilder) a6.a.e(bVar.d()));
            bVar.g(eVar2.f12449c, eVar2.f12450d);
            bVar.h(eVar2.f12451e);
            bVar.j(eVar2.f12448b);
            bVar.m(eVar2.f12452f);
            bVar.p(eVar2.f12455i, eVar2.f12454h);
            bVar.q(eVar2.f12456j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f12440g;
    }

    public boolean m(long j10) {
        long j11 = this.f12437d;
        return (j11 == -9223372036854775807L && this.f12438e == -9223372036854775807L) || (j11 <= j10 && this.f12438e == -9223372036854775807L) || ((j11 == -9223372036854775807L && j10 < this.f12438e) || (j11 <= j10 && j10 < this.f12438e));
    }
}
