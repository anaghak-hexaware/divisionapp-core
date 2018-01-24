package com.anagha;
import org.junit.Test;
import com.anagha.Division;
public class DivisionTest {
    @Test
    public void testing() {
    float a=200f,b=74f;
    Division d= new Division();
    float result=d.div(a,b);
    System.out.println(result);
}
}