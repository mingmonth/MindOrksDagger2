package yskim.sample.mindorksdagger2;

import dagger.Module;
import dagger.Provides;

@Module
abstract class ScienceModule {

    @Provides
    static Science provideScience() {
        return new Science();
    }
}
