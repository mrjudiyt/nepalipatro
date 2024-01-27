package io.flutter.plugins.googlemobileads.nativetemplates;

import android.graphics.drawable.ColorDrawable;
import java.util.Objects;

public final class FlutterNativeTemplateTextStyle {
    private final ColorDrawable backgroundColor;
    private final FlutterNativeTemplateFontStyle fontStyle;
    private final Double size;
    private final ColorDrawable textColor;

    public FlutterNativeTemplateTextStyle(ColorDrawable colorDrawable, ColorDrawable colorDrawable2, FlutterNativeTemplateFontStyle flutterNativeTemplateFontStyle, Double d10) {
        this.textColor = colorDrawable;
        this.backgroundColor = colorDrawable2;
        this.fontStyle = flutterNativeTemplateFontStyle;
        this.size = d10;
    }

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterNativeTemplateTextStyle)) {
            return false;
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle = (FlutterNativeTemplateTextStyle) obj;
        ColorDrawable colorDrawable2 = this.textColor;
        if (((colorDrawable2 != null || flutterNativeTemplateTextStyle.textColor != null) && colorDrawable2.getColor() != flutterNativeTemplateTextStyle.textColor.getColor()) || ((((colorDrawable = this.backgroundColor) != null || flutterNativeTemplateTextStyle.backgroundColor != null) && colorDrawable.getColor() != flutterNativeTemplateTextStyle.backgroundColor.getColor()) || !Objects.equals(this.size, flutterNativeTemplateTextStyle.size) || !Objects.equals(this.fontStyle, flutterNativeTemplateTextStyle.fontStyle))) {
            return false;
        }
        return true;
    }

    public ColorDrawable getBackgroundColor() {
        return this.backgroundColor;
    }

    public FlutterNativeTemplateFontStyle getFontStyle() {
        return this.fontStyle;
    }

    public Float getSize() {
        Double d10 = this.size;
        if (d10 == null) {
            return null;
        }
        return Float.valueOf(d10.floatValue());
    }

    public ColorDrawable getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        ColorDrawable colorDrawable = this.textColor;
        Integer num = null;
        Integer valueOf = colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor());
        ColorDrawable colorDrawable2 = this.backgroundColor;
        if (colorDrawable2 != null) {
            num = Integer.valueOf(colorDrawable2.getColor());
        }
        return Objects.hash(new Object[]{valueOf, num, this.size, this.fontStyle});
    }
}
