package tugascc27;
public class flesdis {
    public String name;
    public String merk;
    public String kapasiti;
    
    public String name()
    {
        return "Nama pemilik: "+name ;
    }
    
    public String merk()
    {
        return "Merk Flashdisk: "+merk ;
    }
    
    public String kapasiti()
    {
       return "Ukuran Flashdisk: "+kapasiti ;
    }
    
    public flesdis(String name, String merk, String kapasiti){
        this.name = name;
        this.merk = merk;
        this.kapasiti = kapasiti;

    }
}
