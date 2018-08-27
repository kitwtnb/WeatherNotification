import io.kotlintest.shouldBe
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object SampleTest: Spek({
    describe("a statement") {
        on("addition with 1 + 1") {
            it("return to 2") {
                (1 + 1) shouldBe 2
            }
        }
    }
})
