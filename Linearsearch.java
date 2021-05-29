
public class Linearsearch {

    public static void main(String[] args) {
        int data [] = {15, 23, 35, 8, 12, 40};
        int dataDicari = 8;
        int pos = 0;
        
        boolean found = false;
        while (pos < data.length && ! found){
            if (data[pos] == dataDicari) {
            found = true;
        }
        else {
                pos++;
        }
    }
    if (found) {
        System.out.println("Angka ditemukan diposisi : " + pos);
    }else{
        System.out.println("Angka tidak ditemukan ");
    }
    }
    
}
