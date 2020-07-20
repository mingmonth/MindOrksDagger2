package yskim.sample.mindorksdagger2;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ScienceModule.class)
public interface AppComponent {

    Science getScience();
}
