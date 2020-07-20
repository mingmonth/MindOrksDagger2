package yskim.sample.mindorksdagger2;

import javax.inject.Inject;
import javax.inject.Singleton;

public class Science {

    private String name;

    public Science(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    @Inject
//    public Science() {
//    }
}
