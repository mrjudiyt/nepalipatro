package k5;

import android.net.Uri;
import f5.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: DashManifest */
public class c implements a<c> {

    /* renamed from: a  reason: collision with root package name */
    public final long f9645a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9646b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9647c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9648d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9649e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9650f;

    /* renamed from: g  reason: collision with root package name */
    public final long f9651g;

    /* renamed from: h  reason: collision with root package name */
    public final long f9652h;

    /* renamed from: i  reason: collision with root package name */
    public final o f9653i;

    /* renamed from: j  reason: collision with root package name */
    public final l f9654j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f9655k;

    /* renamed from: l  reason: collision with root package name */
    public final h f9656l;

    /* renamed from: m  reason: collision with root package name */
    private final List<g> f9657m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        this.f9645a = j10;
        this.f9646b = j11;
        this.f9647c = j12;
        this.f9648d = z10;
        this.f9649e = j13;
        this.f9650f = j14;
        this.f9651g = j15;
        this.f9652h = j16;
        this.f9656l = hVar;
        this.f9653i = oVar;
        this.f9655k = uri;
        this.f9654j = lVar;
        this.f9657m = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<a> c(List<a> list, LinkedList<f5.c> linkedList) {
        f5.c poll = linkedList.poll();
        int i10 = poll.f8529h;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i11 = poll.f8530i;
            a aVar = list.get(i11);
            List<j> list2 = aVar.f9637c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f8531j));
                poll = linkedList.poll();
                if (!(poll.f8529h == i10 && poll.f8530i == i11)) {
                    arrayList.add(new a(aVar.f9635a, aVar.f9636b, arrayList2, aVar.f9638d, aVar.f9639e, aVar.f9640f));
                }
                arrayList2.add(list2.get(poll.f8531j));
                poll = linkedList.poll();
                break;
            } while (poll.f8530i == i11);
            arrayList.add(new a(aVar.f9635a, aVar.f9636b, arrayList2, aVar.f9638d, aVar.f9639e, aVar.f9640f));
        } while (poll.f8529h == i10);
        linkedList.addFirst(poll);
        return arrayList;
    }

    /* renamed from: b */
    public final c a(List<f5.c> list) {
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new f5.c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i10 >= e()) {
                break;
            }
            if (((f5.c) linkedList.peek()).f8529h != i10) {
                long f10 = f(i10);
                if (f10 != -9223372036854775807L) {
                    j11 += f10;
                }
            } else {
                g d10 = d(i10);
                arrayList.add(new g(d10.f9678a, d10.f9679b - j11, c(d10.f9680c, linkedList), d10.f9681d));
            }
            i10++;
        }
        long j12 = this.f9646b;
        if (j12 != -9223372036854775807L) {
            j10 = j12 - j11;
        }
        return new c(this.f9645a, j10, this.f9647c, this.f9648d, this.f9649e, this.f9650f, this.f9651g, this.f9652h, this.f9656l, this.f9653i, this.f9654j, this.f9655k, arrayList);
    }

    public final g d(int i10) {
        return this.f9657m.get(i10);
    }

    public final int e() {
        return this.f9657m.size();
    }

    public final long f(int i10) {
        if (i10 != this.f9657m.size() - 1) {
            return this.f9657m.get(i10 + 1).f9679b - this.f9657m.get(i10).f9679b;
        }
        long j10 = this.f9646b;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - this.f9657m.get(i10).f9679b;
    }

    public final long g(int i10) {
        return e4.c.d(f(i10));
    }
}
