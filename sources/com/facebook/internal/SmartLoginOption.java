package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* compiled from: SmartLoginOption.kt */
public enum SmartLoginOption {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    /* access modifiers changed from: private */
    public static final EnumSet<SmartLoginOption> ALL = null;
    public static final Companion Companion = null;
    private final long value;

    /* compiled from: SmartLoginOption.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final EnumSet<SmartLoginOption> parseOptions(long j10) {
            EnumSet<SmartLoginOption> noneOf = EnumSet.noneOf(SmartLoginOption.class);
            Iterator it = SmartLoginOption.ALL.iterator();
            while (it.hasNext()) {
                SmartLoginOption smartLoginOption = (SmartLoginOption) it.next();
                if ((smartLoginOption.getValue() & j10) != 0) {
                    noneOf.add(smartLoginOption);
                }
            }
            m.e(noneOf, "result");
            return noneOf;
        }
    }

    static {
        Companion = new Companion((g) null);
        EnumSet<SmartLoginOption> allOf = EnumSet.allOf(SmartLoginOption.class);
        m.e(allOf, "allOf(SmartLoginOption::class.java)");
        ALL = allOf;
    }

    private SmartLoginOption(long j10) {
        this.value = j10;
    }

    public static final EnumSet<SmartLoginOption> parseOptions(long j10) {
        return Companion.parseOptions(j10);
    }

    public final long getValue() {
        return this.value;
    }
}
