package yskim.sample.mindorksdagger2;

import dagger.Module;
import dagger.Provides;

@Module
abstract class PureMathModule2 {
    @Provides
    static Math provideMath(PureMath pureMath) {
        return pureMath;
    }
}
