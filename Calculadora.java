import java.awt.Color;
import java.awt.Font; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener {



    public float resultado = 0;
    public String resultadoString = "0";

    private JLabel texto;         
    private JTextField caja;      
    private JTextField caja2;
    private JButton botonsum;        
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
    private JButton botonsol;
    private JButton botoncre;

    public Calculadora() {
        super();                   
        configurarVentana();       
        inicializarComponentes(); 
    }

    private void configurarVentana() {
        this.setTitle("Calculadora");                       
        this.setSize(590, 560);                                
        this.setLocationRelativeTo(null);                     
        this.setLayout(null);                                 
        this.setResizable(false);                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public Font fuente = new Font("Calibri",1,19);

    private void inicializarComponentes() {
        
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
        botonsol = new JButton();
        botoncre = new JButton();

        Font fuente2 = new Font("Calibri",1,40);
        Font fuente3 = new Font("Calibri",1,25);

        botonsol.setBounds(50,30,480,65);
        botonsol.setBackground(Color.white);
        botonsol.setText(resultadoString);   
        botonsol.setFont(fuente2);
        caja.setFont(fuente);
        caja.setBounds(50, 100, 480, 45);  
        caja2.setFont(fuente);
        caja2.setBounds(50, 150, 480, 45);
        caja.setText("DATO 1");
        caja2.setText("DATO 2");
        botonsum.setFont(fuente3);
        botonsum.setText("+");  
        botonsum.setBounds(50, 250, 75, 75); 
        botonsum.addActionListener(this);      
        botonsum.setActionCommand("Suma");
        botonsum.setBackground(Color.white);
        botonres.setFont(fuente3);
        botonres.setText("-"); 
        botonres.setBounds(50, 350, 75, 75); 
        botonres.addActionListener(this);    
        botonres.setActionCommand("Resta");
        botonres.setBackground(Color.white);
        botonmul.setFont(fuente);
        botonmul.setText("X");  
        botonmul.setBounds(150, 250, 75, 75);  
        botonmul.addActionListener(this);      
        botonmul.setActionCommand("Multi");
        botonmul.setBackground(Color.white);
        botondiv.setFont(fuente);
        botondiv.setText("/");   
        botondiv.setBounds(150, 350, 75, 75); 
        botondiv.addActionListener(this);     
        botondiv.setActionCommand("Divi");
        botondiv.setBackground(Color.white);
        botonpot.setFont(fuente3);
        botonpot.setText("^");  
        botonpot.setBounds(250, 250, 75, 75); 
        botonpot.addActionListener(this);     
        botonpot.setActionCommand("Pote");
        botonpot.setBackground(Color.white);
        botonrai.setFont(fuente);
        botonrai.setText("^1/x");
        botonrai.setBounds(250, 350, 75, 75);
        botonrai.addActionListener(this);      
        botonrai.setActionCommand("Raiz");
        botonrai.setBackground(Color.white);
        botonlog.setFont(fuente3);
        botonlog.setText("log");
        botonlog.setBounds(350, 250, 75, 75);
        botonlog.addActionListener(this);      
        botonlog.setActionCommand("Loga");
        botonlog.setBackground(Color.white);
        botonume.setFont(fuente3);
        botonume.setText("e");
        botonume.setBounds(350, 350, 75, 75);
        botonume.addActionListener(this);      
        botonume.setActionCommand("Nume");
        botonume.setBackground(Color.white);
        botonans.setText("Ans");
        botonans.setBounds(450, 250, 75, 175);
        botonans.addActionListener(this);      
        botonans.setActionCommand("Answ");
        botonans.setFont(fuente3);
        botonans.setBackground(Color.white);
        botoncre.addActionListener(this);
        botoncre.setBounds(350, 450, 170, 25);
        botoncre.setText("INFORMACION");     
        botoncre.setActionCommand("Crea");
        botoncre.setFont(fuente);
        botoncre.setBackground(Color.white);

        this.add(botonsol);
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
        this.add(botoncre);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if(comando.equals("Suma")){

            String datosString = caja.getText();                                 
            String datosString2 = caja2.getText();
            float datos1 = Float.parseFloat(datosString);
            float datos2 = Float.parseFloat(datosString2);
            resultado = datos1 + datos2;
            resultadoString = Float.toString(resultado);
            botonsol.setText(resultadoString);

        }
        
        if(comando.equals("Resta")){
            String datosString = caja.getText();                                 
            String datosString2 = caja2.getText();
            float datos1 = Float.parseFloat(datosString);
            float datos2 = Float.parseFloat(datosString2);
            resultado = datos1 - datos2;
            resultadoString = Float.toString(resultado);
            botonsol.setText(resultadoString);
        
        }
        
        if(comando.equals("Multi")){
            String datosString = caja.getText();                                
            String datosString2 = caja2.getText();
            float datos1 = Float.parseFloat(datosString);
            float datos2 = Float.parseFloat(datosString2);
            resultado = datos1 * datos2;
            resultadoString = Float.toString(resultado);
            botonsol.setText(resultadoString);
        }
        
        if(comando.equals("Divi")){
            String datosString = caja.getText();                              
            String datosString2 = caja2.getText();
            float datos1 = Float.parseFloat(datosString);
            float datos2 = Float.parseFloat(datosString2);
            resultado = datos1 / datos2;
            resultadoString = Float.toString(resultado);
            botonsol.setText(resultadoString);
        }
        
        if(comando.equals("Pote")){
            double resultadoDouble = Double.parseDouble(resultadoString);
            String datosString = caja.getText();                              
            String datosString2 = caja2.getText();
            double datos1 = Double.parseDouble(datosString);
            double datos2 = Double.parseDouble(datosString2);
            resultadoDouble = Math.pow(datos1,datos2);
            resultadoString = Double.toString(resultadoDouble);
            botonsol.setText(resultadoString);
        }
        
        if(comando.equals("Raiz")){
            double resultadoDouble = Double.parseDouble(resultadoString);
            String datosString = caja.getText();                               
            String datosString2 = caja2.getText();
            double datos1 = Double.parseDouble(datosString);
            double datos2 = Double.parseDouble(datosString2);
            resultadoDouble = (Math.round(Math.pow(datos1,1/datos2))*10000)/10000;
            resultadoString = Double.toString(resultadoDouble);
            botonsol.setText(resultadoString);
        }
        
        if(comando.equals("Loga")){
            double resultadoDouble = Double.parseDouble(resultadoString);
            String datosString = caja.getText();                                
            String datosString2 = caja2.getText();
            double datos1 = Double.parseDouble(datosString);
            double datos2 = Double.parseDouble(datosString2);
            resultadoDouble = (((Math.log10(datos2))/(Math.log10(datos1))));
            resultadoString = Double.toString(resultadoDouble);
            botonsol.setText(resultadoString);
        }
        
        if(comando.equals("Nume")){
            caja2.setText("2.718281828");
        }
        
        if(comando.equals("Answ")){
            caja.setText(resultadoString);
        }
        if(comando.equals("Crea")){
        JOptionPane.showMessageDialog(null, "Instrucciones:\nIntroduce los datos en la caja de datos para sumar, restar, multiplicar y dividir.\nEn el caso de las potencias, raices y logaritmos, el DATO 2 es la base y el DATO 1 el digito a operar.\nEn el caso del numero e, cuando la tecla sea pulsada, se introducira el digito en DATO 2 automaticamente.\n\nCalculadoraV2.2\nPrograma creado por Alejandro Recarte\nMas informacion en: https://github.com/AlexRecarte");

        }
    }

    public static void main(String[] args) {
        Calculadora V = new Calculadora();  
        V.setVisible(true);            
    }
}