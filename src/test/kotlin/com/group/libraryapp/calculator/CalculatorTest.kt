package com.group.libraryapp.calculator

fun main(){
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiplyTest()
    calculatorTest.divideTest()
}

class CalculatorTest {

    fun addTest(){
        //given : 테스트를 준비
        val calculator = Calculator(5)

        //when : 테스트 하고 싶은 기능을 호출
        calculator.add(3)

        //then : 결과를 검증
        if (calculator.number != 8){
            throw IllegalStateException()
        }

        /*val expectedCalculator = Calculator(8)

        if (calculator != expectedCalculator){
            throw IllegalStateException()
        } data class and private var number 일 때 */
    }

    fun minusTest(){
        //given : 테스트를 준비
        val calculator = Calculator(5)

        //when : 테스트 하고 싶은 기능을 호출
        calculator.minus(3)

        //then : 결과를 검증
        if (calculator.number != 2){
            throw IllegalStateException()
        }
    }

    fun multiplyTest(){
        //given : 테스트를 준비
        val calculator = Calculator(5)

        //when : 테스트 하고 싶은 기능을 호출
        calculator.multiply(3)

        //then : 결과를 검증
        if (calculator.number != 15){
            throw IllegalStateException()
        }
    }

    fun divideTest(){
        //given : 테스트를 준비
        val calculator = Calculator(5)

        //when : 테스트 하고 싶은 기능을 호출
        calculator.divide(2)

        //then : 결과를 검증
        if (calculator.number != 2){
            throw IllegalStateException()
        }
    }

    fun divideExceptionTest(){
        //given : 테스트를 준비
        val calculator = Calculator(5)

        //when : 테스트 하고 싶은 기능을 호출
        try {
            calculator.divide(0)
        }catch (e: IllegalArgumentException){
            if (e.message != "0으로 나눌 수 없습니다"){
                throw IllegalStateException("메시지가 다릅니다")
            }
        } catch (e: Exception){
            throw IllegalStateException()
        }
        throw  IllegalStateException("기대하는 예외가 발생하지 않았습니다.")
    }
}