package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.KeyboardMap;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ KeyEmbedderResponder f15012h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ KeyboardMap.KeyPair f15013i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f15014j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f15015k;

    public /* synthetic */ d(KeyEmbedderResponder keyEmbedderResponder, KeyboardMap.KeyPair keyPair, long j10, KeyEvent keyEvent) {
        this.f15012h = keyEmbedderResponder;
        this.f15013i = keyPair;
        this.f15014j = j10;
        this.f15015k = keyEvent;
    }

    public final void run() {
        this.f15012h.lambda$synchronizePressingKey$0(this.f15013i, this.f15014j, this.f15015k);
    }
}
