public class Immagine implements ElementoMultimediale {
    String titolo;
    int luminosità;

    public Immagine(String titolo, int luminosità) {
        this.titolo = titolo;
        this.luminosità = luminosità;
    }

    @Override
    public String getTitolo() {
        return titolo;
    }

    public int aumentoLuminosità () {
        if(luminosità <10) {
            luminosità ++;
        }
        return luminosità;
    }
    public int diminuisciLuminosità () {
        if (luminosità > 0) {
            luminosità--;
        }
        return luminosità;

    }

    public void showMethod() {
        System.out.println(titolo + "" + "*".repeat(luminosità));
    }
}
