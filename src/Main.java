import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         ElementoMultimediale[] elements = new ElementoMultimediale[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento nel System(1=Immagine , 2=Audio, 3=Video): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            switch (tipo) {
                case 1:
                    System.out.print("scegli la luminosità");
                    int luminositàImg = scanner.nextInt();
                    elements[i] = new Immagine("titolo", luminositàImg);
                    break;
                case 2:
                    System.out.print("scegli la durata");
                    int durataAudio = scanner.nextInt();
                    System.out.println("scegli il volume");
                    int volumeAudio = scanner.nextInt();
                    elements[i] = new RegistrazioneAudio("titolo", durataAudio, volumeAudio);
                    break;
                case 3:
                    System.out.println("scegli la durata");
                    int durataVideo = scanner.nextInt();
                    System.out.println("scegli il volume");
                    int sceltaVolume = scanner.nextInt();
                    System.out.println("scegliLaLuminosità");
                    int regolaLuminosità = scanner.nextInt();
                    elements[i]= new Video("titolo", durataVideo,sceltaVolume,regolaLuminosità);
                    break;
            }

            scanner.close();
    }

    }
}