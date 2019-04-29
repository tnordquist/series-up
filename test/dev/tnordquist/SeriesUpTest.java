package dev.tnordquist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SeriesUpTest {

  private static Object[][] seriesUp() {
    return new Object[][]{

        { new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4},4}

    };
  }

  @ParameterizedTest
  @MethodSource
  void seriesUp(int[] expected, int n) {

    int[] actual = SeriesUp.seriesUp(n);
    assertArrayEquals(expected,actual);

  }
}