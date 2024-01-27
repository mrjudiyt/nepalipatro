package com.facebook.internal.gatekeeper;

import kotlin.jvm.internal.m;

/* compiled from: GateKeeper.kt */
public final class GateKeeper {
    private final String name;
    private final boolean value;

    public GateKeeper(String str, boolean z10) {
        m.f(str, "name");
        this.name = str;
        this.value = z10;
    }

    public static /* synthetic */ GateKeeper copy$default(GateKeeper gateKeeper, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gateKeeper.name;
        }
        if ((i10 & 2) != 0) {
            z10 = gateKeeper.value;
        }
        return gateKeeper.copy(str, z10);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.value;
    }

    public final GateKeeper copy(String str, boolean z10) {
        m.f(str, "name");
        return new GateKeeper(str, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GateKeeper)) {
            return false;
        }
        GateKeeper gateKeeper = (GateKeeper) obj;
        return m.a(this.name, gateKeeper.name) && this.value == gateKeeper.value;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        boolean z10 = this.value;
        if (z10) {
            z10 = true;
        }
        return hashCode + (z10 ? 1 : 0);
    }

    public String toString() {
        return "GateKeeper(name=" + this.name + ", value=" + this.value + ')';
    }
}
