package springdemo;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public abstract class AbstractClass1 {
  private final ConcreteDependance1 concreteDependance1;
  private final ConcreteDependance2 concreteDependance2;
}
