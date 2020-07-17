package yskim.sample.mindorksdagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class BusinessMathModule {
    @Provides
    Math provideMath(BusinessMath businessMath) {
        return businessMath;
    }
}
