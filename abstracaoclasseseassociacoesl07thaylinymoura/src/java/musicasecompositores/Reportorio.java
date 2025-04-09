package java.musicasecompositores;
import java.util.Arrays;

public class Reportorio
{

    public class Repertorio {

        public static void main(String[] args) {

            Compositor c1 = new Compositor("Tom Jobim", "Brasileiro");
            Compositor c2 = new Compositor("Vinicius de Moraes", "Brasileiro");

            Musica musica = new Musica("Garota de Ipanema", 1962, "Bossa Nova", Arrays.asList(c1, c2));

            System.out.println(musica);

        }

    }
}
