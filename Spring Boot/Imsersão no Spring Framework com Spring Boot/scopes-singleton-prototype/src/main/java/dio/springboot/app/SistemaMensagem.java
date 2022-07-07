package dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem {

    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente boasVindas;

    public void enviarConfirmacaoCadastro(){
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas(){
        boasVindas.setEmail("joao.carlos.schwab.zanardi@gmail.com");
        System.out.println(boasVindas);
        System.out.println("Bem vindo ao mundo Spring Boot");
    }
}
