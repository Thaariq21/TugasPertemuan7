/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.ke.pkg2.meet.pkg7;

/**
 *
 * @author ahmad nur hidaya
 */
public class Member {
    int e;
    private String nama;
    private String idMember;
    private String alamat;
    private int noHp;
    Member[]member = new Member[e];
    
   public String getNama(){return nama;}
   public String getIdMember(){return idMember;}
   public String getAlamat(){return alamat;}
   public int getNoHp(){return noHp;}
   
   
   public void setNama(String nama){ this.nama = nama;}
   public void setIdMember(String idMember) { this.idMember = idMember; }
   public void setAlamat(String alamat) { this.alamat = alamat; }
   public void setNoHp(int noHp) { this.noHp = noHp; }
   public void arrayDataMember() { member = new Member[e]; }
   
   
   public void showDataMember(){ 
       System.out.println("Nama         :"+ getNama());
       System.out.println("ID Member    :"+getIdMember());
       System.out.println("Alamat       :"+getAlamat());
       System.out.println("No Hp        :"+getNoHp());
       System.out.println("");
   }
   public void datadatamember(){
       
   }
   
   
   
}