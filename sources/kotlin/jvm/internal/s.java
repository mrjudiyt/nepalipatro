package kotlin.jvm.internal;

import e9.c;
import e9.d;

/* compiled from: PropertyReference1Impl */
public class s extends r {
    public s(d dVar, String str, String str2) {
        super(c.NO_RECEIVER, ((d) dVar).c(), str, str2, (dVar instanceof c) ^ true ? 1 : 0);
    }

    public Object get(Object obj) {
        return b().call(obj);
    }
}
