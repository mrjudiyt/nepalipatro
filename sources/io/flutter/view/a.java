package io.flutter.view;

import io.flutter.util.Predicate;
import io.flutter.view.AccessibilityBridge;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AccessibilityBridge.SemanticsNode f15362a;

    public /* synthetic */ a(AccessibilityBridge.SemanticsNode semanticsNode) {
        this.f15362a = semanticsNode;
    }

    public final boolean test(Object obj) {
        return AccessibilityBridge.lambda$shouldSetCollectionInfo$0(this.f15362a, (AccessibilityBridge.SemanticsNode) obj);
    }
}
