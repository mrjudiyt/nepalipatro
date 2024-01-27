package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import p6.a;
import q3.g;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.builder(g.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).factory(a.f16193a).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME)});
    }
}
