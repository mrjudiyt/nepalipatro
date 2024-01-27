package io.flutter.plugins.googlemobileads.nativetemplates;

import io.flutter.plugins.googlemobileads.R;

public enum FlutterNativeTemplateType {
    SMALL(R.layout.small_template_view_layout),
    MEDIUM(R.layout.medium_template_view_layout);
    
    private final int resourceId;

    private FlutterNativeTemplateType(int i10) {
        this.resourceId = i10;
    }

    public static FlutterNativeTemplateType fromIntValue(int i10) {
        if (i10 >= 0 && i10 < values().length) {
            return values()[i10];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid template type index: ");
        sb.append(i10);
        return MEDIUM;
    }

    public int resourceId() {
        return this.resourceId;
    }
}
