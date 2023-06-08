import User.*;
import Car.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ARAÇ KİRALAMA SİSTEMİNE HOŞGELDİNİZ!" +
                "\nLÜTFEN HESAP TİPİNİ BELİRLEYİN" +
                "\n 1.ŞİRKET" +
                "\n 2.KİŞİSEL");
        int secim=scanner.nextInt();
        User user=null;
        switch (secim)
        {
            case 1->user= new Company();
            case 2->user=new Citizen();
        }
        boolean res;
        List<Car> carList=new ArrayList<>();
        carList.add(new HatchBack("Black",500,2013, new BigDecimal("451.13")));
        carList.add(new HatchBack("Blue",400,2006, new BigDecimal("150.99")));

        carList.add(new HatchBack("White",300,2004, new BigDecimal("300.123")));

        carList.add(new Sedan("White",250,2023, new BigDecimal("180")));
        carList.add(new Sedan("Black",600,1996, new BigDecimal("20.121")));
        carList.add(new SUV("Black",380,1992, new BigDecimal("324.21")));
        carList.add(new SUV("White",450,1990, new BigDecimal("500")));
        carList.add(new SUV("Blue",355,1993, new BigDecimal("213.34")));
        carList.add(new SUV("Black",416,1998, new BigDecimal("180")));
        do {
             res=false;
            System.out.println("ARACLARIMIZ");
            System.out.println("------------------------------------------------------------");
            System.out.println( "SUV+"+"\t"+"YIL"+"\t"+"BAGAJ KAPASİTESİ"+"\t"+"RENK"+"\t"+"GÜNLÜK");
            System.out.println("------------------------------------------------------------");
            for (int i=0;i<carList.size();i++) {

                if((user instanceof Citizen && carList.get(i) instanceof HatchBack) || user instanceof Company)
                {
                    System.out.println("------------------------------------------------------------");
                    System.out.println((i+1)+"\t"+carList.get(i).toString());
                    System.out.println("------------------------------------------------------------");
                }

            }
            System.out.println("KİRALAMAK İSTEDİĞİNİZ ARACIN NUMARASINI YAZINIZ!");
            secim=scanner.nextInt()-1;
            System.out.println("KİRALAMAK İSTEDİĞİNİZ ARAÇ");
            System.out.println("------------------------------------------------------------");
            System.out.println((secim+1)+"\t"+carList.get(secim).toString());
            System.out.println("------------------------------------------------------------");
            Car toBeRented= carList.get(secim);
            System.out.println("KİRALAMA TİPİNİ SEÇİNİZ !" +
                    "\n1.GÜNLÜK" );
            if(!(toBeRented instanceof HatchBack))
                System.out.println( "2.AYLIK");
            secim=scanner.nextInt();
            System.out.println("Arabayı ne kadar süreyle kiralamak istersiniz?");
            int duration=scanner.nextInt();
            BigDecimal cost=null;
            if (secim == 2) {
                cost = toBeRented.CostByMonthly(duration);
            } else {
                cost = toBeRented.CostByDaily(duration);
            }
            if((toBeRented instanceof HatchBack))
                cost=toBeRented.CostByDaily(duration);
            System.out.println("ÖDENECEK TUTAR  :"+cost);
            System.out.println("BAŞKA BİR İŞLEM YAPMAK İSTER MİSİNİZ?" +
                    "\n1.EVET" +
                    "\n2.HAYIR");
            secim=scanner.nextInt();
            if(secim==1)
            {
                res=true;
            }
        }while (res);

    }
}
