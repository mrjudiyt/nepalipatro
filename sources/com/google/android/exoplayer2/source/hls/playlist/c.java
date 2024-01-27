package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.exoplayer2.drm.h;
import e4.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m5.d;

/* compiled from: HlsMasterPlaylist */
public final class c extends d {

    /* renamed from: n  reason: collision with root package name */
    public static final c f7389n = new c("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (j) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: d  reason: collision with root package name */
    public final List<Uri> f7390d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b> f7391e;

    /* renamed from: f  reason: collision with root package name */
    public final List<a> f7392f;

    /* renamed from: g  reason: collision with root package name */
    public final List<a> f7393g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a> f7394h;

    /* renamed from: i  reason: collision with root package name */
    public final List<a> f7395i;

    /* renamed from: j  reason: collision with root package name */
    public final j f7396j;

    /* renamed from: k  reason: collision with root package name */
    public final List<j> f7397k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, String> f7398l;

    /* renamed from: m  reason: collision with root package name */
    public final List<h> f7399m;

    /* compiled from: HlsMasterPlaylist */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f7400a;

        /* renamed from: b  reason: collision with root package name */
        public final j f7401b;

        /* renamed from: c  reason: collision with root package name */
        public final String f7402c;

        /* renamed from: d  reason: collision with root package name */
        public final String f7403d;

        public a(Uri uri, j jVar, String str, String str2) {
            this.f7400a = uri;
            this.f7401b = jVar;
            this.f7402c = str;
            this.f7403d = str2;
        }
    }

    /* compiled from: HlsMasterPlaylist */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f7404a;

        /* renamed from: b  reason: collision with root package name */
        public final j f7405b;

        /* renamed from: c  reason: collision with root package name */
        public final String f7406c;

        /* renamed from: d  reason: collision with root package name */
        public final String f7407d;

        /* renamed from: e  reason: collision with root package name */
        public final String f7408e;

        /* renamed from: f  reason: collision with root package name */
        public final String f7409f;

        public b(Uri uri, j jVar, String str, String str2, String str3, String str4) {
            this.f7404a = uri;
            this.f7405b = jVar;
            this.f7406c = str;
            this.f7407d = str2;
            this.f7408e = str3;
            this.f7409f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, new j.b().S(AppEventsConstants.EVENT_PARAM_VALUE_NO).K("application/x-mpegURL").E(), (String) null, (String) null, (String) null, (String) null);
        }

        public b a(j jVar) {
            return new b(this.f7404a, jVar, this.f7406c, this.f7407d, this.f7408e, this.f7409f);
        }
    }

    public c(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, j jVar, List<j> list7, boolean z10, Map<String, String> map, List<h> list8) {
        super(str, list, z10);
        this.f7390d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f7391e = Collections.unmodifiableList(list2);
        this.f7392f = Collections.unmodifiableList(list3);
        this.f7393g = Collections.unmodifiableList(list4);
        this.f7394h = Collections.unmodifiableList(list5);
        this.f7395i = Collections.unmodifiableList(list6);
        this.f7396j = jVar;
        this.f7397k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f7398l = Collections.unmodifiableMap(map);
        this.f7399m = Collections.unmodifiableList(list8);
    }

    private static void b(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f7400a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    private static <T> List<T> d(List<T> list, int i10, List<f5.c> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= list2.size()) {
                    break;
                }
                f5.c cVar = list2.get(i12);
                if (cVar.f8530i == i10 && cVar.f8531j == i11) {
                    arrayList.add(t10);
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }

    public static c e(String str) {
        return new c("", Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (j) null, (List<j>) null, false, Collections.emptyMap(), Collections.emptyList());
    }

    private static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f7404a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public c a(List<f5.c> list) {
        return new c(this.f10237a, this.f10238b, d(this.f7391e, 0, list), Collections.emptyList(), d(this.f7393g, 1, list), d(this.f7394h, 2, list), Collections.emptyList(), this.f7396j, this.f7397k, this.f10239c, this.f7398l, this.f7399m);
    }
}
