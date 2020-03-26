package com.acme.todolist.domain;

import org.junit.jupiter.api.Test;
import org.mockito.internal.creation.instance.InstantationException;
import org.springframework.boot.test.context.SpringBootTest;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import junit.framework.TestCase;
import com.acme.todolist.domain.TodoItem;


@SpringBootTest
class TodoItemTest extends TestCase {

  @Test
  public void testFinalContent throws Exception{
  Instant instant = Instant.now().isAfter(getTime().plus(1, ChronoUnit.DAYS));
    TodoItem todo = new TodoItem("id",instant,"content");
    String res = "[LATE!] " + todo.getContent();
    assertEquals(res,todo.finalContent());
  }

}
 