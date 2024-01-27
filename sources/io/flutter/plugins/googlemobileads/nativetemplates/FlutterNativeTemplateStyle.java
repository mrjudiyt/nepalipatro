package io.flutter.plugins.googlemobileads.nativetemplates;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.ads.nativetemplates.TemplateView;
import java.util.Objects;
import p3.a;

public final class FlutterNativeTemplateStyle {
    final FlutterNativeTemplateTextStyle callToActionStyle;
    final ColorDrawable mainBackgroundColor;
    final FlutterNativeTemplateTextStyle primaryTextStyle;
    final FlutterNativeTemplateTextStyle secondaryTextStyle;
    final FlutterNativeTemplateType templateType;
    final FlutterNativeTemplateTextStyle tertiaryTextStyle;

    public FlutterNativeTemplateStyle(FlutterNativeTemplateType flutterNativeTemplateType, ColorDrawable colorDrawable, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle2, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle3, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle4) {
        this.templateType = flutterNativeTemplateType;
        this.mainBackgroundColor = colorDrawable;
        this.callToActionStyle = flutterNativeTemplateTextStyle;
        this.primaryTextStyle = flutterNativeTemplateTextStyle2;
        this.secondaryTextStyle = flutterNativeTemplateTextStyle3;
        this.tertiaryTextStyle = flutterNativeTemplateTextStyle4;
    }

    public a asNativeTemplateStyle() {
        a.C0179a aVar = new a.C0179a();
        ColorDrawable colorDrawable = this.mainBackgroundColor;
        if (colorDrawable != null) {
            aVar.f(colorDrawable);
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle = this.callToActionStyle;
        if (flutterNativeTemplateTextStyle != null) {
            if (flutterNativeTemplateTextStyle.getBackgroundColor() != null) {
                aVar.b(this.callToActionStyle.getBackgroundColor());
            }
            if (this.callToActionStyle.getTextColor() != null) {
                aVar.e(this.callToActionStyle.getTextColor().getColor());
            }
            if (this.callToActionStyle.getFontStyle() != null) {
                aVar.d(this.callToActionStyle.getFontStyle().getTypeface());
            }
            if (this.callToActionStyle.getSize() != null) {
                aVar.c(this.callToActionStyle.getSize().floatValue());
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle2 = this.primaryTextStyle;
        if (flutterNativeTemplateTextStyle2 != null) {
            if (flutterNativeTemplateTextStyle2.getBackgroundColor() != null) {
                aVar.g(this.primaryTextStyle.getBackgroundColor());
            }
            if (this.primaryTextStyle.getTextColor() != null) {
                aVar.j(this.primaryTextStyle.getTextColor().getColor());
            }
            if (this.primaryTextStyle.getFontStyle() != null) {
                aVar.i(this.primaryTextStyle.getFontStyle().getTypeface());
            }
            if (this.primaryTextStyle.getSize() != null) {
                aVar.h(this.primaryTextStyle.getSize().floatValue());
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle3 = this.secondaryTextStyle;
        if (flutterNativeTemplateTextStyle3 != null) {
            if (flutterNativeTemplateTextStyle3.getBackgroundColor() != null) {
                aVar.k(this.secondaryTextStyle.getBackgroundColor());
            }
            if (this.secondaryTextStyle.getTextColor() != null) {
                aVar.n(this.secondaryTextStyle.getTextColor().getColor());
            }
            if (this.secondaryTextStyle.getFontStyle() != null) {
                aVar.m(this.secondaryTextStyle.getFontStyle().getTypeface());
            }
            if (this.secondaryTextStyle.getSize() != null) {
                aVar.l(this.secondaryTextStyle.getSize().floatValue());
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle4 = this.tertiaryTextStyle;
        if (flutterNativeTemplateTextStyle4 != null) {
            if (flutterNativeTemplateTextStyle4.getBackgroundColor() != null) {
                aVar.o(this.tertiaryTextStyle.getBackgroundColor());
            }
            if (this.tertiaryTextStyle.getTextColor() != null) {
                aVar.r(this.tertiaryTextStyle.getTextColor().getColor());
            }
            if (this.tertiaryTextStyle.getFontStyle() != null) {
                aVar.q(this.tertiaryTextStyle.getFontStyle().getTypeface());
            }
            if (this.tertiaryTextStyle.getSize() != null) {
                aVar.p(this.tertiaryTextStyle.getSize().floatValue());
            }
        }
        return aVar.a();
    }

    public TemplateView asTemplateView(Context context) {
        TemplateView templateView = (TemplateView) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.templateType.resourceId(), (ViewGroup) null);
        templateView.setStyles(asNativeTemplateStyle());
        return templateView;
    }

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterNativeTemplateStyle)) {
            return false;
        }
        FlutterNativeTemplateStyle flutterNativeTemplateStyle = (FlutterNativeTemplateStyle) obj;
        if (this.templateType != flutterNativeTemplateStyle.templateType || ((((colorDrawable = this.mainBackgroundColor) != null || flutterNativeTemplateStyle.mainBackgroundColor != null) && colorDrawable.getColor() != flutterNativeTemplateStyle.mainBackgroundColor.getColor()) || !Objects.equals(this.callToActionStyle, flutterNativeTemplateStyle.callToActionStyle) || !Objects.equals(this.primaryTextStyle, flutterNativeTemplateStyle.primaryTextStyle) || !Objects.equals(this.secondaryTextStyle, flutterNativeTemplateStyle.secondaryTextStyle) || !Objects.equals(this.tertiaryTextStyle, flutterNativeTemplateStyle.tertiaryTextStyle))) {
            return false;
        }
        return true;
    }

    public FlutterNativeTemplateTextStyle getCallToActionStyle() {
        return this.callToActionStyle;
    }

    public ColorDrawable getMainBackgroundColor() {
        return this.mainBackgroundColor;
    }

    public FlutterNativeTemplateTextStyle getPrimaryTextStyle() {
        return this.primaryTextStyle;
    }

    public FlutterNativeTemplateTextStyle getSecondaryTextStyle() {
        return this.secondaryTextStyle;
    }

    public FlutterNativeTemplateType getTemplateType() {
        return this.templateType;
    }

    public FlutterNativeTemplateTextStyle getTertiaryTextStyle() {
        return this.tertiaryTextStyle;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        ColorDrawable colorDrawable = this.mainBackgroundColor;
        objArr[0] = colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor());
        objArr[1] = this.callToActionStyle;
        objArr[2] = this.primaryTextStyle;
        objArr[3] = this.secondaryTextStyle;
        objArr[4] = this.tertiaryTextStyle;
        return Objects.hash(objArr);
    }
}
