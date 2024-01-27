package io.flutter.plugins.googlemobileads.nativetemplates;

import android.graphics.Typeface;

public enum FlutterNativeTemplateFontStyle {
    NORMAL,
    BOLD,
    ITALIC,
    MONOSPACE;

    /* renamed from: io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle[] r0 = io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle = r0
                io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle r1 = io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle.NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle r1 = io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle.BOLD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle r1 = io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle.ITALIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle r1 = io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle.MONOSPACE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle.AnonymousClass1.<clinit>():void");
        }
    }

    public static FlutterNativeTemplateFontStyle fromIntValue(int i10) {
        if (i10 >= 0 && i10 < values().length) {
            return values()[i10];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid index for NativeTemplateFontStyle: ");
        sb.append(i10);
        return NORMAL;
    }

    /* access modifiers changed from: package-private */
    public Typeface getTypeface() {
        int i10 = AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemobileads$nativetemplates$FlutterNativeTemplateFontStyle[ordinal()];
        if (i10 == 1) {
            return Typeface.DEFAULT;
        }
        if (i10 == 2) {
            return Typeface.DEFAULT_BOLD;
        }
        if (i10 == 3) {
            return Typeface.defaultFromStyle(2);
        }
        if (i10 != 4) {
            return Typeface.DEFAULT;
        }
        return Typeface.MONOSPACE;
    }
}
