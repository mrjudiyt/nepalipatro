package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Map.Entry f13806h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Event f13807i;

    public /* synthetic */ o(Map.Entry entry, Event event) {
        this.f13806h = entry;
        this.f13807i = event;
    }

    public final void run() {
        ((EventHandler) this.f13806h.getKey()).handle(this.f13807i);
    }
}
