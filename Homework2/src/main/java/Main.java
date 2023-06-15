import AirLines.Flight;
import AirLines.Pegasus;
import AirLines.THY;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
   Bir havayolu şirketi bilet alma sistemi tasarlamamız gerekiyor.
   Case 1: En az 2 farklı bilet hesaplama yöntemi olan bir uçuş ssistemi olmalı. Örnel: THY ve Pegasus gibi
   Case2: Yolcu bilet almaya geldiğinde ona boş olan koltuklar gösterilmeli.
   -Bunun için koltuk numaralandırılması önceden yapılabilir.
   -A1, A2, A3, B1,B2,B3 gibi koltuklar doldurulabilir.
   Case 3: Her uçuş şirketinin yurtiçi ve yurtdışına özel davranışları olabili.
   Örnek: Pegasus sadece yurtdışı uçuşlarında yemek veriyordur. Ama THY hem yurtiçi hem
   yurtdışı uçuşlarda bu hizmeti sağlıyordur gibi.

   Case4: Uçaklarda ekonomi ve business koltuğu olan uçaklar varsa hesaplama ona göre yapılmalı.
 */

        Flight flight=new THY(20,new BigDecimal("50"),new BigDecimal("0"),0,true);
        flight.ListAvailableSeats();
        flight.takeTicket("A9");
        flight.takeTicket("A1");
        flight.takeTicket("A2");
        flight.takeTicket("A3");
        flight.takeTicket("A4");
        flight.takeTicket("B4");
        flight.takeTicket("B9");
        flight.takeTicket("B0");

        flight.ListAvailableSeats();


        System.out.println("ALINMAK İSTENEN KOLTUK NUMARASINI GİRİNİZ !(ÖRN : A5)");
        Scanner scanner=new Scanner(System.in);
        flight.takeTicket(scanner.nextLine());

        ((THY) flight).serveFood();


        flight=new Pegasus(20,new BigDecimal("50"),new BigDecimal("0"),0,true);
        flight.ListAvailableSeats();

        flight.takeTicket("A9");
        flight.takeTicket("A1");
        flight.takeTicket("A2");
        flight.takeTicket("A3");
        flight.takeTicket("A4");
        flight.takeTicket("B4");
        flight.takeTicket("B9");
        flight.takeTicket("B0");

        flight.ListAvailableSeats();


        System.out.println("ALINMAK İSTENEN KOLTUK NUMARASINI GİRİNİZ !(ÖRN : A5)");
        flight.takeTicket(scanner.nextLine());

        ((Pegasus) flight).serveFood();
    }
}
