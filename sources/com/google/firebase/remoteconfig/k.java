package com.google.firebase.remoteconfig;

import com.google.android.gms.common.util.BiConsumer;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.Personalization;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class k implements BiConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Personalization f14045a;

    public /* synthetic */ k(Personalization personalization) {
        this.f14045a = personalization;
    }

    public final void accept(Object obj, Object obj2) {
        this.f14045a.logArmActive((String) obj, (ConfigContainer) obj2);
    }
}
