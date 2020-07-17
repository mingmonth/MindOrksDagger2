package yskim.sample.mindorksdagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class PureMathModule {
    @Provides
    Math provideMath(PureMath pureMath) {
        return pureMath;
    }
}
