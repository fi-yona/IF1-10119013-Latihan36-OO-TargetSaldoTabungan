/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */


package if1.pkg10119013.latihan36.oo.targetsaldotabungan;

/**
 *
 * @author Fiona Avila
 */


public class OOTargetSaldoTabungan {
    
    public int awal = 3500000;
    public double besarBunga;
    public double bunga = 0.08;
    
    public void tampilSaldo(){
        int i=1;
        do{
            besarBunga = awal * bunga;
            awal = (int) (awal + besarBunga);
            System.out.println("Saldo pada bulan ke-" + i + " Rp " + awal);
            i++;
        }while(awal<=6000000);
    }
    
    public static void main(String[] args) {
        OOTargetSaldoTabungan tabungan = new OOTargetSaldoTabungan();
        tabungan.tampilSaldo();
    }
    
}
