package canli;

public class Kopek extends Hayvan {
    int yas;
    // Hiç contstructor yazılmadı ise default olan(parametre olamayan) yazılmış varsayılır.
    // Constructor il komutta başka bir constructor çağırmaz ise super() yazılmış varsayılır.
    // this() ile kendi sınıfındaki, super() ile super(extend ettiği)
    // sınıfındaki constructor'lar çağırılabilir.
    // Bir sınıf başka bir sınıftan extent etmiyorsa Object sınıfından extend ettiği varsayılır.
    Kopek() {
        super();
    }
}
