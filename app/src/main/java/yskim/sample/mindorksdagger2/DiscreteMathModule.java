package yskim.sample.mindorksdagger2;

import dagger.Binds;
import dagger.Module;

@Module
abstract class DiscreteMathModule {
    @Binds
    abstract Math bindMath(DiscreteMath discreteMath);
}
