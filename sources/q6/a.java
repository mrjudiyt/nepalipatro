package q6;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.tracing.ComponentMonitor;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f16275a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Component f16276b;

    public /* synthetic */ a(String str, Component component) {
        this.f16275a = str;
        this.f16276b = component;
    }

    public final Object create(ComponentContainer componentContainer) {
        return ComponentMonitor.lambda$processRegistrar$0(this.f16275a, this.f16276b, componentContainer);
    }
}
