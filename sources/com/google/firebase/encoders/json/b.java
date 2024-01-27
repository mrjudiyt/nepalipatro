package com.google.firebase.encoders.json;

import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements ValueEncoder {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f13919a = new b();

    private /* synthetic */ b() {
    }

    public final void encode(Object obj, Object obj2) {
        ((ValueEncoderContext) obj2).add(((Boolean) obj).booleanValue());
    }
}
