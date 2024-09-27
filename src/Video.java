public class Video extends RegistrazioneAudio {

    private int luminosità;

    public Video (String titolo, int durata, int volume, int luminosità) {
        super(titolo, durata, volume);
        this.luminosità = luminosità;
    }

    public int getLuminosità() {
        return luminosità;
    }

    public int aumentaLumisonità() {
        if(luminosità < 10) {
            luminosità ++;
        }
        return luminosità;
    }
    public  int diminuisciLuminosità() {
        if(luminosità > 0) {
            luminosità--;
        }
        return luminosità;
    }


    public void play() {
        System.out.println(titolo + "!".repeat(getVolume()) + " " + "*".repeat(luminosità));
    }
}
