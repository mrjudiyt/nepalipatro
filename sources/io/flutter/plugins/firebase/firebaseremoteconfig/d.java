package io.flutter.plugins.firebase.firebaseremoteconfig;

import io.flutter.plugin.common.EventChannel;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ EventChannel.EventSink f15161h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ ArrayList f15162i;

    public /* synthetic */ d(EventChannel.EventSink eventSink, ArrayList arrayList) {
        this.f15161h = eventSink;
        this.f15162i = arrayList;
    }

    public final void run() {
        this.f15161h.success(this.f15162i);
    }
}
