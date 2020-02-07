import java.awt.Color;
import java.awt.Font; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ventana extends JFrame implements ActionListener {



    public float resultado = 0;
    public String resultadoString = "0";

    private JLabel texto;           // etiqueta o texto no editable
    private JTextField caja;        // caja de texto, para insertar datos
    private JTextField caja2;
    private JButton botonsum;          // boton con una determinada accion
    private JButton botonres;
    private JButton botonmul;
    private JButton botondiv;
    private JButton botonpot;
    private JButton botonrai;
    private JButton botonlog;
    private JButton botonume;
    private JButton botonans;
    private JButton botonext;
    private JButton botonfac;

    public Ventana() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setTitle("Calculadora");                          // colocamos titulo a la ventana
        this.setSize(590, 560);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(true);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    public Font fuente = new Font("Calibri",3,19);

    private void inicializarComponentes() {
        // creamos los componentes
        texto = new JLabel();
        caja = new JTextField();
        caja2 = new JTextField();
        botonsum = new JButton();
        botonres = new JButton();
        botonmul = new JButton();
        botondiv = new JButton();
        botonpot = new JButton();
        botonrai = new JButton();
        botonlog = new JButton();
        botonume = new JButton();
        botonans = new JButton();
        botonext = new JButton();
        botonfac = new JButton();

        Font fuente2 = new Font("Calibri",3,30);
        // configuramos los componentes
        texto.setText(resultadoString);    // colocamos un texto a la etiqueta
        texto.setBounds(65, 40, 620, 45); // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        texto.setFont(fuente2);
        caja.setFont(fuente);
        caja.setBounds(50, 100, 480, 45);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        caja2.setFont(fuente);
        caja2.setBounds(50, 150, 480, 45);
        caja.setText("DATO 1");
        caja2.setText("DATO 2");
        botonsum.setFont(fuente);
        botonsum.setText("+");   // colocamos un texto al boton
        botonsum.setBounds(50, 250, 75, 75);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        botonsum.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        botonsum.setActionCommand("Suma");
        botonres.setFont(fuente);
        botonres.setText("-");   // colocamos un texto al boton
        botonres.setBounds(50, 350, 75, 75);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        botonres.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        botonres.setActionCommand("Resta");
        botonmul.setFont(fuente);
        botonmul.setText("X");   // colocamos un texto al boton
        botonmul.setBounds(150, 250, 75, 75);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        botonmul.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        botonmul.setActionCommand("Multi");
        botondiv.setFont(fuente);
        botondiv.setText("/");   // colocamos un texto al boton
        botondiv.setBounds(150, 350, 75, 75);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        botondiv.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        botondiv.setActionCommand("Divi");
        botonpot.setFont(fuente);
        botonpot.setText("^");   // colocamos un texto al boton
        botonpot.setBounds(250, 250, 75, 75);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        botonpot.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        botonpot.setActionCommand("Pote");
        botonrai.setFont(fuente);
        botonrai.setText("^1/x");
        botonrai.setBounds(250, 350, 75, 75);
        botonrai.addActionListener(this);      
        botonrai.setActionCommand("Raiz");
        botonlog.setFont(fuente);
        botonlog.setText("log");
        botonlog.setBounds(350, 250, 75, 75);
        botonlog.addActionListener(this);      
        botonlog.setActionCommand("Loga");
        botonume.setFont(fuente);
        botonume.setText("e");
        botonume.setBounds(350, 350, 75, 75);
        botonume.addActionListener(this);      
        botonume.setActionCommand("Nume");
        botonans.setFont(fuente);
        botonans.setText("Ans");
        botonans.setBounds(450, 250, 75, 175);
        botonans.addActionListener(this);      
        botonans.setActionCommand("Answ");
        botonans.setFont(fuente);
        botonext.setText("...");
        botonext.setBounds(50, 450, 75, 25);
        botonext.addActionListener(this);      
        botonext.setActionCommand("Ext");

        this.add(texto);
        this.add(caja);
        this.add(caja2);
        this.add(botonsum);
        this.add(botonres);
        this.add(botonmul);
        this.add(botondiv);
        this.add(botonpot);
        this.add(botonrai);
        this.add(botonlog);
        this.add(botonume);
        this.add(botonans);
        this.add(botonext);
        this.add(botonfac);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if(comando.equals("Suma")){
            String datosString = caja.getText();                                 // obtenemos el contenido de la caja de texto
            String datosString2 = caja2.getText();
            float datos1 = Float.parseFloat(datosString);
            float datos2 = Float.parseFloat(datosString2);
            resultado = datos1 + datos2;
            resultadoString = Float.toString(resultado);
            texto.setText(resultadoString);
        }
        if(comando.equals("Resta")){
            String datosString = caja.getText();                                 // obtenemos el contenido de la caja de texto
            String datosString2 = caja2.getText();
            float datos1 = Float.parseFloat(datosString);
            float datos2 = Float.parseFloat(datosString2);
            resultado = datos1 - datos2;
            resultadoString = Float.toString(resultado);
            texto.setText(resultadoString);
        }
        if(comando.equals("Multi")){
            String datosString = caja.getText();                                 // obtenemos el contenido de la caja de texto
            String datosString2 = caja2.getText();
            float datos1 = Float.parseFloat(datosString);
            float datos2 = Float.parseFloat(datosString2);
            resultado = datos1 * datos2;
            resultadoString = Float.toString(resultado);
            texto.setText(resultadoString);
        }
        if(comando.equals("Divi")){
            String datosString = caja.getText();                                 // obtenemos el contenido de la caja de texto
            String datosString2 = caja2.getText();
            float datos1 = Float.parseFloat(datosString);
            float datos2 = Float.parseFloat(datosString2);
            resultado = datos1 / datos2;
            resultadoString = Float.toString(resultado);
            texto.setText(resultadoString);
        }
        if(comando.equals("Pote")){
            double resultadoDouble = Double.parseDouble(resultadoString);
            String datosString = caja.getText();                                 // obtenemos el contenido de la caja de texto
            String datosString2 = caja2.getText();
            double datos1 = Double.parseDouble(datosString);
            double datos2 = Double.parseDouble(datosString2);
            resultadoDouble = Math.pow(datos1,datos2);
            resultadoString = Double.toString(resultadoDouble);
            texto.setText(resultadoString);
        }
        if(comando.equals("Raiz")){
            double resultadoDouble = Double.parseDouble(resultadoString);
            String datosString = caja.getText();                                 // obtenemos el contenido de la caja de texto
            String datosString2 = caja2.getText();
            double datos1 = Double.parseDouble(datosString);
            double datos2 = Double.parseDouble(datosString2);
            resultadoDouble = (Math.round(Math.pow(datos1,1/datos2))*10000)/10000;
            resultadoString = Double.toString(resultadoDouble);
            texto.setText(resultadoString);
        }
        if(comando.equals("Loga")){
            double resultadoDouble = Double.parseDouble(resultadoString);
            String datosString = caja.getText();                                 // obtenemos el contenido de la caja de texto
            String datosString2 = caja2.getText();
            double datos1 = Double.parseDouble(datosString);
            double datos2 = Double.parseDouble(datosString2);
            resultadoDouble = (((Math.log10(datos2))/(Math.log10(datos1))));
            resultadoString = Double.toString(resultadoDouble);
            texto.setText(resultadoString);
        }
        if(comando.equals("Nume")){
            caja2.setText("2.718281828");
        }
        if(comando.equals("Answ")){
            caja.setText(resultadoString);
        }
        if(comando.equals("Ext")){
            botonfac.setFont(fuente);
            botonfac.setText("Fact.");
            botonfac.setBounds(150, 450, 75, 25);
            botonfac.addActionListener(this);
            botonfac.setActionCommand("Fact");
            this.add(botonfac);
        }
        if(comando.equals("Fact")){}
    }

    public static void main(String[] args) {
        Ventana V = new Ventana();      // creamos una ventana
        V.setVisible(true);             // hacemos visible la ventana creada
    }
}