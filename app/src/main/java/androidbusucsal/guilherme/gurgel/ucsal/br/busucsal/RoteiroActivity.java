package androidbusucsal.guilherme.gurgel.ucsal.br.busucsal;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RoteiroActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roteiro);
        TextView numeroRoteiro = findViewById(R.id.numeroRoteiro);
        TextView roteiros = findViewById(R.id.rota);
        Intent intent = getIntent();
        numeroRoteiro.setText(intent.getStringExtra("numeroRoteiro"));
        roteiros.setText(intent.getStringExtra("roteiros"));
    }
}
