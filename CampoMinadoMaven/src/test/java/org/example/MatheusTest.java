package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MatheusTest {

    @Test
    @DisplayName("Teste positivo")
    public void testarPositivo() {
        Assertions.assertEquals(0 , 2 % 2);
    }
}
