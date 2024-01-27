package kotlin.jvm.internal;

import e9.b;
import e9.i;

/* compiled from: PropertyReference */
public abstract class v extends c implements i {

    /* renamed from: h  reason: collision with root package name */
    private final boolean f15572h;

    public v() {
        this.f15572h = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public i getReflected() {
        if (!this.f15572h) {
            return (i) super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    public b compute() {
        return this.f15572h ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (!getOwner().equals(vVar.getOwner()) || !getName().equals(vVar.getName()) || !getSignature().equals(vVar.getSignature()) || !m.a(getBoundReceiver(), vVar.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof i) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        boolean z10 = false;
        this.f15572h = (i10 & 2) == 2 ? true : z10;
    }
}
