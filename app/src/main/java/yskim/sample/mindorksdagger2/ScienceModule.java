package yskim.sample.mindorksdagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class ScienceModule {

    private String name;

    public ScienceModule(String name) {
        this.name = name;
    }

    @Provides
    @Singleton
    Science provideScience() {
        return new Science(name);
    }
}
