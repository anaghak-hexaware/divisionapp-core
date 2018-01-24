package com.anagha;
import org.junit.Test;
import com.anagha.division;
public class DivisionTest {
    @Test
    public void testing() {
    int a=200,b=74;
    Division d= new Division();
    float result=d.div(a,b);
    System.out.println(result);
}
}