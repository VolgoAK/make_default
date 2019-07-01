import com.attiladroid.makedefault.makeDefault
import org.junit.Test

class CreatorSimpleTests {

    @Test
    fun createPersonTest() {
        val person = makeDefault<Person>()
        println(person)
    }

}

data class Person(val name: String, val surname: String)