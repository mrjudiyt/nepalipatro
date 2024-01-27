package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import t3.d;
import t3.h;
import t3.m;

@Keep
public class CctBackendFactory implements d {
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
