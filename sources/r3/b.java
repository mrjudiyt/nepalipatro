package r3;

import com.facebook.appevents.UserDataStore;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;

/* compiled from: AutoBatchedLogRequestEncoder */
public final class b implements Configurator {

    /* renamed from: a  reason: collision with root package name */
    public static final Configurator f10867a = new b();

    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class a implements ObjectEncoder<a> {

        /* renamed from: a  reason: collision with root package name */
        static final a f10868a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final FieldDescriptor f10869b = FieldDescriptor.of(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);

        /* renamed from: c  reason: collision with root package name */
        private static final FieldDescriptor f10870c = FieldDescriptor.of(DeviceRequestsHelper.DEVICE_INFO_MODEL);

        /* renamed from: d  reason: collision with root package name */
        private static final FieldDescriptor f10871d = FieldDescriptor.of("hardware");

        /* renamed from: e  reason: collision with root package name */
        private static final FieldDescriptor f10872e = FieldDescriptor.of(DeviceRequestsHelper.DEVICE_INFO_DEVICE);

        /* renamed from: f  reason: collision with root package name */
        private static final FieldDescriptor f10873f = FieldDescriptor.of("product");

        /* renamed from: g  reason: collision with root package name */
        private static final FieldDescriptor f10874g = FieldDescriptor.of("osBuild");

        /* renamed from: h  reason: collision with root package name */
        private static final FieldDescriptor f10875h = FieldDescriptor.of("manufacturer");

        /* renamed from: i  reason: collision with root package name */
        private static final FieldDescriptor f10876i = FieldDescriptor.of("fingerprint");

        /* renamed from: j  reason: collision with root package name */
        private static final FieldDescriptor f10877j = FieldDescriptor.of("locale");

        /* renamed from: k  reason: collision with root package name */
        private static final FieldDescriptor f10878k = FieldDescriptor.of(UserDataStore.COUNTRY);

        /* renamed from: l  reason: collision with root package name */
        private static final FieldDescriptor f10879l = FieldDescriptor.of("mccMnc");

        /* renamed from: m  reason: collision with root package name */
        private static final FieldDescriptor f10880m = FieldDescriptor.of("applicationBuild");

        private a() {
        }

        /* renamed from: a */
        public void encode(a aVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f10869b, (Object) aVar.m());
            objectEncoderContext.add(f10870c, (Object) aVar.j());
            objectEncoderContext.add(f10871d, (Object) aVar.f());
            objectEncoderContext.add(f10872e, (Object) aVar.d());
            objectEncoderContext.add(f10873f, (Object) aVar.l());
            objectEncoderContext.add(f10874g, (Object) aVar.k());
            objectEncoderContext.add(f10875h, (Object) aVar.h());
            objectEncoderContext.add(f10876i, (Object) aVar.e());
            objectEncoderContext.add(f10877j, (Object) aVar.g());
            objectEncoderContext.add(f10878k, (Object) aVar.c());
            objectEncoderContext.add(f10879l, (Object) aVar.i());
            objectEncoderContext.add(f10880m, (Object) aVar.b());
        }
    }

    /* renamed from: r3.b$b  reason: collision with other inner class name */
    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class C0190b implements ObjectEncoder<j> {

        /* renamed from: a  reason: collision with root package name */
        static final C0190b f10881a = new C0190b();

        /* renamed from: b  reason: collision with root package name */
        private static final FieldDescriptor f10882b = FieldDescriptor.of("logRequest");

        private C0190b() {
        }

        /* renamed from: a */
        public void encode(j jVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f10882b, (Object) jVar.c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class c implements ObjectEncoder<k> {

        /* renamed from: a  reason: collision with root package name */
        static final c f10883a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final FieldDescriptor f10884b = FieldDescriptor.of("clientType");

        /* renamed from: c  reason: collision with root package name */
        private static final FieldDescriptor f10885c = FieldDescriptor.of("androidClientInfo");

        private c() {
        }

        /* renamed from: a */
        public void encode(k kVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f10884b, (Object) kVar.c());
            objectEncoderContext.add(f10885c, (Object) kVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class d implements ObjectEncoder<l> {

        /* renamed from: a  reason: collision with root package name */
        static final d f10886a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final FieldDescriptor f10887b = FieldDescriptor.of("eventTimeMs");

        /* renamed from: c  reason: collision with root package name */
        private static final FieldDescriptor f10888c = FieldDescriptor.of("eventCode");

        /* renamed from: d  reason: collision with root package name */
        private static final FieldDescriptor f10889d = FieldDescriptor.of("eventUptimeMs");

        /* renamed from: e  reason: collision with root package name */
        private static final FieldDescriptor f10890e = FieldDescriptor.of("sourceExtension");

        /* renamed from: f  reason: collision with root package name */
        private static final FieldDescriptor f10891f = FieldDescriptor.of("sourceExtensionJsonProto3");

        /* renamed from: g  reason: collision with root package name */
        private static final FieldDescriptor f10892g = FieldDescriptor.of("timezoneOffsetSeconds");

        /* renamed from: h  reason: collision with root package name */
        private static final FieldDescriptor f10893h = FieldDescriptor.of("networkConnectionInfo");

        private d() {
        }

        /* renamed from: a */
        public void encode(l lVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f10887b, lVar.c());
            objectEncoderContext.add(f10888c, (Object) lVar.b());
            objectEncoderContext.add(f10889d, lVar.d());
            objectEncoderContext.add(f10890e, (Object) lVar.f());
            objectEncoderContext.add(f10891f, (Object) lVar.g());
            objectEncoderContext.add(f10892g, lVar.h());
            objectEncoderContext.add(f10893h, (Object) lVar.e());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class e implements ObjectEncoder<m> {

        /* renamed from: a  reason: collision with root package name */
        static final e f10894a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final FieldDescriptor f10895b = FieldDescriptor.of("requestTimeMs");

        /* renamed from: c  reason: collision with root package name */
        private static final FieldDescriptor f10896c = FieldDescriptor.of("requestUptimeMs");

        /* renamed from: d  reason: collision with root package name */
        private static final FieldDescriptor f10897d = FieldDescriptor.of("clientInfo");

        /* renamed from: e  reason: collision with root package name */
        private static final FieldDescriptor f10898e = FieldDescriptor.of("logSource");

        /* renamed from: f  reason: collision with root package name */
        private static final FieldDescriptor f10899f = FieldDescriptor.of("logSourceName");

        /* renamed from: g  reason: collision with root package name */
        private static final FieldDescriptor f10900g = FieldDescriptor.of("logEvent");

        /* renamed from: h  reason: collision with root package name */
        private static final FieldDescriptor f10901h = FieldDescriptor.of("qosTier");

        private e() {
        }

        /* renamed from: a */
        public void encode(m mVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f10895b, mVar.g());
            objectEncoderContext.add(f10896c, mVar.h());
            objectEncoderContext.add(f10897d, (Object) mVar.b());
            objectEncoderContext.add(f10898e, (Object) mVar.d());
            objectEncoderContext.add(f10899f, (Object) mVar.e());
            objectEncoderContext.add(f10900g, (Object) mVar.c());
            objectEncoderContext.add(f10901h, (Object) mVar.f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder */
    private static final class f implements ObjectEncoder<o> {

        /* renamed from: a  reason: collision with root package name */
        static final f f10902a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final FieldDescriptor f10903b = FieldDescriptor.of("networkType");

        /* renamed from: c  reason: collision with root package name */
        private static final FieldDescriptor f10904c = FieldDescriptor.of("mobileSubtype");

        private f() {
        }

        /* renamed from: a */
        public void encode(o oVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f10903b, (Object) oVar.c());
            objectEncoderContext.add(f10904c, (Object) oVar.b());
        }
    }

    private b() {
    }

    public void configure(EncoderConfig<?> encoderConfig) {
        C0190b bVar = C0190b.f10881a;
        encoderConfig.registerEncoder((Class<U>) j.class, (ObjectEncoder<? super U>) bVar);
        encoderConfig.registerEncoder((Class<U>) d.class, (ObjectEncoder<? super U>) bVar);
        e eVar = e.f10894a;
        encoderConfig.registerEncoder((Class<U>) m.class, (ObjectEncoder<? super U>) eVar);
        encoderConfig.registerEncoder((Class<U>) g.class, (ObjectEncoder<? super U>) eVar);
        c cVar = c.f10883a;
        encoderConfig.registerEncoder((Class<U>) k.class, (ObjectEncoder<? super U>) cVar);
        encoderConfig.registerEncoder((Class<U>) e.class, (ObjectEncoder<? super U>) cVar);
        a aVar = a.f10868a;
        encoderConfig.registerEncoder((Class<U>) a.class, (ObjectEncoder<? super U>) aVar);
        encoderConfig.registerEncoder((Class<U>) c.class, (ObjectEncoder<? super U>) aVar);
        d dVar = d.f10886a;
        encoderConfig.registerEncoder((Class<U>) l.class, (ObjectEncoder<? super U>) dVar);
        encoderConfig.registerEncoder((Class<U>) f.class, (ObjectEncoder<? super U>) dVar);
        f fVar = f.f10902a;
        encoderConfig.registerEncoder((Class<U>) o.class, (ObjectEncoder<? super U>) fVar);
        encoderConfig.registerEncoder((Class<U>) i.class, (ObjectEncoder<? super U>) fVar);
    }
}
