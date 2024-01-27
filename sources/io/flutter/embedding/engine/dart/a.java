package io.flutter.embedding.engine.dart;

import io.flutter.embedding.engine.dart.DartMessenger;
import java.nio.ByteBuffer;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ DartMessenger f15020h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String f15021i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f15022j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ DartMessenger.HandlerInfo f15023k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f15024l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ long f15025m;

    public /* synthetic */ a(DartMessenger dartMessenger, String str, int i10, DartMessenger.HandlerInfo handlerInfo, ByteBuffer byteBuffer, long j10) {
        this.f15020h = dartMessenger;
        this.f15021i = str;
        this.f15022j = i10;
        this.f15023k = handlerInfo;
        this.f15024l = byteBuffer;
        this.f15025m = j10;
    }

    public final void run() {
        this.f15020h.lambda$dispatchMessageToQueue$0(this.f15021i, this.f15022j, this.f15023k, this.f15024l, this.f15025m);
    }
}
