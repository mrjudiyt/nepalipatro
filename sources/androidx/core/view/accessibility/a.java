package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat */
public final class a extends ClickableSpan {

    /* renamed from: h  reason: collision with root package name */
    private final int f2466h;

    /* renamed from: i  reason: collision with root package name */
    private final c f2467i;

    /* renamed from: j  reason: collision with root package name */
    private final int f2468j;

    public a(int i10, c cVar, int i11) {
        this.f2466h = i10;
        this.f2467i = cVar;
        this.f2468j = i11;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2466h);
        this.f2467i.U(this.f2468j, bundle);
    }
}
