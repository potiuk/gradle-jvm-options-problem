import static org.junit.Assert.*

import org.gradle.tooling.GradleConnector
import org.junit.Test


class TestBuild {
    @Test
    public void testOptions1() throws Exception {
         def connection = GradleConnector.newConnector().forProjectDirectory(new File('.')).connect();
         def buildLauncher = connection.newBuild().forTasks('tasks')
         buildLauncher.setJvmArguments('-Dtestprop=34')
         buildLauncher.run()
    }

    @Test
    public void testOptions2() throws Exception {
         def connection = GradleConnector.newConnector().forProjectDirectory(new File('.')).connect();
         def buildLauncher = connection.newBuild().forTasks('tasks')
         buildLauncher.run()
    }

}
