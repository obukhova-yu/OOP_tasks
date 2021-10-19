package objects_tests

open class Outer {
    protected class Nested {
        public val e: Int = 5
    }
}

private class Subclass : Outer() {

}

internal class Unrelated {

}