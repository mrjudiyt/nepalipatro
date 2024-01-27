package k5;

import java.util.Collections;
import java.util.List;

/* compiled from: Period */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f9678a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9679b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f9680c;

    /* renamed from: d  reason: collision with root package name */
    public final List<f> f9681d;

    /* renamed from: e  reason: collision with root package name */
    public final e f9682e;

    public g(String str, long j10, List<a> list, List<f> list2) {
        this(str, j10, list, list2, (e) null);
    }

    public int a(int i10) {
        int size = this.f9680c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f9680c.get(i11).f9636b == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g(String str, long j10, List<a> list, List<f> list2, e eVar) {
        this.f9678a = str;
        this.f9679b = j10;
        this.f9680c = Collections.unmodifiableList(list);
        this.f9681d = Collections.unmodifiableList(list2);
        this.f9682e = eVar;
    }
}
