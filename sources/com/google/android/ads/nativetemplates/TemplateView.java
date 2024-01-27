package com.google.android.ads.nativetemplates;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import io.flutter.plugins.googlemobileads.R;
import p3.a;

public final class TemplateView extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    private int f6175h;

    /* renamed from: i  reason: collision with root package name */
    private a f6176i;

    /* renamed from: j  reason: collision with root package name */
    private NativeAd f6177j;

    /* renamed from: k  reason: collision with root package name */
    private NativeAdView f6178k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f6179l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f6180m;

    /* renamed from: n  reason: collision with root package name */
    private RatingBar f6181n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f6182o;

    /* renamed from: p  reason: collision with root package name */
    private ImageView f6183p;

    /* renamed from: q  reason: collision with root package name */
    private MediaView f6184q;

    /* renamed from: r  reason: collision with root package name */
    private Button f6185r;

    /* renamed from: s  reason: collision with root package name */
    private ConstraintLayout f6186s;

    public TemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }

    private boolean a(NativeAd nativeAd) {
        return !TextUtils.isEmpty(nativeAd.getStore()) && TextUtils.isEmpty(nativeAd.getAdvertiser());
    }

    private void b() {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Button button;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        Button button2;
        Button button3;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        Button button4;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        ColorDrawable v10 = this.f6176i.v();
        if (v10 != null) {
            this.f6186s.setBackground(v10);
            TextView textView13 = this.f6179l;
            if (textView13 != null) {
                textView13.setBackground(v10);
            }
            TextView textView14 = this.f6180m;
            if (textView14 != null) {
                textView14.setBackground(v10);
            }
            TextView textView15 = this.f6182o;
            if (textView15 != null) {
                textView15.setBackground(v10);
            }
        }
        Typeface y10 = this.f6176i.y();
        if (!(y10 == null || (textView12 = this.f6179l) == null)) {
            textView12.setTypeface(y10);
        }
        Typeface C = this.f6176i.C();
        if (!(C == null || (textView11 = this.f6180m) == null)) {
            textView11.setTypeface(C);
        }
        Typeface G = this.f6176i.G();
        if (!(G == null || (textView10 = this.f6182o) == null)) {
            textView10.setTypeface(G);
        }
        Typeface t10 = this.f6176i.t();
        if (!(t10 == null || (button4 = this.f6185r) == null)) {
            button4.setTypeface(t10);
        }
        if (!(this.f6176i.z() == null || (textView9 = this.f6179l) == null)) {
            textView9.setTextColor(this.f6176i.z().intValue());
        }
        if (!(this.f6176i.D() == null || (textView8 = this.f6180m) == null)) {
            textView8.setTextColor(this.f6176i.D().intValue());
        }
        if (!(this.f6176i.H() == null || (textView7 = this.f6182o) == null)) {
            textView7.setTextColor(this.f6176i.H().intValue());
        }
        if (!(this.f6176i.u() == null || (button3 = this.f6185r) == null)) {
            button3.setTextColor(this.f6176i.u().intValue());
        }
        float s10 = this.f6176i.s();
        if (s10 > 0.0f && (button2 = this.f6185r) != null) {
            button2.setTextSize(s10);
        }
        float x10 = this.f6176i.x();
        if (x10 > 0.0f && (textView6 = this.f6179l) != null) {
            textView6.setTextSize(x10);
        }
        float B = this.f6176i.B();
        if (B > 0.0f && (textView5 = this.f6180m) != null) {
            textView5.setTextSize(B);
        }
        float F = this.f6176i.F();
        if (F > 0.0f && (textView4 = this.f6182o) != null) {
            textView4.setTextSize(F);
        }
        ColorDrawable r10 = this.f6176i.r();
        if (!(r10 == null || (button = this.f6185r) == null)) {
            button.setBackground(r10);
        }
        ColorDrawable w10 = this.f6176i.w();
        if (!(w10 == null || (textView3 = this.f6179l) == null)) {
            textView3.setBackground(w10);
        }
        ColorDrawable A = this.f6176i.A();
        if (!(A == null || (textView2 = this.f6180m) == null)) {
            textView2.setBackground(A);
        }
        ColorDrawable E = this.f6176i.E();
        if (!(E == null || (textView = this.f6182o) == null)) {
            textView.setBackground(E);
        }
        invalidate();
        requestLayout();
    }

    /* JADX INFO: finally extract failed */
    private void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TemplateView, 0, 0);
        try {
            this.f6175h = obtainStyledAttributes.getResourceId(R.styleable.TemplateView_gnt_template_type, R.layout.gnt_medium_template_view);
            obtainStyledAttributes.recycle();
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f6175h, this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void c() {
        this.f6177j.destroy();
    }

    public NativeAdView getNativeAdView() {
        return this.f6178k;
    }

    public String getTemplateTypeName() {
        int i10 = this.f6175h;
        if (i10 == R.layout.gnt_medium_template_view) {
            return "medium_template";
        }
        return i10 == R.layout.gnt_small_template_view ? "small_template" : "";
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f6178k = (NativeAdView) findViewById(R.id.native_ad_view);
        this.f6179l = (TextView) findViewById(R.id.primary);
        this.f6180m = (TextView) findViewById(R.id.secondary);
        this.f6182o = (TextView) findViewById(R.id.body);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating_bar);
        this.f6181n = ratingBar;
        ratingBar.setEnabled(false);
        this.f6185r = (Button) findViewById(R.id.cta);
        this.f6183p = (ImageView) findViewById(R.id.icon);
        this.f6184q = (MediaView) findViewById(R.id.media_view);
        this.f6186s = (ConstraintLayout) findViewById(R.id.background);
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.f6177j = nativeAd;
        String store = nativeAd.getStore();
        String advertiser = nativeAd.getAdvertiser();
        String headline = nativeAd.getHeadline();
        String body = nativeAd.getBody();
        String callToAction = nativeAd.getCallToAction();
        Double starRating = nativeAd.getStarRating();
        NativeAd.Image icon = nativeAd.getIcon();
        this.f6178k.setCallToActionView(this.f6185r);
        this.f6178k.setHeadlineView(this.f6179l);
        this.f6178k.setMediaView(this.f6184q);
        this.f6180m.setVisibility(0);
        if (a(nativeAd)) {
            this.f6178k.setStoreView(this.f6180m);
        } else if (!TextUtils.isEmpty(advertiser)) {
            this.f6178k.setAdvertiserView(this.f6180m);
            store = advertiser;
        } else {
            store = "";
        }
        this.f6179l.setText(headline);
        this.f6185r.setText(callToAction);
        if (starRating == null || starRating.doubleValue() <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            this.f6180m.setText(store);
            this.f6180m.setVisibility(0);
            this.f6181n.setVisibility(8);
        } else {
            this.f6180m.setVisibility(8);
            this.f6181n.setVisibility(0);
            this.f6181n.setRating(starRating.floatValue());
            this.f6178k.setStarRatingView(this.f6181n);
        }
        if (icon != null) {
            this.f6183p.setVisibility(0);
            this.f6183p.setImageDrawable(icon.getDrawable());
        } else {
            this.f6183p.setVisibility(8);
        }
        TextView textView = this.f6182o;
        if (textView != null) {
            textView.setText(body);
            this.f6178k.setBodyView(this.f6182o);
        }
        this.f6178k.setNativeAd(nativeAd);
    }

    public void setStyles(a aVar) {
        this.f6176i = aVar;
        b();
    }
}
