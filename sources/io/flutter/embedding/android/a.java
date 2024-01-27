package io.flutter.embedding.android;

import android.view.textservice.SpellCheckerInfo;
import java.util.function.Predicate;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f15009a = new a();

    private /* synthetic */ a() {
    }

    public final boolean test(Object obj) {
        return ((SpellCheckerInfo) obj).getPackageName().equals("com.google.android.inputmethod.latin");
    }
}
