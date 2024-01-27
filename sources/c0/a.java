package c0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* compiled from: EditorInfoCompat */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f5150a = new String[0];

    public static void a(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }
}
