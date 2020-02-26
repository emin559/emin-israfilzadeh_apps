package app.task2602;

import app.testing.Filterable;
import app.testing.StringTask9;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class arraylistTest {

  private arraylist task;

  @BeforeEach
  void setUp() {
    this.task = new arraylist();
  }

  @Test
  void mergeArray() {
    ArrayList<Integer> al1 = new ArrayList<Integer>();
    ArrayList<Integer> al2 = new ArrayList<Integer>();

    al1.add(1);
    al1.add(2);
    al1.add(3);
    al1.add(4);
    al1.add(5);

    al2.add(1);
    al2.add(2);
    al2.add(35);
    al2.add(41);
    al2.add(51);

    ArrayList<Integer> al3 = new ArrayList<Integer>();
    al3.add(1);
    al3.add(2);
    al3.add(3);
    al3.add(4);
    al3.add(5);
    al3.add(35);
    al3.add(41);
    al3.add(51);

    ArrayList<Integer> origin1 = al1;
    ArrayList<Integer> origin2 = al2;
    ArrayList<Integer> expected = al3;
    ArrayList<Integer> actual = (ArrayList<Integer>)task.mergeArray(origin1, origin2);
    assertEquals(expected, actual);

  }

}