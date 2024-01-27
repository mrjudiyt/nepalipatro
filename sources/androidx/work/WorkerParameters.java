package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    private UUID f4690a;

    /* renamed from: b  reason: collision with root package name */
    private e f4691b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f4692c;

    /* renamed from: d  reason: collision with root package name */
    private a f4693d;

    /* renamed from: e  reason: collision with root package name */
    private int f4694e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f4695f;

    /* renamed from: g  reason: collision with root package name */
    private x1.a f4696g;

    /* renamed from: h  reason: collision with root package name */
    private y f4697h;

    /* renamed from: i  reason: collision with root package name */
    private r f4698i;

    /* renamed from: j  reason: collision with root package name */
    private h f4699j;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f4700a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f4701b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f4702c;
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i10, Executor executor, x1.a aVar2, y yVar, r rVar, h hVar) {
        this.f4690a = uuid;
        this.f4691b = eVar;
        this.f4692c = new HashSet(collection);
        this.f4693d = aVar;
        this.f4694e = i10;
        this.f4695f = executor;
        this.f4696g = aVar2;
        this.f4697h = yVar;
        this.f4698i = rVar;
        this.f4699j = hVar;
    }

    public Executor a() {
        return this.f4695f;
    }

    public h b() {
        return this.f4699j;
    }

    public UUID c() {
        return this.f4690a;
    }

    public e d() {
        return this.f4691b;
    }

    public Network e() {
        return this.f4693d.f4702c;
    }

    public r f() {
        return this.f4698i;
    }

    public int g() {
        return this.f4694e;
    }

    public Set<String> h() {
        return this.f4692c;
    }

    public x1.a i() {
        return this.f4696g;
    }

    public List<String> j() {
        return this.f4693d.f4700a;
    }

    public List<Uri> k() {
        return this.f4693d.f4701b;
    }

    public y l() {
        return this.f4697h;
    }
}
