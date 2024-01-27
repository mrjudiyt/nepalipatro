package t9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import io.flutter.plugins.googlemobileads.GoogleMobileAdsPlugin;
import java.util.Map;
import kotlin.jvm.internal.m;
import np.com.nepalipatro.R;

/* compiled from: NativeAdWrapper.kt */
public final class b implements GoogleMobileAdsPlugin.NativeAdFactory {

    /* renamed from: a  reason: collision with root package name */
    private final LayoutInflater f16601a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f16602b;

    /* compiled from: NativeAdWrapper.kt */
    public static final class a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ NativeAd f16603h;

        a(NativeAd nativeAd) {
            this.f16603h = nativeAd;
        }

        public void onChildViewAdded(View view, View view2) {
            m.f(view2, "child");
            if (view2 instanceof ImageView) {
                ImageView imageView = (ImageView) view2;
                imageView.setAdjustViewBounds(true);
                MediaContent mediaContent = this.f16603h.getMediaContent();
                Drawable mainImage = mediaContent != null ? mediaContent.getMainImage() : null;
                m.d(mainImage, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                Bitmap bitmap = ((BitmapDrawable) mainImage).getBitmap();
                m.e(bitmap, "nativeAd.mediaContent?.m…as BitmapDrawable).bitmap");
                imageView.setImageBitmap(bitmap);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
        }
    }

    public b(LayoutInflater layoutInflater, Context context) {
        m.f(layoutInflater, "layoutInflater");
        m.f(context, "context");
        this.f16601a = layoutInflater;
        this.f16602b = context;
    }

    public NativeAdView createNativeAd(NativeAd nativeAd, Map<String, ? extends Object> map) {
        m.f(nativeAd, "nativeAd");
        m.f(map, "customOptions");
        Object obj = map.get("layout");
        m.d(obj, "null cannot be cast to non-null type kotlin.String");
        Drawable drawable = null;
        View inflate = this.f16601a.inflate(this.f16602b.getResources().getIdentifier((String) obj, "layout", "np.com.nepalipatro"), (ViewGroup) null);
        m.d(inflate, "null cannot be cast to non-null type com.google.android.gms.ads.nativead.NativeAdView");
        NativeAdView nativeAdView = (NativeAdView) inflate;
        TextView textView = (TextView) nativeAdView.findViewById(R.id.flutter_native_ad_headline);
        TextView textView2 = (TextView) nativeAdView.findViewById(R.id.flutter_native_ad_body);
        MediaView mediaView = (MediaView) nativeAdView.findViewById(R.id.flutter_native_ad_media);
        Button button = (Button) nativeAdView.findViewById(R.id.flutter_native_ad_call_to_action);
        ImageView imageView = (ImageView) nativeAdView.findViewById(R.id.flutter_native_ad_icon);
        textView.setText(nativeAd.getHeadline());
        textView2.setText(nativeAd.getBody());
        ((TextView) nativeAdView.findViewById(R.id.flutter_native_ad_attribution)).setText("Ad");
        ((TextView) nativeAdView.findViewById(R.id.flutter_native_ad_advertiser)).setText(nativeAd.getAdvertiser());
        MediaContent mediaContent = nativeAd.getMediaContent();
        if (!(mediaContent == null || mediaView == null)) {
            mediaView.setMediaContent(mediaContent);
        }
        MediaContent mediaContent2 = nativeAd.getMediaContent();
        Boolean valueOf = mediaContent2 != null ? Boolean.valueOf(mediaContent2.hasVideoContent()) : null;
        m.c(valueOf);
        if (!valueOf.booleanValue() && mediaView != null) {
            mediaView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        if (mediaView != null) {
            mediaView.setOnHierarchyChangeListener(new a(nativeAd));
        }
        if (imageView != null) {
            NativeAd.Image icon = nativeAd.getIcon();
            if (icon != null) {
                drawable = icon.getDrawable();
            }
            imageView.setImageDrawable(drawable);
        }
        button.setText(nativeAd.getCallToAction());
        nativeAdView.setMediaView(mediaView);
        nativeAdView.setNativeAd(nativeAd);
        nativeAdView.setBodyView(textView2);
        nativeAdView.setHeadlineView(textView);
        return nativeAdView;
    }
}
