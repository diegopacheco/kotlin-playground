import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FirstSpec : FunSpec({
    test("my first test") {
        1 + 2 shouldBe  3
    }
})