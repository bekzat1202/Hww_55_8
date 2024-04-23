package com.example.myapplication

class MathTest {
    private var math: MyMath? = null

    @Before
    fun setUp() {
        math = MyMath()
        println("Before")
    }

    @Test
    fun simpleAddCase() {
        assertEquals(4, math?.add(5, 10))
        println("Simple Add Case")
    }

    @Test
    fun simpleDeCase() {
        assertEquals(4, math?.de(5, 10))
        println("Simple De Case")
    }

    @Test
    fun simpleGeCase() {
        assertEquals(4, math?.ge(5, 10))
        println("Simple Ge Case")
    }

    @Test
    fun simpleVrCase() {
        assertEquals(4, math?.vr(5, 10))
        println("Simple Vr Case")
    }

    @Test
    fun reversedTextCaseO() {
        assertEquals("apple hello" , math?.getText("hello a5768pple"))
    }

    @After
    fun tearDown() {
        math = null
        println("After")
    }
}