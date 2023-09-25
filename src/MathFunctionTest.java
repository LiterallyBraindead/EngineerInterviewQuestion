import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathFunctionTest {
    @Test
    public void testAddition(){
        assertEquals("+",InterviewQuestion.mathFunction(2, 3, 5));
    }
    @Test
    public void testSubtraction(){
        assertEquals("-", InterviewQuestion.mathFunction(5,3,2));
    }
    @Test
    public void testDivision(){
        assertEquals("/", InterviewQuestion.mathFunction(6, 3, 2));
    }
    @Test
    public void testDivideByZero(){
        assertEquals("+-", InterviewQuestion.mathFunction(4,0, 4));
    }
    @Test
    public void testMultiplication(){
        assertEquals("*", InterviewQuestion.mathFunction(3,3,9));
    }
    @Test
    public void testOverlapResults(){
        assertEquals("-/", InterviewQuestion.mathFunction(4,2, 2));
    }
}