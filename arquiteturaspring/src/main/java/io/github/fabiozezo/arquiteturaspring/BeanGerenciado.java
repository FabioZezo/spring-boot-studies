package io.github.fabiozezo.arquiteturaspring;

import io.github.fabiozezo.arquiteturaspring.todos.TodoEntity;
import io.github.fabiozezo.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanGerenciado {

    //Injeção via propriedade
    //Menos recomendada, não passa a ideia de obrigatoriedade nem de opcionalidade
    //e você não pdoe mudar a instancia, sepmpre ira injetar a mesma instancia.
    @Autowired
    private TodoValidator validator;

    //Injeção via construtor
    //recomendado pelo Spring, passa a ideia de obrigatoriedade.
    //É obrigatório para o funcionamento.
    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }

    //Injeção via setter
    //Opção menos comum de ser utilizada, passa a ideia de opcionalidade.
    //É opcional e você pode mudar a implementação.
    @Autowired
    public void setValidator(TodoValidator validator){
        this.validator = validator;
    }

    public void utilizar(){
        var todo = new TodoEntity();
        validator.validar(todo);
    }
}
