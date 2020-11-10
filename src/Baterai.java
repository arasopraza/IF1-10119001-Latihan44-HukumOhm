public class Baterai {
    private float kuatArus, hambatan;

    public Baterai() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat Arus yang mengalir pada suatu kawat penghantar\n"
        + "akan berbanding lurus dengan beda potensial\n"
        + "pada ujung-ujung kawat penghantar tersebut\n"
        + "asalkan suhu kawat dijaga konstan.\n");
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan() {
        return kuatArus * hambatan;
    }
}
