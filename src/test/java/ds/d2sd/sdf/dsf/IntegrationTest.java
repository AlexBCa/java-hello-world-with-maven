package ds.d2sd.sdf.dsf;

import ds.d2sd.sdf.dsf.Git2App;
import ds.d2sd.sdf.dsf.config.AsyncSyncConfiguration;
import ds.d2sd.sdf.dsf.config.EmbeddedSQL;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = {Git2App.class, AsyncSyncConfiguration.class})
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
