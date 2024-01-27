package io.flutter.view;

import io.flutter.util.Predicate;
import io.flutter.view.AccessibilityBridge;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f15363a = new b();

    private /* synthetic */ b() {
    }

    public final boolean test(Object obj) {
        return ((AccessibilityBridge.SemanticsNode) obj).hasFlag(AccessibilityBridge.Flag.HAS_IMPLICIT_SCROLLING);
    }
}
