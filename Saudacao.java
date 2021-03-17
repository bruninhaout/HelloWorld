import java.util.Date;
import java.text.SimpleDateFormat;


class Saudacao {

  public void digaOi(){
    //System.out.println("Hello world!");

    Date data = new Date();
    SimpleDateFormat mascara = new SimpleDateFormat("HH");

    //System.out.println("Data = " + data.getHours());
    //int hora = data.getHours() - 3;

    String horatxt  = mascara.format(data);
    int hora = Integer.parseInt(horatxt);

    System.out.println(hora);
    System.out.println(data);
  
    if(hora > 18){
      System.out.println("Boa noite");
    }else if(hora < 12){
      System.out.println("Bom dia");
    }else{
      System.out.println("Boa Tarde");
    }
    System.out.println("Oiiiee");
    System.out.println("da seducao");

  }

}