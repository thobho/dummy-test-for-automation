import org.junit.Test
import java.lang.RuntimeException
import kotlin.test.assertTrue

class NoPackageTest {
    @Test
    fun fail(){
//        assertTrue { false }
    }

    @Test
    fun pass(){

    }

    @Test
    fun error(){
//        throw RuntimeException()
    }
}