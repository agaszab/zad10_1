import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IOException {

        int ileLiczb=0;

        Scanner scan=new Scanner(System.in);
        System.out.println ("Ile liczb chcesz wprowadzić? ");
        ileLiczb=scan.nextInt();
        String napis="";

        double[] liczby = new double[ileLiczb];
        scan.nextLine();

        FileWriter fileWriter=new FileWriter ("liczby.txt");
        BufferedWriter bw = new BufferedWriter(fileWriter);
        scan.useLocale(Locale.US);
        for (int i = 0; i < liczby.length; i++) {
        System.out.println ("Podaj liczbę: ");
        liczby[i]=scan.nextDouble();
        napis+=" "+liczby[i];

        }
        bw.write(napis);

        bw.close();
    }
}
