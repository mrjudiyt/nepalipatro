package com.google.android.exoplayer2.extractor.flv;

import a6.y;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import e4.j;
import g4.a;
import java.util.Collections;
import k4.b0;

/* compiled from: AudioTagPayloadReader */
final class a extends TagPayloadReader {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f6625e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    private boolean f6626b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6627c;

    /* renamed from: d  reason: collision with root package name */
    private int f6628d;

    public a(b0 b0Var) {
        super(b0Var);
    }

    /* access modifiers changed from: protected */
    public boolean b(y yVar) {
        if (!this.f6626b) {
            int C = yVar.C();
            int i10 = (C >> 4) & 15;
            this.f6628d = i10;
            if (i10 == 2) {
                this.f6624a.d(new j.b().e0("audio/mpeg").H(1).f0(f6625e[(C >> 2) & 3]).E());
                this.f6627c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f6624a.d(new j.b().e0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").H(1).f0(8000).E());
                this.f6627c = true;
            } else if (i10 != 10) {
                int i11 = this.f6628d;
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(i11);
                throw new TagPayloadReader.UnsupportedFormatException(sb.toString());
            }
            this.f6626b = true;
        } else {
            yVar.P(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(y yVar, long j10) {
        if (this.f6628d == 2) {
            int a10 = yVar.a();
            this.f6624a.a(yVar, a10);
            this.f6624a.e(j10, 1, a10, 0, (b0.a) null);
            return true;
        }
        int C = yVar.C();
        if (C == 0 && !this.f6627c) {
            int a11 = yVar.a();
            byte[] bArr = new byte[a11];
            yVar.j(bArr, 0, a11);
            a.b f10 = g4.a.f(bArr);
            this.f6624a.d(new j.b().e0("audio/mp4a-latm").I(f10.f8827c).H(f10.f8826b).f0(f10.f8825a).T(Collections.singletonList(bArr)).E());
            this.f6627c = true;
            return false;
        } else if (this.f6628d == 10 && C != 1) {
            return false;
        } else {
            int a12 = yVar.a();
            this.f6624a.a(yVar, a12);
            this.f6624a.e(j10, 1, a12, 0, (b0.a) null);
            return true;
        }
    }
}
