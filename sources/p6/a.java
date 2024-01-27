package p6;

import android.content.Context;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import s3.u;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ a f16193a = new a();

    private /* synthetic */ a() {
    }

    public final Object create(ComponentContainer componentContainer) {
        return u.f((Context) componentContainer.get(Context.class));
    }
}
