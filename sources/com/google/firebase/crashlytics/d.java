package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CrashlyticsRegistrar f13871a;

    public /* synthetic */ d(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.f13871a = crashlyticsRegistrar;
    }

    public final Object create(ComponentContainer componentContainer) {
        return this.f13871a.buildCrashlytics(componentContainer);
    }
}
