package volodko.vyacheslav.ukr.net;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface SaveTo {
    String path();
}