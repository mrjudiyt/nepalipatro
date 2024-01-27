package com.facebook;

import com.facebook.GraphRequest;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ArrayList f6155h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ GraphRequestBatch f6156i;

    public /* synthetic */ s(ArrayList arrayList, GraphRequestBatch graphRequestBatch) {
        this.f6155h = arrayList;
        this.f6156i = graphRequestBatch;
    }

    public final void run() {
        GraphRequest.Companion.m18runCallbacks$lambda2(this.f6155h, this.f6156i);
    }
}
