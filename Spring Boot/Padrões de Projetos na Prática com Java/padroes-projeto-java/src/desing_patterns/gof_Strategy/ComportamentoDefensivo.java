package desing_patterns.gof_Strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Robo está se movendo defensivamente.");
    }
}
