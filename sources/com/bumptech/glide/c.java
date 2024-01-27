package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.load.engine.j;
import i2.b;
import i2.e;
import i2.k;
import j2.a;
import j2.h;
import j2.i;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t2.d;
import t2.f;
import t2.l;
import w2.g;

/* compiled from: GlideBuilder */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, i<?, ?>> f5572a = new androidx.collection.a();

    /* renamed from: b  reason: collision with root package name */
    private j f5573b;

    /* renamed from: c  reason: collision with root package name */
    private e f5574c;

    /* renamed from: d  reason: collision with root package name */
    private b f5575d;

    /* renamed from: e  reason: collision with root package name */
    private h f5576e;

    /* renamed from: f  reason: collision with root package name */
    private k2.a f5577f;

    /* renamed from: g  reason: collision with root package name */
    private k2.a f5578g;

    /* renamed from: h  reason: collision with root package name */
    private a.C0154a f5579h;

    /* renamed from: i  reason: collision with root package name */
    private i f5580i;

    /* renamed from: j  reason: collision with root package name */
    private d f5581j;

    /* renamed from: k  reason: collision with root package name */
    private int f5582k = 4;

    /* renamed from: l  reason: collision with root package name */
    private b.a f5583l = new a();

    /* renamed from: m  reason: collision with root package name */
    private l.b f5584m;

    /* renamed from: n  reason: collision with root package name */
    private k2.a f5585n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f5586o;

    /* renamed from: p  reason: collision with root package name */
    private List<g<Object>> f5587p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f5588q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f5589r;

    /* compiled from: GlideBuilder */
    class a implements b.a {
        a() {
        }

        public w2.h build() {
            return new w2.h();
        }
    }

    /* access modifiers changed from: package-private */
    public b a(Context context) {
        Context context2 = context;
        if (this.f5577f == null) {
            this.f5577f = k2.a.g();
        }
        if (this.f5578g == null) {
            this.f5578g = k2.a.e();
        }
        if (this.f5585n == null) {
            this.f5585n = k2.a.c();
        }
        if (this.f5580i == null) {
            this.f5580i = new i.a(context2).a();
        }
        if (this.f5581j == null) {
            this.f5581j = new f();
        }
        if (this.f5574c == null) {
            int b10 = this.f5580i.b();
            if (b10 > 0) {
                this.f5574c = new k((long) b10);
            } else {
                this.f5574c = new i2.f();
            }
        }
        if (this.f5575d == null) {
            this.f5575d = new i2.j(this.f5580i.a());
        }
        if (this.f5576e == null) {
            this.f5576e = new j2.g((long) this.f5580i.d());
        }
        if (this.f5579h == null) {
            this.f5579h = new j2.f(context2);
        }
        if (this.f5573b == null) {
            this.f5573b = new j(this.f5576e, this.f5579h, this.f5578g, this.f5577f, k2.a.h(), this.f5585n, this.f5586o);
        }
        List<g<Object>> list = this.f5587p;
        if (list == null) {
            this.f5587p = Collections.emptyList();
        } else {
            this.f5587p = Collections.unmodifiableList(list);
        }
        return new b(context, this.f5573b, this.f5576e, this.f5574c, this.f5575d, new l(this.f5584m), this.f5581j, this.f5582k, this.f5583l, this.f5572a, this.f5587p, this.f5588q, this.f5589r);
    }

    /* access modifiers changed from: package-private */
    public void b(l.b bVar) {
        this.f5584m = bVar;
    }
}
