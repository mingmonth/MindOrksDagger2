package yskim.sample.mindorksdagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class ScienceModule {

    @Provides
    Science provideScience() {
        return new Science();
    }
}
