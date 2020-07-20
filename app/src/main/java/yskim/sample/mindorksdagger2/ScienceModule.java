package yskim.sample.mindorksdagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
abstract class ScienceModule {

    @Provides
    @Singleton
    static Science provideScience() {
        return new Science();
    }
}
