package androidbusucsal.guilherme.gurgel.ucsal.br.busucsal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(MainActivity.this, RoteiroActivity.class);

    }

    public void roteiro1(View view) {
        intent = new Intent(MainActivity.this, RoteiroActivity.class);
        intent.putExtra("numeroRoteiro","Roteiro 1");
        intent.putExtra("roteiros","Única Parada - Av. Paralela (sentido aeroporto) - Ponto do estádio de Pituaçu.");
        MainActivity.this.startActivity(intent);
    }

    public void roteiro2(View view) {
        intent = new Intent(MainActivity.this, RoteiroActivity.class);
        intent.putExtra("numeroRoteiro", "Roteiro 2");
        intent.putExtra("roteiros","1° Parada - Av. Pinto de Aguiar (sentido Paralela) - Atrás do primeiro ponto de ônibus;\n" +
                "2° Parada - Av. Pinto de Aguiar (sentido Paralela) - Ponto do Greenville;\n" +
                "3° Parada - Terminal Pituaçu - 1° andar, Plataforma E, 17.");
        MainActivity.this.startActivity(intent);
    }

    public void roteiro3(View view) {
        intent = new Intent(MainActivity.this, RoteiroActivity.class);
        intent.putExtra("numeroRoteiro", "Roteiro 3");
        intent.putExtra("roteiros","1° Parada - Av. Pinto de Aguiar (sentido Paralela) - Ponto do Greenville;\n" +
                "2° Parada - Av. Pinto de Aguiar (sentido Paralela) - Atrás do primeiro ponto de ônibus;\n" +
                "3° Parada - Av. Paralela (sentido aeroporto) - Ponto Estádio Pituaçu.");
        startActivity(intent);
    }

    public void roteiro4(View view) {
        intent = new Intent(MainActivity.this, RoteiroActivity.class);
        intent.putExtra("numeroRoteiro", "Roteiro 4");
        intent.putExtra("roteiros","1° Parada - Av. Pinto de Aguiar (sentido Paralela) - Ponto do Greenville;\n" +
                "2° Parada - Av. Paralela (sentido centro) - Ponto Estádio Pituaçu.\n" +
                "3° Parada - Av. Paralela (sentido centro) - Ponto Extra paralela;\n" +
                "4° Parada - Av. Paralela (sentido aeroporto) - Ponto Extra paralela;\n" +
                "5° Parada - Avenida Luis Viana Filho (sentido aeroporto) - Ponto do estádio Pituaçu.");
        MainActivity.this.startActivity(intent);
    }

    public void roteiro5(View view) {
        intent = new Intent(MainActivity.this, RoteiroActivity.class);
        intent.putExtra("numeroRoteiro", "Roteiro 5");
        intent.putExtra("roteiros","1° Parada - Av. Pinto de Aguiar (sentido orla) - Ponto do Greenville;\n" +
                "2° Parada - Av. Pinto de Aguiar (sentido Paralela) - Atrás do primeiro ponto de ônibus;\n" +
                "3° Parada - Av. Paralela (sentido aeroporto) - Ponto Wall Street Empresarial;\n" +
                "4° Parada - Av. Paralela (sentido aeroporto) - Ponto Posto Menor Preço;\n" +
                "5° Parada - Av. Paralela (sentido centro) - Ponto em frente ao Colégio Villa;\n" +
                "6° Parada - Av. Paralela (sentido centro) - Ponto próximo a entrada do Flamboyant;\n" +
                "7° Parada - Av. Paralela (sentido centro) - Ponto em frente ao Condomínio Brisas;\n" +
                "8° Parada - Av. Paralela (sentido centro) - Ponto Estação de Metrô Pituaçu;\n" +
                "9° Parada - Av. Paralela (sentido centro) - Ponto Extra paralela;\n" +
                "10° Parada - Av. Paralela (sentido aeroporto) - Ponto Extra paralela;\n" +
                "11° Parada - Av. Paralela (sentido aeroporto) - Ponto Estádio Pituaçu.");
        MainActivity.this.startActivity(intent);

    }

    public void itinerario(View view) {
        intent = new Intent(MainActivity.this, ItinerarioActivity.class);

        MainActivity.this.startActivity(intent);
    }
}
