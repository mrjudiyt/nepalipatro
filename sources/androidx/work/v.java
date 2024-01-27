package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: WorkInfo */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private UUID f4930a;

    /* renamed from: b  reason: collision with root package name */
    private a f4931b;

    /* renamed from: c  reason: collision with root package name */
    private e f4932c;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f4933d;

    /* renamed from: e  reason: collision with root package name */
    private e f4934e;

    /* renamed from: f  reason: collision with root package name */
    private int f4935f;

    /* compiled from: WorkInfo */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean a() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }

    public v(UUID uuid, a aVar, e eVar, List<String> list, e eVar2, int i10) {
        this.f4930a = uuid;
        this.f4931b = aVar;
        this.f4932c = eVar;
        this.f4933d = new HashSet(list);
        this.f4934e = eVar2;
        this.f4935f = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f4935f == vVar.f4935f && this.f4930a.equals(vVar.f4930a) && this.f4931b == vVar.f4931b && this.f4932c.equals(vVar.f4932c) && this.f4933d.equals(vVar.f4933d)) {
            return this.f4934e.equals(vVar.f4934e);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.f4930a.hashCode() * 31) + this.f4931b.hashCode()) * 31) + this.f4932c.hashCode()) * 31) + this.f4933d.hashCode()) * 31) + this.f4934e.hashCode()) * 31) + this.f4935f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.f4930a + '\'' + ", mState=" + this.f4931b + ", mOutputData=" + this.f4932c + ", mTags=" + this.f4933d + ", mProgress=" + this.f4934e + '}';
    }
}
