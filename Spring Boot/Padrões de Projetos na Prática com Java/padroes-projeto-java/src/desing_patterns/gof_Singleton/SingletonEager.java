package desing_patterns.gof_Singleton;

/*
 *
 * Singleton "Apressado"
 *
 * @author JonhDev
 *
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){

        return instancia;
    }

}
