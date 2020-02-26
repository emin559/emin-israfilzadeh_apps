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

    origin = "auioe";
    expected = "";
    actual = task.filter(origin);
    assertEquals(expected, actual);

    origin = "auo";
    expected = "";
    actual = task.filter(origin);
    assertEquals(expected, actual);

    origin = "AUO";
    expected = "";
    actual = task.filter(origin);
    assertEquals(expected, actual);

    origin = "VOKLUEAUO";
    expected = "vkl";
    actual = task.filter(origin);
    assertEquals(expected, actual);

    origin = "WEroiKljMhgV";
    expected = "wrkljmhgv";
    actual = task.filter(origin);
    assertEquals(expected, actual);
  }
}
