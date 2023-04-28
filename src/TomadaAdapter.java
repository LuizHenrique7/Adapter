public class TomadaAdapter extends TomadaDeDoisPinos {
    private ITomadaDeTresPinos tomadaDeTresPinos;

    public TomadaAdapter(ITomadaDeTresPinos tomadaDeTresPinos) {
        this.tomadaDeTresPinos = tomadaDeTresPinos;
    }

    public void conectarTresPinos() {
        System.out.println("Adaptando tomada de dois pinos para tomada de três pinos.");
        tomadaDeTresPinos.conectarTresPinos();
    }

}