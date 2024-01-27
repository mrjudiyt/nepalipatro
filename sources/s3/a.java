package s3;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* compiled from: AutoProtoEncoderDoNotUseEncoder */
public final class a implements Configurator {

    /* renamed from: a  reason: collision with root package name */
    public static final Configurator f11330a = new a();

    /* renamed from: s3.a$a  reason: collision with other inner class name */
    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class C0197a implements ObjectEncoder<v3.a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0197a f11331a = new C0197a();

        /* renamed from: b  reason: collision with root package name */
        private static final FieldDescriptor f11332b = FieldDescriptor.builder("window").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c  reason: collision with root package name */
        private static final FieldDescriptor f11333c = FieldDescriptor.builder("logSourceMetrics").withProperty(AtProtobuf.builder().tag(2).build()).build();

        /* renamed from: d  reason: collision with root package name */
        private static final FieldDescriptor f11334d = FieldDescriptor.builder("globalMetrics").withProperty(AtProtobuf.builder().tag(3).build()).build();

        /* renamed from: e  reason: collision with root package name */
        private static final FieldDescriptor f11335e = FieldDescriptor.builder("appNamespace").withProperty(AtProtobuf.builder().tag(4).build()).build();

        private C0197a() {
        }

        /* renamed from: a */
        public void encode(v3.a aVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f11332b, (Object) aVar.d());
            objectEncoderContext.add(f11333c, (Object) aVar.c());
            objectEncoderContext.add(f11334d, (Object) aVar.b());
            objectEncoderContext.add(f11335e, (Object) aVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class b implements ObjectEncoder<v3.b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f11336a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final FieldDescriptor f11337b = FieldDescriptor.builder("storageMetrics").withProperty(AtProtobuf.builder().tag(1).build()).build();

        private b() {
        }

        /* renamed from: a */
        public void encode(v3.b bVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f11337b, (Object) bVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class c implements ObjectEncoder<v3.c> {

        /* renamed from: a  reason: collision with root package name */
        static final c f11338a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final FieldDescriptor f11339b = FieldDescriptor.builder("eventsDroppedCount").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c  reason: collision with root package name */
        private static final FieldDescriptor f11340c = FieldDescriptor.builder(Constants.REASON).withProperty(AtProtobuf.builder().tag(3).build()).build();

        private c() {
        }

        /* renamed from: a */
        public void encode(v3.c cVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f11339b, cVar.a());
            objectEncoderContext.add(f11340c, (Object) cVar.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class d implements ObjectEncoder<v3.d> {

        /* renamed from: a  reason: collision with root package name */
        static final d f11341a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final FieldDescriptor f11342b = FieldDescriptor.builder("logSource").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c  reason: collision with root package name */
        private static final FieldDescriptor f11343c = FieldDescriptor.builder("logEventDropped").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private d() {
        }

        /* renamed from: a */
        public void encode(v3.d dVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f11342b, (Object) dVar.b());
            objectEncoderContext.add(f11343c, (Object) dVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class e implements ObjectEncoder<m> {

        /* renamed from: a  reason: collision with root package name */
        static final e f11344a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final FieldDescriptor f11345b = FieldDescriptor.of("clientMetrics");

        private e() {
        }

        /* renamed from: a */
        public void encode(m mVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f11345b, (Object) mVar.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class f implements ObjectEncoder<v3.e> {

        /* renamed from: a  reason: collision with root package name */
        static final f f11346a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final FieldDescriptor f11347b = FieldDescriptor.builder("currentCacheSizeBytes").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c  reason: collision with root package name */
        private static final FieldDescriptor f11348c = FieldDescriptor.builder("maxCacheSizeBytes").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private f() {
        }

        /* renamed from: a */
        public void encode(v3.e eVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f11347b, eVar.a());
            objectEncoderContext.add(f11348c, eVar.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder */
    private static final class g implements ObjectEncoder<v3.f> {

        /* renamed from: a  reason: collision with root package name */
        static final g f11349a = new g();

        /* renamed from: b  reason: collision with root package name */
        private static final FieldDescriptor f11350b = FieldDescriptor.builder("startMs").withProperty(AtProtobuf.builder().tag(1).build()).build();

        /* renamed from: c  reason: collision with root package name */
        private static final FieldDescriptor f11351c = FieldDescriptor.builder("endMs").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private g() {
        }

        /* renamed from: a */
        public void encode(v3.f fVar, ObjectEncoderContext objectEncoderContext) {
            objectEncoderContext.add(f11350b, fVar.b());
            objectEncoderContext.add(f11351c, fVar.a());
        }
    }

    private a() {
    }

    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder((Class<U>) m.class, (ObjectEncoder<? super U>) e.f11344a);
        encoderConfig.registerEncoder((Class<U>) v3.a.class, (ObjectEncoder<? super U>) C0197a.f11331a);
        encoderConfig.registerEncoder((Class<U>) v3.f.class, (ObjectEncoder<? super U>) g.f11349a);
        encoderConfig.registerEncoder((Class<U>) v3.d.class, (ObjectEncoder<? super U>) d.f11341a);
        encoderConfig.registerEncoder((Class<U>) v3.c.class, (ObjectEncoder<? super U>) c.f11338a);
        encoderConfig.registerEncoder((Class<U>) v3.b.class, (ObjectEncoder<? super U>) b.f11336a);
        encoderConfig.registerEncoder((Class<U>) v3.e.class, (ObjectEncoder<? super U>) f.f11346a);
    }
}
