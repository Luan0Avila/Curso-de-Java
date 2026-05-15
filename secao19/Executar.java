package secao19;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Em tempo de execução
@Target(ElementType.METHOD) // Aplicada em métodos
@interface Executar {
    int vezes() default 1;
}
