package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.KeyboardMap;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ KeyEmbedderResponder f15016h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ KeyboardMap.KeyPair f15017i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KeyEvent f15018j;

    public /* synthetic */ e(KeyEmbedderResponder keyEmbedderResponder, KeyboardMap.KeyPair keyPair, KeyEvent keyEvent) {
        this.f15016h = keyEmbedderResponder;
        this.f15017i = keyPair;
        this.f15018j = keyEvent;
    }

    public final void run() {
        this.f15016h.lambda$synchronizePressingKey$1(this.f15017i, this.f15018j);
    }
}
