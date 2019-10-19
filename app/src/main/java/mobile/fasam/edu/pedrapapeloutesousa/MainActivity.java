package mobile.fasam.edu.pedrapapeloutesousa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Metodos que pegam a escolha do usuarío
    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("Pedra");
    }
    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("Papel");
    }
    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("Tesoura");
    }



    public void opcaoSelecionada(String escolhaUsuario){
        ImageView imageResultado = findViewById(R.id.imageResultado);
       // TextView textResultado = findViewById(R.id.textResultado);

        //Array que liga os numeros do array numero
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        int numero = new Random().nextInt(3);
        String escolhaApp = opcoes[numero];

        //Troca de imagens onde mostra resultado de saída
        switch(escolhaApp){
            case "Pedra" :
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "Papel" :
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "Tesoura" :
                imageResultado.setImageResource(R.drawable.tesoura);
        }

        /*String usuario, app;
        usuario = escolhaUsuario;
        app = escolhaApp;

        if(usuario == "Pedra" && app == "Tesoura"){
            textResultado.setText("Você ganhou :(");
        }else if (usuario == "Pedra" && app == "Papel"){
            textResultado.setText("Você perdeu :)");
        }
        else if (usuario == "Tesoura" && app == "Papel"){
            textResultado.setText("Você ganhou :(");
        }
        else if (usuario == "Tesoura" && app == "Pedra"){
            textResultado.setText("Você perdeu :)");
        }
        else if (usuario == "Papel" && app == "Tesoura"){
            textResultado.setText("Você perdeu :)");
        }
        else if (usuario == "Papel" && app == "Pedra"){
            textResultado.setText("Você ganhou :(");
        }
        else{
            textResultado.setText("Empatamos :/");
        }*/
    }
}
