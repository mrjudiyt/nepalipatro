package androidx.room;

import android.content.Context;
import androidx.room.h;
import e1.c;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: DatabaseConfiguration */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final c.C0129c f4333a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4334b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4335c;

    /* renamed from: d  reason: collision with root package name */
    public final h.d f4336d;

    /* renamed from: e  reason: collision with root package name */
    public final List<h.b> f4337e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4338f;

    /* renamed from: g  reason: collision with root package name */
    public final h.c f4339g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f4340h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f4341i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f4342j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4343k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f4344l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<Integer> f4345m;

    /* renamed from: n  reason: collision with root package name */
    public final String f4346n;

    /* renamed from: o  reason: collision with root package name */
    public final File f4347o;

    public a(Context context, String str, c.C0129c cVar, h.d dVar, List<h.b> list, boolean z10, h.c cVar2, Executor executor, Executor executor2, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file) {
        this.f4333a = cVar;
        this.f4334b = context;
        this.f4335c = str;
        this.f4336d = dVar;
        this.f4337e = list;
        this.f4338f = z10;
        this.f4339g = cVar2;
        this.f4340h = executor;
        this.f4341i = executor2;
        this.f4342j = z11;
        this.f4343k = z12;
        this.f4344l = z13;
        this.f4345m = set;
        this.f4346n = str2;
        this.f4347o = file;
    }

    public boolean a(int i10, int i11) {
        Set<Integer> set;
        if ((!(i10 > i11) || !this.f4344l) && this.f4343k && ((set = this.f4345m) == null || !set.contains(Integer.valueOf(i10)))) {
            return true;
        }
        return false;
    }
}
