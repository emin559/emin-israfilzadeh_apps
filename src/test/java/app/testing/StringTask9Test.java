package app.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTask9Test {

  private Filterable task;

  @BeforeEach
  void setUp() {
    this.task = new StringTask9();
  }

  @Test
  void filter() {
    String origin = "Wuiolkjhy";
    String expected = "wlkjhy";
    String actual = task.filter(origin);
    assertEquals(expected, actual);
  }
}
