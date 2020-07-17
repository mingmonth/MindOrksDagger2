package yskim.sample.mindorksdagger2;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
abstract class PureMathModule3 {
    @Binds
    abstract Math provideMath(PureMath pureMath);
}
