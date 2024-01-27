package io.flutter.embedding.engine;

import android.graphics.ImageDecoder;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f15019a;

    public /* synthetic */ a(long j10) {
        this.f15019a = j10;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        FlutterJNI.lambda$decodeImage$0(this.f15019a, imageDecoder, imageInfo, source);
    }
}
