import io.vertx.core.Vertx;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.Repeat;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by vladimir-k on 14/08/2018.
 */
@RunWith(VertxUnitRunner.class)
public class TestDiningPhilosophers {

    @Rule
    public RunTestOnContext rule = new RunTestOnContext();

    @Test(timeout = 5000)
    @Repeat(1000)
    public void testNoDeadLocksPossible(TestContext context) {
        Vertx vertx = rule.vertx();
        vertx.deployVerticle(new Philosopher());


    }
}
