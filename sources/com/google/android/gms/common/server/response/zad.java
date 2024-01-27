package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class zad implements zai<Double> {
    zad() {
    }

    public final /* synthetic */ Object zaa(FastParser fastParser, BufferedReader bufferedReader) {
        return Double.valueOf(fastParser.zaj(bufferedReader));
    }
}
