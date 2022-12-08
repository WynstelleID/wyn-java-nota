import java.util.Scanner;
class nota {
    public static void main(String[] args) {
        String customerName;
        int customerTotal, nasgorOrder, ayamBakarOrder, steakOrder, kwetiawOrder, kambingOrder;
        double nasiGoreng = 9999.99, ayamBakar = 12345.67, steakSirloin = 21108.40, kwetiawSiram = 13579.13, kambingGuling = 98765.43;
        System.out.println("Selamat siang...");
        Scanner input = new Scanner(System.in);
        System.out.print("Pesan untuk berapa orang:");
        customerTotal = input.nextInt();
        System.out.print("Pesanan atas nama:");
        customerName = input.next();
        System.out.println();
        System.out.println("Menu Spesial hari ini");
        System.out.println("======================");
        System.out.println();
        System.out.println("   1. Nasi Goreng special                @ Rp "+ nasiGoreng);
        System.out.println("   2. Ayam Bakar Special                 @ Rp "+ ayamBakar);
        System.out.println("   3. Steak Sirloin Special              @ Rp "+ steakSirloin);
        System.out.println("   4. Kwetiaw Siram special              @ Rp "+ kwetiawSiram);
        System.out.println("   5. Kambing Guling special             @ Rp "+ kambingGuling);
        System.out.println();
        System.out.println();
        System.out.println("Pesanan Anda [batas pesanan 0-10 porsi]");
        System.out.print("   1. Nasi Goreng special      = ");
        nasgorOrder = input.nextInt();
        System.out.print("   2. Ayam Bakar Special       = ");
        ayamBakarOrder = input.nextInt();
        System.out.print("   3. Steak Sirloin Special    = ");
        steakOrder = input.nextInt();
        System.out.print("   4. Kwetiaw Siram special    = ");
        kwetiawOrder = input.nextInt();
        System.out.print("   5. Kambing Guling special   = ");
        kambingOrder = input.nextInt();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Selamat menikmati makanan Anda");
        System.out.println(input.nextLine());
        System.out.println("Pembelian :");
        int iteration = 1;
        if(nasgorOrder != 0){
            System.out.println(iteration + ". Nasi Goreng Special         "+ nasgorOrder +" Porsi * Rp "+ nasiGoreng + " = Rp " + nasgorOrder * nasiGoreng);
            iteration++;
        }
        if(ayamBakarOrder != 0){
            System.out.println(iteration + ". Ayam Bakar Special          "+ ayamBakarOrder +" Porsi * Rp "+ ayamBakar + " = Rp " + ayamBakarOrder * ayamBakar);
            iteration++;
        }
        if(steakOrder != 0){
            System.out.println(iteration + ". Steak Sirloin Special       "+ steakOrder +" Porsi * Rp "+ steakSirloin + " = Rp " + steakOrder * steakSirloin);
            iteration++;
        }
        if(kwetiawOrder != 0){
            System.out.println(iteration + ". Kwetiaw Siram Special       "+ kwetiawOrder +" Porsi * Rp "+ kwetiawSiram + " = Rp " + kwetiawOrder * kwetiawSiram);
            iteration++;
        }
        if(kambingOrder != 0){
            System.out.println(iteration + ". Kambing Guling Special      "+ kambingOrder +" Porsi * Rp "+ kambingGuling + " = Rp " + kambingOrder * kambingGuling);
            iteration++;
        }
        double total = (nasgorOrder*nasiGoreng)+(ayamBakarOrder*ayamBakar)+(steakOrder*steakSirloin)+(kwetiawOrder*kwetiawSiram)+(kambingOrder*kambingGuling);
        int disc = 10;
        double hargaDisc = (total * disc) / 100;
        double hargaFinal = total - hargaDisc;
        double priceEachPerson = hargaFinal / customerTotal;
        System.out.println("                                                                           +");
        System.out.println("============================================================================");
        System.out.println("Total pembelian                                         = Rp "+ total );
        System.out.println("Disc. "+disc+"% <Masa Promosi>                                = Rp "+ hargaDisc);
        System.out.println("                                                                           -");
        System.out.println("============================================================================");
        System.out.println("Total pembelian setelah "+disc+"%                             = Rp "+ hargaFinal );
        System.out.println("Pembelian per orang <untuk "+customerTotal+" orang>                    = Rp "+ priceEachPerson );
        System.out.println();
        System.out.println("                         Terima kasih atas kunjungan Anda...");
        System.out.println("                         ...Tekan ENTER untuk keluar");
        System.out.println(input.nextLine());
        System.exit(0);
    }
}